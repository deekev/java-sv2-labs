package collectionsmap;

import java.util.Map;

public class Casting {

    public String callNextApplicant(int lastNumber, Map<Integer, String> applicants) {
        int nextNumber = Integer.MAX_VALUE;
        int smallestNumber = Integer.MAX_VALUE;
        for (int i: applicants.keySet()) {
            if (i < smallestNumber) {
                smallestNumber = i;
            }
            if (i > lastNumber && i < nextNumber) {
                    nextNumber = i;
            }
        }
        if (nextNumber < Integer.MAX_VALUE) {
            return applicants.get(nextNumber);
        }
        return applicants.get(smallestNumber);
    }
}