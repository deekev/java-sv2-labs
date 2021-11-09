package meetingrooms;

import java.util.Scanner;

public class MeetingRoomController {

    Scanner sc = new Scanner(System.in);

    private Office office = new Office();

    private final String menu =
                    "1. Tárgyaló rögzítése\n" +
                    "2. Tárgyalók sorrendben\n" +
                    "3. Tárgyalók visszafele sorrendben\n" +
                    "4. Minden második tárgyaló\n" +
                    "5. Területek\n" +
                    "6. Keresés pontos név alapján\n" +
                    "7. Keresés névtöredék alapján\n" +
                    "8. Keresés terület alapján\n" +
                    "9. Kilépés";

    public void printMenu() {
        System.out.print(menu);
        System.out.println();
    }

    public void readOffice() {
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
        office.addMeetingRoom(meetingRoom);
    }

    public void runMenu() {
        printMenu();
        System.out.println();
        System.out.println("Adja meg a kiválasztott menüpont számát: ");
        int numberOfMenu = sc.nextInt();
        sc.nextLine();
        System.out.println();
        selectMenu(numberOfMenu);
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
                office.printMeetingRoomsWithName(name);
                runMenu();
                break;

            case 7:
                System.out.println("Adja meg a szórészletet:");
                String part = sc.nextLine();
                office.printMeetingRoomsContains(part);
                runMenu();
                break;

            case 8:
                System.out.println("Adja meg a tárgyaló területét:");
                int area = sc.nextInt();
                sc.nextLine();
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