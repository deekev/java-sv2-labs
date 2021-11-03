package controlselection.consonant;

public class ToConsonant {

    public char returnConsonant (char letter) {
        switch (letter) {
            case 'a' :
                return 'a' + 1;
            case 'e' :
                return 'e' + 1;
            case 'i' :
                return 'i' + 1;
            case 'o' :
                return 'o' + 1;
            case 'u' :
                return 'u' + 1;
            default:
                return letter;
        }
    }
}