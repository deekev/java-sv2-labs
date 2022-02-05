package activity;

import java.util.*;

public class Activities {

    private List<Activity> activities = new ArrayList<>();

    public Activities(List<Activity> activities) {
        this.activities = activities;
    }

    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    public List<Activity> getActivities() {
        return new ArrayList<>(activities);
    }

    public List<Report> distancesByTypes() {
        Map<ActivityType, Double> result = new LinkedHashMap<>();
        fillMap(result);
        for (Activity actual: activities) {
            ActivityType key = actual.getType();
            result.put(key, result.get(key) + actual.getDistance());
        }
        return createReportList(result);
    }

    public int numberOfTrackActivities() {
        return (int) activities.stream()
                .filter(activity -> activity instanceof ActivityWithTrack)
                .count();
    }

    public int numberOfWithoutTrackActivities() {
       return (int) activities.stream()
               .filter(activity -> activity instanceof ActivityWithoutTrack)
               .count();
    }

    private List<Report> createReportList(Map<ActivityType, Double> result) {
        List<Report> reports = new ArrayList<>();
        for (Map.Entry<ActivityType, Double> actual: result.entrySet()) {
            reports.add(new Report(actual.getKey(), actual.getValue()));
        }
        return reports;
    }

    private void fillMap(Map<ActivityType, Double> map) {
        for (ActivityType actual: ActivityType.values()) {
            map.put(actual, 0.0);
        }
    }
}
