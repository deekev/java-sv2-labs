package methodchain;

public class ModifiedWord {

    public String modify(String word) {
        if (word == null || word.isBlank() || word.length() < 4) {
            throw new IllegalArgumentException("Minimum 4 betűs szó megadása szükséges.");
        }
        return word.substring(0, 1)
                .toUpperCase()
                .concat("x")
                .concat(word.substring(2, 3).toUpperCase())
                .concat("y");
    }
}