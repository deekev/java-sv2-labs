package introexceptionthrow;

public class Validation {

    public void validateName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Nem adott meg nevet!");
        }
    }

    public void validateAge(String ageString) {

        if (ageString.length() == 0) {
            throw new IllegalArgumentException("Nem adott meg életkort!");
        }

        for (char c: ageString.toCharArray()){
            if (!Character.isDigit(c)){
                throw new IllegalArgumentException("Nem számot adott meg!");
            }
        }

        if (Integer.parseInt(ageString) > 120) {
            throw new IllegalArgumentException("Nem valós életkort adott meg!");
        }
    }
}