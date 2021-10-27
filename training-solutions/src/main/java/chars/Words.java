package chars;

public class Words {

    public void pushWord(String word) {
        char[] wordToArray = word.toCharArray();
        for(char i = 0; i < wordToArray.length; i++) {
            wordToArray[i] = (char)(wordToArray[i] + 1);
        }
        System.out.println(wordToArray);
    }


    public static void main(String[] args) {

        Words word = new Words();
        word.pushWord("alma");
    }
}