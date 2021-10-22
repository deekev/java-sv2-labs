package arrayofarrays;

public class ArrayOfArrays {

    public void printArrayOfArrays(int[][] array){
        for (int[] i : array) {
            for (int j : i) {
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        ArrayOfArrays array = new ArrayOfArrays();

        int[][] testArray = {{0, 1, 2}, {0, 1, 2}, {0, 1, 2}, {0, 1, 2}};
        array.printArrayOfArrays(testArray);
    }
}