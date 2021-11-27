package recursion;

public class Vowels {

    public int getNumberOfVowels(String word) {
        String vowels ="aáeéiíoóöőuúüűAÁEÉIÍOÓÖŐUÚÜŰ";
        int count = 0;
        if (word.length() !=0 && vowels.indexOf(word.charAt(0)) > -1) {
            count++;
        }
        if (word.length() > 1) {
            count += getNumberOfVowels(word.substring(1));
        }
        return count;
    }
}