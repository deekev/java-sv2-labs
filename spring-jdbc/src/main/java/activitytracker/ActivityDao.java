package activitytracker;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.List;

public class ActivityDao {

    private JdbcTemplate jdbcTemplate;

    public ActivityDao(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public Activity saveActivity(Activity activity) {
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(connection -> {
            PreparedStatement stmt = connection.prepareStatement("INSERT INTO activities (start_time, description, activity_type) VALUES (?, ?, ?)",
                    Statement.RETURN_GENERATED_KEYS);
            setPreparedStatement(activity, stmt);
            return stmt;
        }, keyHolder);
        long id = keyHolder.getKey().longValue();
        return new Activity(id, activity.getStartTime(), activity.getDescription(), activity.getActivityType());
    }

    public Activity findActivityById(long id) {
        return jdbcTemplate.queryForObject("SELECT * FROM activities WHERE id = ?",
                (rs, rowNum) -> new Activity(rs.getLong("id"), rs.getTimestamp("start_time").toLocalDateTime(),
                        rs.getString("description"), ActivityType.valueOf(rs.getString("activity_type"))), id);
    }

    public List<Activity> listActivities() {
        return jdbcTemplate.query("SELECT * FROM activities",
                (rs, rowNum) -> new Activity(rs.getLong("id"), rs.getTimestamp("start_time").toLocalDateTime(),
                        rs.getString("description"), ActivityType.valueOf(rs.getString("activity_type"))));
    }

    private void setPreparedStatement(Activity activity, PreparedStatement stmt) throws SQLException {
        stmt.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
        stmt.setString(2, activity.getDescription());
        stmt.setString(3, activity.getActivityType().toString());
    }
}
