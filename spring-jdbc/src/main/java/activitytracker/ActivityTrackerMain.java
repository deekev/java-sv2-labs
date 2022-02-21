package activitytracker;

import org.flywaydb.core.Flyway;
import org.mariadb.jdbc.MariaDbDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

public class ActivityTrackerMain {


    public static void main(String[] args) {

        ActivityTrackerMain activityTrackerMain = new ActivityTrackerMain();

        MariaDbDataSource dataSource = new MariaDbDataSource();
        try {
            dataSource.setUrl("jdbc:mariadb://localhost:3306/activitytracker?useUnicode=true");
            dataSource.setUser("activitytracker");
            dataSource.setPassword("activitytracker");
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot connect.", sqle);
        }

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        Flyway flyway = Flyway.configure().dataSource(dataSource).load();
        flyway.clean();
        flyway.migrate();

        Activity activity = new Activity(LocalDateTime.now(), "biciklizés", ActivityType.BIKING);
        Activity activity2 = new Activity(LocalDateTime.now(), "túrázás", ActivityType.HIKING);
        Activity activity3 = new Activity(LocalDateTime.now(), "futás", ActivityType.RUNNING);
        Activity activity4 = new Activity(LocalDateTime.now(), "kosárlabdázás", ActivityType.BASKETBALL);

        activityTrackerMain.insertActivity(jdbcTemplate, activity, activity2, activity3, activity4);

        List<Activity> activities = activityTrackerMain.listActivities(jdbcTemplate);
        System.out.println(activities);

        for (Activity actual : activities) {
            System.out.println(activityTrackerMain.selectActivityById(jdbcTemplate, actual.getId()));
        }
    }

    public void insertActivity(JdbcTemplate jdbcTemplate, Activity... activities) {
        for (Activity actual : activities) {
            jdbcTemplate.update("INSERT INTO activities (start_time, description, activity_type) VALUES (?, ?, ?)",
                    Timestamp.valueOf(actual.getStartTime()), actual.getDescription(), actual.getActivityType().toString());
        }
    }

    public List<Activity> listActivities(JdbcTemplate jdbcTemplate) {
        return jdbcTemplate.query("SELECT * FROM activities",
                (rs, rowNum) -> new Activity(rs.getLong("id"), rs.getTimestamp("start_time").toLocalDateTime(),
                        rs.getString("description"), ActivityType.valueOf(rs.getString("activity_type"))));
    }

    public Activity selectActivityById(JdbcTemplate jdbcTemplate, long id) {
        return jdbcTemplate.queryForObject("SELECT * FROM activities WHERE id = ?",
                (rs, rowNum) -> new Activity(rs.getLong("id"), rs.getTimestamp("start_time").toLocalDateTime(),
                        rs.getString("description"), ActivityType.valueOf(rs.getString("activity_type"))), id);
    }
}