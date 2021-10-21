package array;

public class ArrayMain {

    public static void main(String[] args) {

        String[] daysOfWeek = {"hétfő", "kedd", "szerda", "csütörtök", "péntek", "szombat", "vasárnap"};
        System.out.println(daysOfWeek[1]);
        System.out.println(daysOfWeek.length);


        int[] powersOf2 = new int[5];
        for (int i = 0; i < powersOf2.length; i++){
            if (i == 0){
                powersOf2[i] = 1;
            } else {
                powersOf2[i] = powersOf2[i-1] * 2;
            }
        }
        for (int powers: powersOf2){
            System.out.print(powers + " ");
        }
        System.out.println();


        boolean[] booleans = new boolean[6];
        for (int i = 0; i < booleans.length; i++){
            if (i == 0){
                booleans[i] = false;
            } else {
                booleans[i] = !booleans[i-1];
            }
        }
        for (boolean array: booleans){
            System.out.print(array + " ");
        }
    }
}