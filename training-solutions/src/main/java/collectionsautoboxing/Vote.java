package collectionsautoboxing;

import java.util.HashMap;
import java.util.Map;

public class Vote {

    public Map<VoteResult, Integer> getResult(Map<String, VoteResult> votesPerPerson) {
        Map<VoteResult, Integer> result = new HashMap<>();
        for (VoteResult actual: votesPerPerson.values()) {
            if (!result.containsKey(actual)) {
                result.put(actual, 1);
            } else {
                result.put(actual, result.get(actual) + 1);
            }
        }
        return result;
    }
}