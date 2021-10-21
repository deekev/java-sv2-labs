package cmdarguments.operation;

public class Operation {

    public static void main(String[] args) {

        for (String each: args){
            if (each.equals("/list")){
                System.out.println("Listázás");
            } else if (each.equals("/add")){
                System.out.println("Hozzáadás");
            } else if (each.equals("/delete")){
                System.out.println("Törlés");
            } else {
                System.out.println("Ismeretlen művelet");
            }
        }
    }
}