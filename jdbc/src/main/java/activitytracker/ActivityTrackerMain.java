package activitytracker;

import org.flywaydb.core.Flyway;
import org.mariadb.jdbc.MariaDbDataSource;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
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
            throw new IllegalStateException("Cannot reach database!", sqle);
        }

        Flyway flyway = Flyway.configure().dataSource(dataSource).load();
        flyway.migrate();


        Activity activity = new Activity(LocalDateTime.now(), "biciklizés", ActivityType.BIKING);
        Activity activity2 = new Activity(LocalDateTime.now(), "túrázás", ActivityType.HIKING);
        Activity activity3 = new Activity(LocalDateTime.now(), "futás", ActivityType.RUNNING);
        Activity activity4 = new Activity(LocalDateTime.now(), "kosárlabdázás", ActivityType.BASKETBALL);

        activityTrackerMain.insertActivity(dataSource, activity);
        activityTrackerMain.insertActivity(dataSource, activity2);
        activityTrackerMain.insertActivity(dataSource, activity3);
        activityTrackerMain.insertActivity(dataSource, activity4);

        List<Activity> activities = activityTrackerMain.queryActivities(dataSource);
        System.out.println(activities);

        for (Activity actual: activities) {
            System.out.println(activityTrackerMain.getActivityById(dataSource, actual.getId()));
        }


    }

    public void insertActivity(DataSource dataSource, Activity activity) {
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement stmt =
                        conn.prepareStatement("insert into activities(start_time, activity_desc, activity_type) values (?, ?, ?)")) {
            stmt.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
            stmt.setString(2, activity.getDescription());
            stmt.setString(3, activity.getType().toString());
            stmt.executeUpdate();
        }
        catch (SQLException se) {
            throw new IllegalStateException("Cannot insert", se);
        }
    }

    public List<Activity> queryActivities(DataSource dataSource) {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement("select * from activities");
             ResultSet resultSet = statement.executeQuery()) {
            return getActivitiesFromResultSet(resultSet);
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot query.", sqle);
        }
    }

    public Activity getActivityById(DataSource dataSource, long id) {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement("select * from activities where id = ?")) {
            statement.setLong(1, id);
            return getActivityFromResultSet(statement);
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot query.", sqle);
        }
    }

    private List<Activity> getActivitiesFromResultSet(ResultSet resultSet) {
        List<Activity> result = new ArrayList<>();
        try {
            while (resultSet.next()) {
                long id = resultSet.getLong("id");
                LocalDateTime time = resultSet.getTimestamp("start_time").toLocalDateTime();
                String description = resultSet.getString("activity_desc");
                ActivityType activityType = ActivityType.valueOf(resultSet.getString("activity_type"));
                result.add(new Activity(id, time, description, activityType));
            }
            return result;
        } catch (SQLException sqle) {
            throw new IllegalArgumentException("Empty list.");
        }
    }

    private Activity getActivityFromResultSet(PreparedStatement statement) {
        try (ResultSet resultSet = statement.executeQuery()) {
            if (resultSet.next()) {
                long id = resultSet.getLong("id");
                LocalDateTime time = resultSet.getTimestamp("start_time").toLocalDateTime();
                String description = resultSet.getString("activity_desc");
                ActivityType activityType = ActivityType.valueOf(resultSet.getString("activity_type"));
                return new Activity(id, time, description, activityType);
            }
            throw new IllegalArgumentException("Empty list.");
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot query.");
        }
    }
}
