package introexceptionthrow;

public class PatientMain {

    public static void main(String[] args) {

        Patient validPatient = new Patient("John Doe", "156389745", 2005);
        System.out.println(validPatient.getName());
        System.out.println(validPatient.getSocialSecurityNumber());
        System.out.println(validPatient.getYearOfBirth());

        Patient patient = new Patient("", "156389745", 2005);
        System.out.println(patient.getName());
        System.out.println(patient.getSocialSecurityNumber());
        System.out.println(patient.getYearOfBirth());

        Patient anotherPatient = new Patient("John Doe", "156389745", 1899);

        System.out.println(anotherPatient.getName());
        System.out.println(anotherPatient.getSocialSecurityNumber());
        System.out.println(anotherPatient.getYearOfBirth());
    }
}