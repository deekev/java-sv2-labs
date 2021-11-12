package introexceptiontrycatchtrace;

public class Jackpot {

    public static void main(String[] args) {

        System.out.println("Today the winner is:");
        try {
            System.out.println(new Winner().getWinner());
        }
        catch (NullPointerException npe) {
            System.out.println("NOBODY");
        }
    }
}