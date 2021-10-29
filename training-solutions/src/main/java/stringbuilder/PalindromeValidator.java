package stringbuilder;

public class PalindromeValidator {

    public boolean isPalindrome(String word){
        StringBuilder stringBuilder = new StringBuilder(word);
        String reverse = stringBuilder.reverse().toString();
        return word.equalsIgnoreCase(reverse);
    }


    public static void main(String[] args) {

        System.out.println(new PalindromeValidator().isPalindrome("esernyő"));
        System.out.println(new PalindromeValidator().isPalindrome("Mentegetnem"));
    }
}