package packages.namemain;

import packages.firstname.FirstName;
import packages.lastname.LastName;
import packages.prefix.Prefix;

public class NameMain {

    public static void main(String[] args) {

        Prefix prefix = new Prefix("Dr.");
        LastName lastName = new LastName("Varga");
        FirstName firstName = new FirstName("István");

        System.out.println(prefix.getPre() + " " + lastName.getLast() + " " + firstName.getFirst());
    }
}
