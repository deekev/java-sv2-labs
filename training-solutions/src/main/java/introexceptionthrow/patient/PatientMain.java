package introexceptionthrow.patient;

public class PatientMain {

    public static void main(String[] args) {

        Patient firstPatient = new Patient("John Doe", "123456788", 2009);
        System.out.println(firstPatient.getName());
        System.out.println(firstPatient.getSocialSecurityNumber());
        System.out.println(firstPatient.getYearOfBirth());

        Patient secondPatient = new Patient("", "123456788", 2009);
        System.out.println(secondPatient.getName());
        System.out.println(secondPatient.getSocialSecurityNumber());
        System.out.println(secondPatient.getYearOfBirth());

        Patient thirdPatient = new Patient("John Doe", "123456787", 2009);
        System.out.println(thirdPatient.getName());
        System.out.println(thirdPatient.getSocialSecurityNumber());
        System.out.println(thirdPatient.getYearOfBirth());

        Patient fourthPatient = new Patient("John Doe", "123456788", 1009);
        System.out.println(fourthPatient.getName());
        System.out.println(fourthPatient.getSocialSecurityNumber());
        System.out.println(fourthPatient.getYearOfBirth());
    }
}