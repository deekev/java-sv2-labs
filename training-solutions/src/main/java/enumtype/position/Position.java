package enumtype.position;

public enum Position {

    ÜGYVEZETŐ(1_000_000,"nyugdíjbiztosítás"), GAZDASÁGI_IGAZGATÓ(800_000, "SZÉP kártya"),
    TITKÁRNŐ(400_000, "étkezési utalvány"), TAKARÍTÓ(200_000, "-");

    private final int salary;
    private final String benefit;

    Position(int salary, String benefit) {
        this.salary = salary;
        this.benefit = benefit;
    }

    public int getSalary() {
        return salary;
    }

    public String getBenefit() {
        return benefit;
    }
}