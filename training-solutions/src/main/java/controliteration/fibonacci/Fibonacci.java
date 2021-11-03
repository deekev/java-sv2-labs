package controliteration.fibonacci;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Adjon meg egy pozitív egész számot!");
        System.out.println("az alkalmazás a Fibonacci sorozatnak az Ön által megadott számú elemét írja ki a konzolra!");

        int numberOfElements = scanner.nextInt();
        int[] element = new int[numberOfElements];
        for (int i = 0; i < numberOfElements; i ++) {
            if (i <= 1) {
                element[i] = i;
            } else {
                element[i] = element[i-2] + element[i-1];
            }
        }
        System.out.println(Arrays.toString(element));

        int[] numbers = new int[numberOfElements];
        int count = 0;
        while (count < numberOfElements) {
            if (count <= 1) {
                numbers[count] = count;
                count++;
            } else {
                numbers[count] = numbers[count - 2] + numbers[count - 1];
                count++;
            }
        }
        System.out.println(Arrays.toString(numbers));

        int[] fibonacci = new int[numberOfElements];
        int grow = 0;
        do {
            if (grow <= 1) {
                fibonacci[grow] = grow;
                grow++;
            } else {
                fibonacci[grow] = fibonacci[grow - 2] + fibonacci [grow - 1];
                grow++;
            }
        } while (grow < numberOfElements);
        System.out.println(Arrays.toString(fibonacci));
    }
}