package activitytracker;

import java.time.LocalDateTime;

public class Activity {

    private long id;
    private LocalDateTime startTime;
    private String description;
    private ActivityType activityType;

    public Activity(LocalDateTime startTime, String description, ActivityType activityType) {
        this.startTime = startTime;
        this.description = description;
        this.activityType = activityType;
    }

    public Activity(long id, LocalDateTime startTime, String description, ActivityType activityType) {
        this(startTime, description, activityType);
        this.id = id;
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

    public ActivityType getActivityType() {
        return activityType;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "id=" + id +
                ", startTime=" + startTime +
                ", description='" + description + '\'' +
                ", activityType=" + activityType +
                '}';
    }
}
