package activitytracker;

import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;

public class ActivityTrackerMain {

    public static void main(String[] args) {

        MariaDbDataSource dataSource = new MariaDbDataSource();
        try {
            dataSource.setUrl("jdbc:mariadb://localhost:3306/activitytracker?useUnicode=true");
            dataSource.setUser("activitytracker");
            dataSource.setPassword("activitytracker");
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot reach database!", sqle);
        }

        Activity activity = new Activity(LocalDateTime.now(), "biciklizés", ActivityType.BIKING);

        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement stmt =
                        conn.prepareStatement("insert into activities(start_time, activity_desc, activity_type) values (?, ?, ?)")) {
            stmt.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
            stmt.setString(2, activity.getDesc());
            stmt.setString(3, activity.getType().toString());
            stmt.executeUpdate();
        }
        catch (SQLException se) {
            throw new IllegalStateException("Can not insert", se);
        }
    }
}
