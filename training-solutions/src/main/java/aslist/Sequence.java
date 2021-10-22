package aslist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sequence {

    public static void main(String[] args) {

        List<Integer> elements = new ArrayList<>(Arrays.asList(2, 3));
        int index = elements.size();
        for (int i = 0; i < 5; i++){
            elements.add(index, elements.get(index-2) * elements.get(index-1));
            index++;
        }
        for (int i: elements){
            System.out.print(i + ", ");
        }
    }
}