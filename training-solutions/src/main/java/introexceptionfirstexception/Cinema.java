package introexceptionfirstexception;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Mozijegy vásárláshoz adja meg az adatokat.");
        System.out.println("Név:");
        String name = sc.nextLine();

        System.out.println("Választott film címe:");
        String title = sc.nextLine();

        System.out.println("Hány jegyet vásárol:");
        int numberOfTickets = sc.nextInt();
        sc.nextLine();

        System.out.println("Melyik sorba kéri a jegyet (1-től 10-ig):");
        int numberOfRow = sc.nextInt();
        sc.nextLine();
        System.out.println();

        StringBuilder stringBuilder = new StringBuilder("A mozijegy.hu rendszerben vásárolt jegyek adatai a következők: \n");
        stringBuilder.append("Vásárló neve: ").append(name).append("\n").append("Film címe: ").append(title).append("\n")
                .append("Lefoglalt helyek: ");

        for (int i = 1; i <= numberOfTickets; i++) {
            if (i != numberOfTickets) {
                stringBuilder.append(numberOfRow).append(". sor ").append(i).append(". szék, ");
            }
            else {
                stringBuilder.append(numberOfRow).append(". sor ").append(i).append(". szék\n");
            }
        }

        stringBuilder.append("Jó szórakozást!");
        System.out.println(stringBuilder);
    }
}