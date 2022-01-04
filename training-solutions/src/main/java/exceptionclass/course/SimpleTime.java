package exceptionclass.course;

public class SimpleTime {

    private int hour;
    private int minute;

    public SimpleTime(int hour, int minute) {
        setTime(hour, minute);
    }

    public SimpleTime(String time) {
        validateString(time);
        String[] temp = time.split(":");
        try {
            int hour = Integer.parseInt(temp[0]);
            int minute = Integer.parseInt(temp[1]);
            setTime(hour, minute);
        }
        catch (NumberFormatException nfe) {
            throw new InvalidTimeException("Time is not hh:mm", nfe);
        }
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d", this.hour, this.minute);
    }

    private void setTime(int hour, int minute) {
        if (hour < 0 || hour > 23) {
            throw new InvalidTimeException("Hour is invalid (0-23)");
        }
        if (minute < 0 || minute > 59) {
            throw new InvalidTimeException("Minute is invalid (0-59)");
        }
        this.hour = hour;
        this.minute = minute;
    }

    private void validateString(String time) {
        if (time == null) {
            throw new InvalidTimeException("Time is null");
        }
        if (time.length() != "hh:mm".length() || time.charAt(2) != ':') {
            throw new InvalidTimeException("Time is not hh:mm");
        }
    }
}