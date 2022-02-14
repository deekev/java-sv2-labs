package activitytracker;

import java.time.LocalDateTime;

public class Activity {

    private int id;
    private LocalDateTime startTime;
    private String desc;
    private ActivityType type;

    public Activity(LocalDateTime startTime, String desc, ActivityType type) {
        this.startTime = startTime;
        this.desc = desc;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public String getDesc() {
        return desc;
    }

    public ActivityType getType() {
        return type;
    }
}