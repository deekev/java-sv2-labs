package stringseparate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IceCream {

    private List<String> iceCreams = new ArrayList<>(Arrays.asList("csoki", "vanília", "eper", "citrom", "puncs"));

    public List<String> getIceCreams() {
        return iceCreams;
    }

    public String getDailyOffer(List<String> list) {
        StringBuilder stringBuilder = new StringBuilder();
        boolean first = true;
        stringBuilder.append("Napi ajánlat: ");
        for (String s: list) {
            if (first) {
                first = false;
                stringBuilder.append(s);
            } else {
                stringBuilder.append(", ");
                stringBuilder.append(s);
            }
        }
        stringBuilder.append(". ");
        stringBuilder.append("Gyerekeknek féláron!");
        return stringBuilder.toString();
    }



    public static void main(String[] args) {

        IceCream iceCream = new IceCream();
        System.out.println(iceCream.getDailyOffer(iceCream.getIceCreams()));
    }
}