package activitytracker;

import java.time.LocalDateTime;
import java.util.List;

public class Activity {

    private long id;
    private LocalDateTime startTime;
    private String description;
    private ActivityType type;
    private List<TrackPoint> trackPoints;

    public Activity(long id, LocalDateTime startTime, String description, ActivityType type, List<TrackPoint> trackPoints) {
        this(id, startTime, description, type);
        this.trackPoints = trackPoints;
    }

    public Activity(LocalDateTime startTime, String description, ActivityType type, List<TrackPoint> trackPoints) {
        this(startTime, description, type);
        this.trackPoints = trackPoints;
    }

    public Activity(long id, LocalDateTime startTime, String description, ActivityType type) {
        this(startTime, description, type);
        this.id = id;
    }

    public Activity(LocalDateTime startTime, String description, ActivityType type) {
        this.startTime = startTime;
        this.description = description;
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public String getDescription() {
        return description;
    }

    public ActivityType getType() {
        return type;
    }

    public List<TrackPoint> getTrackPoints() {
        return trackPoints;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "id=" + id +
                ", startTime=" + startTime +
                ", desc='" + description + '\'' +
                ", type=" + type +
                '}';
    }
}