package introexceptionfinally;

import java.util.Scanner;

public class Numbers {

    public static void main(String[] args) {
        String scanned = "";
        int number = 0;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Adjon meg egy egész számot!");
            try {
                scanned = sc.nextLine();
                number = Integer.parseInt(scanned);
            }
            catch (NumberFormatException nfe) {
                throw new IllegalArgumentException("Not a number: " + scanned, nfe);
            }
            finally {
                System.out.println("End of round.");
            }
        } while (number % 2 != 0);
    }
}