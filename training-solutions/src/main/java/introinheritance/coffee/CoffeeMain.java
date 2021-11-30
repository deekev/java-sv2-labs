package introinheritance.coffee;

public class CoffeeMain {

    public static void main(String[] args) {

        Coffee coffee = new Coffee();
        coffee.setName("Omnia");
        coffee.setPrice(690);

        System.out.println(coffee.getName());
        System.out.println(coffee.getPrice());

        Cappuccino cappuccino = new Cappuccino();
        cappuccino.setName("Nescafé");
        cappuccino.setPrice(970);

        System.out.println(cappuccino.getName());
        System.out.println(cappuccino.getPrice());
    }

    /*
    Példányosíts egy Coffee objektumot, állítsd be az attribútumainak az értékeit
    majd írd is ki őket a konzolra! Ezután pedig példányosíts egy Cappuccino objektumot,
    ennél állítsd be az attribútumainak az értékeit, majd ezeket is írd ki a konzolra! Mit tapasztalsz?

    A Capuccino osztályba nem írtunk sem attribútumokat, sem metódusokat,
    de ezeket örökölte a Coffee szülő osztálytól.
     */
}