package algorithms;

import java.util.ArrayList;
import java.util.List;

public class Sentences {

    public static final List<Character> ENDING_MARKS = List.of('.', '?', '!');
    private List<String> sentences = new ArrayList<>();

    public List<String> getSentences() {
        return new ArrayList<>(sentences);
    }

    public void addSentence(String sentence) {
        if (isStartingWithCapital(sentence) && isEndingWithMark(sentence)) {
            sentences.add(sentence);
        }
    }

    public String findLongestSentence() {
        validateList();
        String longest = sentences.get(0);
        for (String s: sentences) {
            if (s.length() > longest.length()) {
                longest = s;
            }
        }
        return longest;
    }

    private boolean isStartingWithCapital (String sentence) {
        if (Character.isUpperCase(sentence.charAt(0))) {
            return true;
        }
        throw new IllegalArgumentException("Sentence must start with capital!");
    }

    private boolean isEndingWithMark (String sentence) {
        if (ENDING_MARKS.contains(sentence.charAt(sentence.length() - 1))) {
            return true;
        }
        throw new IllegalArgumentException("Sentence must end with ending mark!");
    }

    private void validateList() {
        if (sentences.size() == 0) {
            throw new IllegalStateException("List is empty!");
        }
    }
}