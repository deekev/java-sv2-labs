package literals;

public class LiteralsMain {

    public static void main(String args[]) {

        //Öszefűzés
        System.out.println("1" + "2");
        System.out.println(1 + "" + 2);
        System.out.println(Integer.toString(1) + Integer.toString(2));

        //Osztás
        double quotient = 3 / 4;
        System.out.println(quotient);
        quotient = 3.0 / 4.0;
        System.out.println(quotient);
        quotient = 3D / 4D;
        System.out.println(quotient);

        //Nagy szám
        long big = 3_244_444_444L;
        System.out.println(big);

        //String mint objektum
        String word = "title".toUpperCase();
        System.out.println(word);

        //Szám bináris stringként
        System.out.println(Integer.toString(1, 2));
        System.out.println(Integer.toString(2, 2));
        System.out.println(Integer.toBinaryString(1));
        System.out.println(Integer.toBinaryString(2));
    }
}