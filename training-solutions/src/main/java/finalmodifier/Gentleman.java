package finalmodifier;

public class Gentleman {

    public static final String MESSAGE_PREFIX = "Hello Mr. ";

    public String sayHello(String name){
        return MESSAGE_PREFIX + name;
    }

    public static void main(String[] args) {

        Gentleman gentleman = new Gentleman();
        System.out.println(gentleman.sayHello("John Doe"));
    }
}