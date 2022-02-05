package activity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Track {

    private List<TrackPoint> trackPoints = new ArrayList<>();

    public boolean addTrackPoint(TrackPoint trackPoint) {
        return trackPoints.add(trackPoint);
    }

    public List<TrackPoint> getTrackPoints() {
        return new ArrayList<>(trackPoints);
    }

    public Coordinate findMaximumCoordinate() {
        double maxLatitude = findMaxLatitude();
        double maxLongitude = findMaxLongitude();
        return new Coordinate(maxLatitude, maxLongitude);
    }

    public Coordinate findMinimumCoordinate() {
        double minLatitude = findMinLatitude();
        double minLongitude = findMinLongitude();
        return new Coordinate(minLatitude, minLongitude);
    }

    public double getDistance() {
        double fullDistance = 0;
        for (int i = 1; i < trackPoints.size(); i++) {
            fullDistance += (trackPoints.get(i).getDistanceFrom(trackPoints.get(i - 1)));
        }
        return fullDistance;
    }

    public double getFullDecrease() {
        double fullDecrease = 0;
        for (int i = 1; i < trackPoints.size(); i++) {
            double elevationOfActual = trackPoints.get(i).getElevation();
            double elevationOfPrevious = trackPoints.get(i - 1).getElevation();
            if (elevationOfActual < elevationOfPrevious) {
                fullDecrease += (elevationOfPrevious - elevationOfActual);
            }
        }
        return fullDecrease;
    }

    public double getFullElevation() {
        double fullElevation = 0;
        for (int i = 1; i < trackPoints.size(); i++) {
            double elevationOfActual = trackPoints.get(i).getElevation();
            double elevationOfPrevious = trackPoints.get(i - 1).getElevation();
            if (elevationOfActual > elevationOfPrevious) {
                fullElevation += (elevationOfActual - elevationOfPrevious);
            }
        }
        return fullElevation;
    }

    public double getRectangleArea() {
        double sideA = findMaximumCoordinate().getLongitude() - findMinimumCoordinate().getLongitude();
        double sideB = findMaximumCoordinate().getLatitude() - findMinimumCoordinate().getLatitude();
        return sideA * sideB;
    }

    public void loadFromGpx(InputStream inputStream) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            Coordinate coordinate = new Coordinate(0, 0);
            double elevation = 0;
            while ((line = br.readLine()) != null) {
                if (line.trim().startsWith("<trkpt")) {
                    coordinate = createCoordinateFromLine(line);
                }
                if (line.trim().startsWith("<ele")) {
                    elevation = getElevationFromLine(line);
                }
                if (fillTrackPoints(coordinate, elevation)) {
                    coordinate = new Coordinate(0, 0);
                    elevation = 0;
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can't read file");
        }
    }

    private double findMaxLatitude() {
        return trackPoints.stream()
                .max((o1, o2) -> (int) (o1.getCoordinate().getLatitude() - o2.getCoordinate().getLatitude()))
                .get().getCoordinate().getLatitude();
    }

    private double findMinLatitude() {
        return trackPoints.stream()
                .min((o1, o2) -> (int) (o1.getCoordinate().getLatitude() - o2.getCoordinate().getLatitude()))
                .get().getCoordinate().getLatitude();
    }

    private double findMaxLongitude() {
        return trackPoints.stream()
                .max((o1, o2) -> (int) (o1.getCoordinate().getLongitude() - o2.getCoordinate().getLongitude()))
                .get().getCoordinate().getLongitude();
    }

    private double findMinLongitude() {
        return trackPoints.stream()
                .min((o1, o2) -> (int) (o1.getCoordinate().getLongitude() - o2.getCoordinate().getLongitude()))
                .get().getCoordinate().getLongitude();
    }

    private boolean fillTrackPoints(Coordinate coordinate, double elevation) {
        if (Math.abs(elevation) > 0 && (Math.abs(coordinate.getLatitude()) > 0 || Math.abs(coordinate.getLongitude()) > 0)) {
            return addTrackPoint(new TrackPoint(coordinate, elevation));
        } else {
            return false;
        }
    }

    private Coordinate createCoordinateFromLine(String line) {
        double latitude = Double.parseDouble(line.trim().substring(12, 22));
        double longitude = Double.parseDouble(line.trim().substring(29, 39));
        return new Coordinate(latitude, longitude);
    }

    private double getElevationFromLine(String line) {
        return Double.parseDouble(line.trim().substring(5, 10));
    }
}