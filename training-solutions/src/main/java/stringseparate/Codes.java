package stringseparate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Codes {

    private List<String> codes = new ArrayList<>(Arrays.asList("T57fbj", "125Ks63", "xtcu45", "8xQ697", "f578GVHd"));

    public List<String> getCodes() {
        return codes;
    }

    public String getCodesStartWithLetter(List<String> codes) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Betűvel kezdődő kódok: ");
        for (int i = 0; i < codes.size(); i++) {
            if (Character.isAlphabetic(codes.get(i).charAt(0))){
                if (i != (codes.size() - 1)) {
                    stringBuilder.append(codes.get(i));
                    stringBuilder.append(", ");
                } else {
                    stringBuilder.append(codes.get(i));
                }
            }
        }
        return stringBuilder.toString();
    }



    public static void main(String[] args) {

        Codes codes = new Codes();
        System.out.println(codes.getCodesStartWithLetter(codes.getCodes()));
    }
}