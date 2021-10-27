package enumtype.firstenum;

import java.util.Arrays;

public class FirstEnumMain {

    public static void main(String[] args) {

        //Kontinensek
        for (Continent c: Continent.values()) {
            System.out.println(c);
        }

        Continent[] continents = Continent.values();
        System.out.println(Arrays.toString(continents));


        //Óceánok
        System.out.println(Ocean.valueOf("ARCTIC"));
        System.out.println(Ocean.valueOf("ATLANTIC"));
        System.out.println(Ocean.valueOf("INDIAN"));
        System.out.println(Ocean.valueOf("PACIFIC"));
        System.out.println(Ocean.valueOf("SOUTHERN"));


        //Foci
        System.out.println(Football.GOALKEEPER.name());
        System.out.println(Football.RIGHT_FULLBACK.name());
        System.out.println(Football.LEFT_FULLBACK.name());
        System.out.println(Football.CENTER_BACK.name());
        System.out.println(Football.DEFENDING_MIDFIELDER.name());
        System.out.println(Football.RIGHT_WINGER.name());
        System.out.println(Football.LEFT_WINGER.name());
        System.out.println(Football.STRIKER.name());

    }
}