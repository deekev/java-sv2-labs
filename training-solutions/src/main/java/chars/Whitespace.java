package chars;

public class Whitespace {

    public String makeWhitespaceToStar(String text) {
        char[] textToArray = text.toCharArray();
        for(char i = 0; i < textToArray.length; i++) {
            if(Character.isWhitespace(textToArray[i])){
                textToArray[i] = '*';
            }
        }
        return new String(textToArray);
    }


    public static void main(String[] args) {

        Whitespace text = new Whitespace();
        System.out.println(text.makeWhitespaceToStar("  Nem látható karakterek cseréje  "));
    }
}