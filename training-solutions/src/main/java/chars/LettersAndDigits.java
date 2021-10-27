package chars;

public class LettersAndDigits {

    public void printLetterOrDigit(String text) {
        for (char c : text.toCharArray()) {
            System.out.print(c + " : ");
            if (Character.isAlphabetic(c)) {
                System.out.println("betű");
            } else if (Character.isDigit(c)) {
                System.out.println("számjegy");
            } else {
                System.out.println("egyéb karakter");
            }
        }
    }

    public static void main(String[] args) {

        LettersAndDigits text = new LettersAndDigits();
        text.printLetterOrDigit("bfa68fF;X");
    }
}