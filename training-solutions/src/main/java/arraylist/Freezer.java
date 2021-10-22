package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Freezer {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("csirkemell");
        list.add("gomba");
        list.add("borsó");
        list.add("karaj");
        list.add("hal");
        System.out.println(list.size());

        for (String i: list){
            System.out.print(i + " ");
        }
        System.out.println();

        list.remove("gomba");
        list.remove("hal");
        System.out.println(list.size());

        for(String i: list){
            System.out.print(i + " ");
        }
    }
}