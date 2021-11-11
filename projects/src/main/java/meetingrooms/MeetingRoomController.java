package meetingrooms;

import java.util.Scanner;

public class MeetingRoomController {

    Scanner sc = new Scanner(System.in);

    private Office office = new Office();

    private Menu menu = new Menu();

    public void printMenu() {
        System.out.print(menu.getMenu());
        System.out.println();
    }

    public void readOffice() {
        office.addMeetingRoom(createMeetingRoom());
    }

    public void runMenu() {
        printMenu();
        System.out.println();
        selectMenu(askMenu());
    }

    private int askMenu() {
        System.out.println("Adja meg a kiválasztott menüpont számát: ");
        int numberOfMenu = sc.nextInt();
        sc.nextLine();
        System.out.println();
        return numberOfMenu;
    }

    private MeetingRoom createMeetingRoom() {
        System.out.println("Adja meg a tárgyaló paramétereit: ");
        System.out.println("Név:");
        String name = sc.nextLine();
        System.out.println("Hosszúság (m-ben): ");
        int length = sc.nextInt();
        sc.nextLine();
        System.out.println("Szélesség (m-ben): ");
        int width = sc.nextInt();
        sc.nextLine();
        System.out.println();

        MeetingRoom meetingRoom = new MeetingRoom(name, length, width);
        return meetingRoom;
    }

    private void selectMenu(int number) {
        switch (number) {
            case 1:
                readOffice();
                runMenu();
                break;

            case 2:
                office.printNames();
                runMenu();
                break;

            case 3:
                office.printNamesReverse();
                runMenu();
                break;

            case 4:
                office.printEvenNames();
                runMenu();
                break;

            case 5:
                office.printAreas();
                runMenu();
                break;

            case 6:
                System.out.println("Adja meg a tárgyaló nevét:");
                String name = sc.nextLine();
                System.out.println();
                office.printMeetingRoomsWithName(name);
                runMenu();
                break;

            case 7:
                System.out.println("Adja meg a szórészletet:");
                String part = sc.nextLine();
                System.out.println();
                office.printMeetingRoomsContains(part);
                runMenu();
                break;

            case 8:
                System.out.println("Adja meg a tárgyaló területét:");
                int area = sc.nextInt();
                sc.nextLine();
                System.out.println();
                office.printAreasLargerThan(area);
                runMenu();
                break;

            case 9: break;
        }
    }



    public static void main(String[] args) {

        MeetingRoomController meetingRoomController = new MeetingRoomController();
        meetingRoomController.runMenu();
    }
}