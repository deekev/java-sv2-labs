package stringbasic;

public class Student {

    private Person student;
    private String neptunCode;
    private String educationalIdentifier;
    private String entranceCardNumber;

    public Student(Person student, String neptunCode, String educationalIdentifier) {
        this.student = student;
        this.neptunCode = neptunCode;
        this.educationalIdentifier = educationalIdentifier;
    }

    public Person getStudent() {
        return student;
    }

    public void setStudent(Person student) {
        this.student = student;
    }

    public String getNeptunCode() {
        return neptunCode;
    }

    public void setNeptunCode(String neptunCode) {
        this.neptunCode = neptunCode;
    }

    public String getEducationalIdentifier() {
        return educationalIdentifier;
    }

    public void setEducationalIdentifier(String educationalIdentifier) {
        this.educationalIdentifier = educationalIdentifier;
    }

    public String getEntranceCardNumber() {
        return entranceCardNumber;
    }

    public void setEntranceCardNumber(String entranceCardNumber) {
        this.entranceCardNumber = entranceCardNumber;
    }
}