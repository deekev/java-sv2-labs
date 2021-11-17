package introexceptionreadfiletestjunit5;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class RecipeTest {

    Recipe recipe = new Recipe();

    @Test
    void testCreate() {
        Recipe recipe = new Recipe();
        assertEquals(0, recipe.getIngredients().size());
    }

    @Test
    void testAddIngredients() {
        recipe.addIngredients(Paths.get("src/test/resources/recipe.txt"));
        assertEquals(10, recipe.getIngredients().size());
        assertEquals("citrom", recipe.getIngredients().get(4));
    }

    @Test
    void testAddIngredientsException() {
        Path path = Paths.get("src/test/resources/recipe_txt");

        IllegalStateException exception = assertThrows(IllegalStateException.class,
                () -> recipe.addIngredients(path));
        assertEquals("Can not read file", exception.getMessage());
    }
}