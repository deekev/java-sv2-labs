package constructoroverloading.bus;

public class SimpleTime {

    private int hours;
    private int minutes;

    public SimpleTime(int hours, int minutes) {
        this(hours);
        this.minutes = minutes;
    }
    public SimpleTime(int hours) {
        this.hours = hours;
    }
    public SimpleTime(SimpleTime time){
        this(time.getHours(), time.getMinutes());
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getDifference(SimpleTime time) {
        return getTimeInMinutes() - time.getTimeInMinutes();
    }

    @Override
    public String toString() {
        return hours + ":" + minutes;
    }

    private int getTimeInMinutes() {
        return getHours() * 60 + getMinutes();
    }
}