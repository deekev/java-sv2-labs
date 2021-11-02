package junit5fixture;

import java.util.ArrayList;
import java.util.List;

public class Words {

    private List<String> words = new ArrayList<>();

    public List<String> getWords() {
        return words;
    }

    public void addWord(String word) {
        words.add(word);
    }

    public void getWordsStartWith(String prefix) {
        List<String> wordsNotStartWith = new ArrayList<>();
        for (String s: words) {
            if (!s.startsWith(prefix)) {
                wordsNotStartWith.add(s);
            }
        }
        words.removeAll(wordsNotStartWith);
    }

    public void getWordsWithLength(int length) {
        List<String> wordsWrongLength = new ArrayList<>();
        for (String s: words) {
            if (s.length() != length) {
                wordsWrongLength.add(s);
            }
        }
        words.removeAll(wordsWrongLength);
    }
}