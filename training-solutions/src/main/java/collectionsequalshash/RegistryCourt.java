package collectionsequalshash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RegistryCourt {

    public static void main(String[] args) {

        List<Company> companies = new ArrayList<>(Arrays.asList(new Company("A-holding", "11456895-2-10"),
                new Company("B-group", "15897463-4-12")));

        Company company = new Company("C-bank", "45698723-5-30");
        Company anotherCompany = new Company("D-day", "194578634-7-25");

        companies.add(company);
        companies.add(anotherCompany);

        System.out.println(companies.contains(new Company("B-group", "15897463-4-12")));
        System.out.println(companies.contains(new Company("D-day", "194578634-7-25")));

        System.out.println(companies.contains(new Company("Electron", "15647")));
    }
}