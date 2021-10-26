package compositionlist;

public class CapsulesMain {

    public static void main(String[] args) {

        Capsules capsules = new Capsules();
        capsules.addFirst("blue");
        capsules.addFirst("red");
        System.out.println(capsules.getColors());
        capsules.addLast("green");
        capsules.addLast("yellow");
        System.out.println(capsules.getColors());
        capsules.removeFirst();
        System.out.println(capsules.getColors());
        capsules.removeLast();
        System.out.println(capsules.getColors());
    }
}