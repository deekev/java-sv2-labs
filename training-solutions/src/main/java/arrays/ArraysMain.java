package arrays;

import java.util.Arrays;

public class ArraysMain {

    public String numberOfDaysAsString(){
        int[] numberOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return Arrays.toString(numberOfDays);
    }

    public String multiplicationTableAsString(int size){
        int[][] multiplicationTable = new int[size][size];
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                multiplicationTable[i][j] = (i + 1) * (j + 1);
            }
        }
        return Arrays.deepToString(multiplicationTable);
    }

    public boolean sameTempValues(double[] day, double[] anotherDay){
        return Arrays.equals(day, anotherDay);
    }

    public boolean sameTempValuesDaylight(double[] day, double[] anotherDay){
        if(day.length != anotherDay.length) {
            int min = Math.min(day.length, anotherDay.length);
            return Arrays.equals(Arrays.copyOfRange(day, 0, min), Arrays.copyOfRange(anotherDay, 0, min));
        } else {
            return Arrays.equals(day, anotherDay);
        }
    }

    public boolean wonLottery(int[] markedNumbers, int[] winningNumbers){
        int[] copyOfMarkedNumbers = Arrays.copyOf(markedNumbers, markedNumbers.length);
        int[] copyOfWinningNumbers = Arrays.copyOf(winningNumbers, winningNumbers.length);
        Arrays.sort(copyOfMarkedNumbers);
        Arrays.sort(copyOfWinningNumbers);
        return Arrays.equals(copyOfMarkedNumbers, copyOfWinningNumbers);
    }



    public static void main(String[] args) {

        ArraysMain array = new ArraysMain();

        System.out.println(array.numberOfDaysAsString());
        System.out.println(array.multiplicationTableAsString(3));

        double[] day = {3.4, 5.6, 6.9, 8.1, 10.3, 12.5, 15.6, 18.7, 20.8, 21.6, 23.4, 25.8, 25.1, 24.8, 23.6, 21.9, 17.7, 14.9, 12.6, 10.8, 8.6, 6.4, 5.1, 4.2, 3.8, 5.6};
        double[] anotherDay = {3.4, 5.6, 6.9, 8.1, 10.3, 12.5, 15.6, 18.7, 20.8, 21.6, 23.4, 25.8, 25.1, 24.8, 23.6, 21.9, 17.7, 14.9, 12.6, 10.8, 8.6, 6.4, 5.1, 4.2};
        System.out.println(array.sameTempValues(day, anotherDay));

        System.out.println(array.sameTempValuesDaylight(day, anotherDay));

        int[] markedNumbers = {23, 45, 11, 38, 27};
        int[] winningNumbers = {27, 11, 45, 38, 23};
        System.out.println(array.wonLottery(markedNumbers, winningNumbers));

        for (int each: markedNumbers){
            System.out.print(each + " ");
        }
        System.out.println();

        for (int each: winningNumbers){
            System.out.print(each + " ");
        }
    }
}