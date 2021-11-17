package introexceptionreadfiletestjunit4;

import org.junit.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.Assert.*;

public class RecipeTest {

    private Recipe recipe = new Recipe();

    @Test
    public void testCreate() {
        Recipe recipe = new Recipe();
        assertEquals(0, recipe.getIngredients().size());
    }

    @Test
    public void testAddIngredients() {
        Path path = Paths.get("src/test/resources/recipe.txt");
        recipe.addIngredients(path);

        assertEquals(10, recipe.getIngredients().size());
        assertEquals("citrom", recipe.getIngredients().get(4));
    }

    @Test
    public void testAddIngredientsException() {
        Path path = Paths.get("src/test/resources/recipe_txt");

        IllegalStateException exception = assertThrows(IllegalStateException.class,
                () -> recipe.addIngredients(path));
        assertEquals("Can not read file", exception.getMessage());
    }
}