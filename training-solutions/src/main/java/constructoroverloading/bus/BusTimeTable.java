package constructoroverloading.bus;

import java.util.ArrayList;
import java.util.List;

public class BusTimeTable {

    private List<SimpleTime> timeTable = new ArrayList<>();

    public BusTimeTable(List<SimpleTime> timeTable) {
        this.timeTable = timeTable;
    }

    public BusTimeTable(int firstHour, int lastHour, int everyMinute) {
        for (int i = 0; i <= lastHour - firstHour; i++) {
            timeTable.add(new SimpleTime(firstHour + i, everyMinute));
        }
    }

    public List<SimpleTime> getTimeTable() {
        return timeTable;
    }

    public SimpleTime getNextBus(SimpleTime actual) {
        for (SimpleTime time: timeTable) {
            if (actual.getDifference(time) < 0) {
                return time;
            }
        }
        throw new IllegalStateException("No more buses today!");
    }
}