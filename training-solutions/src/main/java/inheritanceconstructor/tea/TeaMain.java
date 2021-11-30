package inheritanceconstructor.tea;

public class TeaMain {

    public static void main(String[] args) {

        Tea tea = new Tea("tea", 890);
        System.out.println(tea.getName());
        System.out.println(tea.getPrice());

        HerbalTea herbalTea = new HerbalTea("gyógytea", 1500);
        System.out.println(herbalTea.getName());
        System.out.println(herbalTea.getPrice());
    }
}