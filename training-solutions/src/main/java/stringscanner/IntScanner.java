package stringscanner;

import java.util.Scanner;

public class IntScanner {

    public String convertInts(String ints) {
        Scanner scanner = new Scanner(ints).useDelimiter(";");
        StringBuilder stringBuilder = new StringBuilder();
        int number;
        while (scanner.hasNextInt()) {
            number = scanner.nextInt();
            if (number > 100 && scanner.hasNextInt()) {
                stringBuilder.append(number);
                stringBuilder.append(",");
            }
            else if (number > 100) {
                stringBuilder.append(number);
            }
        }
        return stringBuilder.toString();
    }


    public static void main(String[] args) {

        IntScanner intScanner = new IntScanner();
        System.out.println(intScanner.convertInts("5;3;107;12;123;18;198"));
        System.out.println(intScanner.convertInts("154"));
        System.out.println(intScanner.convertInts("5;3;100;12;45;18;98"));
        System.out.println(intScanner.convertInts(""));
    }
}