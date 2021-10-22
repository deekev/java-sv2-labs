package arrayofarrays;

public class DailyValues {

    public int[][] getValues(){
        int[][] daysOfMonth = new int [12][];
        for (int i = 0; i < 12; i++){
            if(i == 0 || i == 2 || i == 4 || i == 6 || i == 7 || i == 9 || i == 11){
                daysOfMonth[i] = new int [31];
            } else if(i == 3 || i == 5 || i == 8 || i == 10){
                daysOfMonth[i] = new int [30];
            } else {
                daysOfMonth[i] = new int [28];
            }
        }
        for (int[] i : daysOfMonth) {
            for (int j : i) {
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }
        return daysOfMonth;
    }


    public static void main(String[] args) {

        DailyValues dailyValues = new DailyValues();
        dailyValues.getValues();
    }
}