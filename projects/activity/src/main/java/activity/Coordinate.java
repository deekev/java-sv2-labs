package activity;

public class Coordinate {

    private static final double MAX_LATITUDE = 90;
    private static final double MAX_LONGITUDE = 180;


    private double latitude;
    private double longitude;

    public Coordinate(double latitude, double longitude) {
        if(!isLatitudeValid(latitude)) {
            throw new IllegalArgumentException("Latitude must be between 90 and -90: " + latitude);
        }
        if (!isLongitudeValid(longitude)) {
            throw new IllegalArgumentException("Longitude must be between 180 and -180: " + longitude);
        }
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    private boolean isLatitudeValid(double latitude) {
        return Math.abs(latitude) <= MAX_LATITUDE;
    }

    private boolean isLongitudeValid(double longitude) {
        return Math.abs(longitude) <= MAX_LONGITUDE;
    }
}
