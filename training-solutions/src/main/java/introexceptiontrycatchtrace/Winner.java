package introexceptiontrycatchtrace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Winner {

    private List<String> names = new ArrayList<>(Arrays.asList("John Doe", "Jane Doe", "Jack Black", null, "Jim Beam"));

    public String getWinner() {
        int number = new Random().nextInt(names.size());
        return names.get(number).toUpperCase();
    }
}