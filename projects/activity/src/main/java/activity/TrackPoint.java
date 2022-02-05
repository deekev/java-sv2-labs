package activity;

public class TrackPoint {

    private static final double RADIUS = 6371;

    private Coordinate coordinate;
    private double elevation;

    public TrackPoint(Coordinate coordinate, double elevation) {
        this.coordinate = coordinate;
        this.elevation = elevation;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public double getElevation() {
        return elevation;
    }

    public double getDistanceFrom(TrackPoint point) {

        double latDistance = getLatitudeDistance(point);
        double lonDistance = getLongitudeDistance(point);
        double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
                + Math.cos(Math.toRadians(this.coordinate.getLatitude()))
                * Math.cos(Math.toRadians(point.coordinate.getLatitude()))
                * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distance = RADIUS * c * 1000;

        double height = this.elevation - point.elevation;

        distance = Math.pow(distance, 2) + Math.pow(height, 2);

        return Math.sqrt(distance);
    }

    private double getLatitudeDistance(TrackPoint point) {
        double lat1 = this.coordinate.getLatitude();
        double lat2 = point.coordinate.getLatitude();
        return Math.toRadians(lat2 - lat1);
    }

    private double getLongitudeDistance(TrackPoint point) {
        double lon1 = this.coordinate.getLongitude();
        double lon2 = point.coordinate.getLongitude();
        return Math.toRadians(lon2 - lon1);
    }
}
