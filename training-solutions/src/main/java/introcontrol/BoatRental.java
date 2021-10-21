package introcontrol;

import java.util.Scanner;

public class BoatRental {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfBoats = 3;
        int numberOfSeats = 10;
        int boat1 = 5;
        int boat2 = 3;
        int boat3 = 2;

        System.out.println("Hány fős a csoport:");
        int members = scanner.nextInt();

        if(members > 3){
            numberOfSeats -= boat1;
            numberOfBoats -= 1;
            System.out.println("1-es kiadva");
        }

        if( members == 3 || members >= 8){
            numberOfSeats -= boat2;
            numberOfBoats -= 1;
            System.out.println("2-es kiadva");
        }

        if(members < 3 || members == 6 || members == 7 || members > 8){
            numberOfSeats -= boat3;
            numberOfBoats -= 1;
            System.out.println("3-as kiadva");
        }

        if(numberOfSeats > 0 || members <= 10){
            System.out.println("Még " + numberOfSeats + " főnek van hely " + numberOfBoats + " csónakban.");
        } else {
            int left = members - 10;
            System.out.println(left + " fő várakozik.");
        }
    }
}