package compositionlist.computer;

public class PersonalComputerMain {

    public static void main(String[] args) {

        Cpu cpu = new Cpu("Intel Core i5", 2.42);
        Hardware monitor = new Hardware("Samsung", "S25");
        Hardware keyboard = new Hardware("Logitech", "J562");
        Software operationSystem = new Software("Windows", 10.0);
        Software ide = new Software("IntelliJ IDEA", 11.0);
        PersonalComputer pc = new PersonalComputer(cpu);
        pc.addHardware(monitor);
        pc.addHardware(keyboard);
        pc.addSoftware(operationSystem);
        pc.addSoftware(ide);
        System.out.println(pc.toString());
    }
}