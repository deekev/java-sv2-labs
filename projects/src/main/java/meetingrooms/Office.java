package meetingrooms;

import java.util.ArrayList;
import java.util.List;

public class Office {

    private List<MeetingRoom> meetingRooms = new ArrayList<>();

    public void addMeetingRoom (MeetingRoom meetingRoom) {
        meetingRooms.add(meetingRoom);
    }

    public void printNames() {
        for (MeetingRoom actual: meetingRooms) {
            System.out.println(actual.getName());
        }
        System.out.println();
    }

    public void printNamesReverse() {
        for (int i = meetingRooms.size() - 1; i >= 0; i--) {
            System.out.println(meetingRooms.get(i).getName());
        }
        System.out.println();
    }

    public void printEvenNames() {
        for (int i = 0; i < meetingRooms.size(); i += 2) {
            System.out.println(meetingRooms.get(i).getName());
        }
        System.out.println();
    }

    public void printAreas() {
        for (MeetingRoom actual: meetingRooms) {
            System.out.printf("név: %s, hosszúság: %d m, szélesség: %d m , terület: %d m2",
                    actual.getName(), actual.getLength(), actual.getWidth(), actual.getArea());
            System.out.println();
        }
        System.out.println();
    }

    public void printMeetingRoomsWithName(String name) {
        for (MeetingRoom actual: meetingRooms) {
            if (name.equals(actual.getName())){
                System.out.printf("hosszúság: %d m, szélesség: %d m , terület: %d m2",
                         actual.getLength(), actual.getWidth(), actual.getArea());
                System.out.println();
            }
        }
        System.out.println();
    }

    public void printMeetingRoomsContains(String part) {
        for (MeetingRoom actual: meetingRooms) {
            if (actual.getName().toLowerCase().contains(part.toLowerCase())){
                System.out.printf("hosszúság: %d m, szélesség: %d m , terület: %d m2",
                        actual.getLength(), actual.getWidth(), actual.getArea());
                System.out.println();
            }
        }
        System.out.println();
    }

    public void printAreasLargerThan(int area) {
        for (MeetingRoom actual: meetingRooms) {
            if (actual.getArea() > area) {
                System.out.printf("név: %s, hosszúság: %d m, szélesség: %d m , terület: %d m2",
                        actual.getName(), actual.getLength(), actual.getWidth(), actual.getArea());
                System.out.println();
            }
        }
        System.out.println();
    }
}