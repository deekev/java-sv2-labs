package introexceptionfirstexception;

import java.util.Arrays;
import java.util.List;

public class Message {

    public static void main(String[] args) {

        List<String> codedMessage = Arrays.asList("76", "101", "103", "121", "101", "110", "32",
                "115", "122", "233", "112", "32", "110", "97", "112", "111", "100", "33");

        char[] letters = new char[codedMessage.size()];

        for (int i = 0; i < codedMessage.size(); i++) {
            letters[i] = (char) Integer.parseInt(codedMessage.get(i));
        }

        System.out.println(new String(letters));



        List<String> anotherCodedMessage = Arrays.asList("69", "122", "32", "101", "103", "121",
                "32", "104", "105", "98", "225", "115", "32", "252", "122", /*"1O1"*/ "101", "110", "101", "116", "46");

        char [] anotherLetters = new char[anotherCodedMessage.size()];

        for (int i = 0; i < anotherCodedMessage.size(); i++) {
            anotherLetters[i] = (char) Integer.parseInt(anotherCodedMessage.get(i));
        }

        System.out.println(new String(anotherLetters));

        /*
        Hol keletkezik a kivétel és miért?

        Exception in thread "main" java.lang.NumberFormatException: For input string: "1O1"
	    at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
	    at java.base/java.lang.Integer.parseInt(Integer.java:668)
	    at java.base/java.lang.Integer.parseInt(Integer.java:786)
	    at introexceptionfirstexception.Message.main(Message.java:27)

	    A lista 15. indexű eleme nem 101, hanem 1O1 (nagy O betű), ezért nem alakítható számmá.
         */
    }
}
