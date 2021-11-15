package introexceptionthrow.patient;

public class SsnValidator {

    private static final int SSN_LENGTH = 9;

    public boolean isValidSsn(String ssn) {
        if (ssn.length() != SSN_LENGTH) {
            return false;
        }
        try {
            int count = 0;
            for (int i = 0; i < ssn.length() - 1; i++) {
                if ((i + 1) % 2 == 0) {
                    count += getInt(ssn.charAt(i)) * 7;
                }
                else {
                    count += getInt(ssn.charAt(i)) * 3;
                }
            }
            return count % 10 == getInt(ssn.charAt(ssn.length() - 1));
        }
        catch (IllegalArgumentException iae) {
            return false;
        }
    }

    private int getInt(char c) {
        if (!Character.isDigit(c)) {
            throw new IllegalArgumentException("Nem csak számjegyet tartalmaz!");
        }
        return Integer.parseInt(String.valueOf(c));
    }
}