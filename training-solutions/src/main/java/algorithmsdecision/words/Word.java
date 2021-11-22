package algorithmsdecision.words;

import java.util.List;

public class Word {

    public boolean containsLongerWord(List<String> words, String sample) {
        for (String actual: words) {
            if (actual.length() > sample.length()) {
                return true;
            }
        }
        return false;
    }
}