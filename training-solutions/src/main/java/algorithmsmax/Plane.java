package algorithmsmax;

public class Plane {

    public int getLongestOcean(String map) {
        int count = 0;
        int longestOcean = 0;
        for (int i = 0; i < map.length(); i++) {
            if (map.charAt(i) == '0') {
                count++;
            }
            else {
                if (longestOcean < count) {
                    longestOcean = count;
                }
                count = 0;
            }
        }
        return longestOcean;
    }
}