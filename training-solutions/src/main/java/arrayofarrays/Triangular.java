package arrayofarrays;

public class Triangular {

   public int[][] triangularMatrix(int size){
       int[][] array = new int [size][];
       for (int i = 0; i < size; i++) {
           array[i] = new int [i+1];
           for (int j = 0; j < i + 1; j++){
               array[i][j] = i;
               System.out.print(array[i][j]);
               System.out.print(" ");
           }
           System.out.println();
       }
       return array;
   }

    public static void main(String args[]) {

        Triangular triangular = new Triangular();
        triangular.triangularMatrix(6);
    }
}


