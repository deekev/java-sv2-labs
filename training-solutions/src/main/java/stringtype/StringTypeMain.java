package stringtype;

public class StringTypeMain {

    public static void main(String[] args) {

        String prefix = "Hello ";
        System.out.println(prefix);

        String name = "John Doe";
        System.out.println(name);

        String message = prefix + name;
        System.out.println(message);

        message = message + 444;
        System.out.println(message);

        boolean b = message.equals("Hello John Doe");
        System.out.println(b);

        boolean c = message.equals("Hello John Doe444");
        System.out.println(c);

        String string = "" + "";
        System.out.println(string);
        System.out.println(string.length());

        String randomString = "Abcde";
        System.out.println(randomString.length());
        System.out.println(randomString.substring(0, 1) + ", " + randomString.substring(2, 3));
        System.out.println(randomString.substring(0, 2));

    }
}
