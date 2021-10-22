package arrayofarrays;

public class Rectangle {

    public int[][] rectangleMatrix(int size){
        int[][] array = new int [size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = i;
                System.out.print(array[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        return array;
    }


    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.rectangleMatrix(6);
    }
}