package looptypes;

public class Sum {

    public void printSums(int[] numbers){
        for (int i = 2; i <= numbers.length; i++){
            System.out.print((numbers[i-2] + numbers[i-1]) + " ");
        }
    }


    public static void main(String[] args) {

        Sum sum = new Sum();
        int[] numbers = {2, 6, 3, 5, 7, 9};
        sum.printSums(numbers);
    }
}