package controlselection.accents;

public class WithoutAccents {

    public static final String LETTERS_WITH_ACCENTS = "áéíóöőúüűÁÉÍÓÖŐÚÜŰ";

    public static final String LETTERS_WITHOUT_ACCENTS = "aeiooouuuAEIOOOUUU";

    public char convertToCharWithoutAccents(char letter) {
        int index = LETTERS_WITH_ACCENTS.indexOf(letter);
        if (index >= 0) {
            return LETTERS_WITHOUT_ACCENTS.charAt(index);
        }
        else {
            return letter;
        }
    }
}