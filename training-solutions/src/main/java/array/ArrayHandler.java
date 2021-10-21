package array;

public class ArrayHandler {

    void addIndexToNumber(int[] source){
        for (int i = 0; i < source.length; i++){
            source[i] = source[i] + i;
        }
    }

    void concatenateIndexToWord(String[] source){
        for (int i = 0; i < source.length; i++){
            source[i] = i + " " + source[i];
        }
    }


    public static void main(String[] args) {

        ArrayHandler arrayHandler = new ArrayHandler();

        int[] numbers = {9, 15, 34, 26, 73, 148};

        arrayHandler.addIndexToNumber(numbers);

        for (int number: numbers) {
            System.out.println(number);
        }

        for (int number: numbers) {
            System.out.print(number + ", ");
        }

        System.out.println();


        String[] strings = {"macska", "ház", "doboz", "fagyi", "napraforgó"};

        arrayHandler.concatenateIndexToWord(strings);

        for (String words: strings) {
            System.out.println(words);
        }

        for (String words: strings) {
            System.out.print(words + ", ");
        }
    }
}