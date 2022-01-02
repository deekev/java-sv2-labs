package schoolrecords;

public enum MarkType {

    A(5, "excellent"),
    B(4, "very good"),
    C(3, "improvement needed"),
    D(2, "close fail"),
    F(1, "fail");

    private int markNumber;
    private String interpretation;

    MarkType(int markNumber, String interpretation) {
        this.markNumber = markNumber;
        this.interpretation = interpretation;
    }

    public int getMarkNumber() {
        return markNumber;
    }

    public String getInterpretation() {
        return interpretation;
    }
}