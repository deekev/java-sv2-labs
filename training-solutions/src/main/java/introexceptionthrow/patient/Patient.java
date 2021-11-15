package introexceptionthrow.patient;

public class Patient {

    private final static int MIN_YEAR_OF_BIRTH = 1900;

    private String name;
    private String socialSecurityNumber;
    private int yearOfBirth;

    public Patient(String name, String socialSecurityNumber, int yearOfBirth) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Nem adott meg nevet!");
        }

        if (!new SsnValidator().isValidSsn(socialSecurityNumber)){
            throw new IllegalArgumentException("Érvénytelen TAJ:" + socialSecurityNumber);
        }

        if (yearOfBirth <= MIN_YEAR_OF_BIRTH){
            throw new IllegalArgumentException("Érvénytelen születési év:" + yearOfBirth);
        }

        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
}
