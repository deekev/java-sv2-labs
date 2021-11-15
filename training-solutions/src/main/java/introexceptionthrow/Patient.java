package introexceptionthrow;

public class Patient {

    public static final int MIN_YEAR_OF_BIRTH = 1900;

    private String name;
    private String socialSecurityNumber;
    private int yearOfBirth;

    public Patient(String name, String socialSecurityNumber, int yearOfBirth) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Nem adott meg nevet!");
        }

        if (yearOfBirth <= MIN_YEAR_OF_BIRTH) {
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