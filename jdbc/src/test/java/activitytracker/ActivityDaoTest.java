package activitytracker;

import org.flywaydb.core.Flyway;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;


class ActivityDaoTest {

    ActivityDao dao;

    @BeforeEach
    void setUp() throws SQLException {
        MariaDbDataSource dataSource = new MariaDbDataSource();
        dataSource.setUrl("jdbc:mariadb://localhost:3306/activitytracker?useUnicode=true");
        dataSource.setUser("activitytracker");
        dataSource.setPassword("activitytracker");

        Flyway fw = Flyway.configure().dataSource(dataSource).load();
        fw.clean();
        fw.migrate();

        dao = new ActivityDao(dataSource);

        Activity activity1 = new Activity(LocalDateTime.of(2021, 2, 22, 15, 35), "futás a parkban", ActivityType.RUNNING);
        dao.saveActivity(activity1);
        Activity activity2 = new Activity(LocalDateTime.of(2020, 8, 10, 11, 12), "Egész héten Zemplén!!!", ActivityType.HIKING);
        dao.saveActivity(activity2);
        Activity activity3 = new Activity(LocalDateTime.of(2020, 10, 2, 8, 15), "egész napos bicótúra", ActivityType.BIKING);
        dao.saveActivity(activity3);
        Activity activity4 = new Activity(LocalDateTime.of(2021, 1, 22, 9, 46), "meccs az iskola tornatermében", ActivityType.BASKETBALL);
        dao.saveActivity(activity4);
        Activity activity5 = new Activity(LocalDateTime.of(2020, 12, 22, 7, 52), "kis kör a tó körül", ActivityType.RUNNING);
        dao.saveActivity(activity5);
    }

    @Test
    void testFindActivityById() {
        Activity activity = dao.findActivityById(4);


        assertEquals(LocalDateTime.of(2021, 1, 22, 9, 46), activity.getStartTime());
        assertEquals("meccs az iskola tornatermében", activity.getDescription());
        assertEquals(ActivityType.BASKETBALL, activity.getType());
    }

    @Test
    void testListActivities() {
        List<Activity> activities = dao.listActivities();

        assertEquals(5, activities.size());
        assertEquals(LocalDateTime.of(2020, 8, 10, 11, 12), activities.get(1).getStartTime());
        assertEquals("egész napos bicótúra", activities.get(2).getDescription());
        assertEquals(ActivityType.RUNNING, activities.get(4).getType());
    }

    @Test
    void testSaveActivityAndReturnGeneratedKeys() {
        Activity activity = new Activity(LocalDateTime.of(2021, 2, 23, 9, 56), "séta a kertben a napon", ActivityType.RUNNING);
        Activity expected = dao.saveActivity(activity);

        assertEquals(6, expected.getId());
    }

    @Test
    void testSaveActivityWithTrackPointsEverythingIsOK() {
        TrackPoint trackPoint1 = new TrackPoint(LocalDate.of(2021, 2, 24), 47.2181020, 18.5411940);
        TrackPoint trackPoint2 = new TrackPoint(LocalDate.of(2021, 2, 24), 47.2181230, 18.5411780);
        TrackPoint trackPoint3 = new TrackPoint(LocalDate.of(2020, 12, 14), 47.2302470, 18.5472280);
        TrackPoint trackPoint4 = new TrackPoint(LocalDate.of(2020, 12, 14), 47.2302550, 18.5472310);
        TrackPoint trackPoint5 = new TrackPoint(LocalDate.of(2020, 12, 14), 47.2302552, 18.5472312);
        List<TrackPoint> trackPoints = Arrays.asList(trackPoint1, trackPoint2, trackPoint3, trackPoint4, trackPoint5);
        Activity activity = new Activity(LocalDateTime.of(2020, 12, 14, 15, 30), "laza délutáni futás", ActivityType.RUNNING, trackPoints);

        dao.saveActivityAndSaveTrackPoints(activity);
        Activity expected = dao.findActivityWithTrackPointsById(6);

        assertTrue(activity.getStartTime().equals(expected.getStartTime()));
        assertTrue(activity.getDescription().equals(expected.getDescription()));
        assertTrue(activity.getType().equals(expected.getType()));
        assertTrue(activity.getTrackPoints().size() == expected.getTrackPoints().size());
        assertTrue(expected.getTrackPoints().equals(trackPoints));
    }

    @Test
    void testSaveActivitywithTrackPointsSomethingIsWrong() {
        TrackPoint trackPoint1 = new TrackPoint(LocalDate.of(2021, 2, 24), 47.2181020, 18.5411940);
        TrackPoint trackPoint2 = new TrackPoint(LocalDate.of(2021, 2, 24), 47.2181230, 18.5411780);
        TrackPoint trackPoint3 = new TrackPoint(LocalDate.of(2020, 12, 14), 47.2302470, 15238.5472280);
        TrackPoint trackPoint4 = new TrackPoint(LocalDate.of(2020, 12, 14), 47.2302550, 18.5472310);
        List<TrackPoint> trackpoints = Arrays.asList(trackPoint1, trackPoint2, trackPoint3, trackPoint4);
        Activity activity = new Activity(LocalDateTime.of(2020, 12, 14, 15, 30), "laza délutáni futás", ActivityType.RUNNING, trackpoints);

        Exception ex1 = assertThrows(IllegalArgumentException.class, () -> dao.saveActivityAndSaveTrackPoints(activity));
        assertEquals("Transaction not succeeded!", ex1.getMessage());

        Exception ex2 = assertThrows(IllegalArgumentException.class, () -> dao.findActivityWithTrackPointsById(6));
        assertEquals("No activity with this id.", ex2.getMessage());
    }
}