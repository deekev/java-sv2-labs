package stringconcat.nameconcat;

public class NameMain {

    public static void main(String[] args) {
        Name nameFirst = new Name("Kovács", "Tamás", "Péter", Title.DR);
        System.out.println(nameFirst.concatNameHungarianStyle());
        System.out.println(nameFirst.concatNameWesternStyle());

        Name nameSecond = new Name("Tóth", "Lilla", "");
        System.out.println(nameSecond.concatNameHungarianStyle());
        System.out.println(nameSecond.concatNameWesternStyle());
    }
}