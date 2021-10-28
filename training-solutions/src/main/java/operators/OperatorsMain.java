package operators;

public class OperatorsMain {

    public static void main(String[] args) {

        System.out.println(Integer.toBinaryString(-15));

        System.out.println(new Operators().isEven(17));

        System.out.println(new Operators().getResultOfDivision(19, 6));

        String noReference = null;
        String reference = "Hello!";
        System.out.println(new Operators().isNull(noReference));
        System.out.println(new Operators().isNull(reference));

        String empty = "";
        System.out.println(new Operators().isEmpty(noReference));
        System.out.println(new Operators().isEmpty(empty));
        System.out.println(new Operators().isEmpty(reference));
    }
}
