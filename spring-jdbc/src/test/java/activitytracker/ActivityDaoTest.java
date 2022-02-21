package activitytracker;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

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
        assertEquals(ActivityType.BASKETBALL, activity.getActivityType());
    }

    @Test
    void testListActivities() {
        List<Activity> activities = dao.listActivities();

        assertEquals(5, activities.size());
        assertEquals(LocalDateTime.of(2020, 8, 10, 11, 12), activities.get(1).getStartTime());
        assertEquals("egész napos bicótúra", activities.get(2).getDescription());
        assertEquals(ActivityType.RUNNING, activities.get(4).getActivityType());
    }

    @Test
    void testSaveActivityAndReturnGeneratedKeys() {
        Activity activity = new Activity(LocalDateTime.of(2021, 2, 23, 9, 56), "séta a kertben a napon", ActivityType.RUNNING);
        Activity expected = dao.saveActivity(activity);

        assertEquals(6, expected.getId());
    }

}