package aslist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sequence {

    public static void main(String[] args) {

        List<Integer> elements = new ArrayList<>(Arrays.asList(2, 3));
        int numberOfNewListItems = 5;
        int index = elements.size();
        for (int i = 0; i < numberOfNewListItems; i++){
            elements.add(index, elements.get(index-2) * elements.get(index-1));
            index++;
        }
        System.out.println(elements.size());
        for (int i: elements){
            System.out.print(i + ", ");
        }
    }
}