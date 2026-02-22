package praktikum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class IngredientTypeTest {

    @Test
    public void shouldHaveTwoValues() {
        assertEquals(2, IngredientType.values().length);
    }

    @Test
    public void shouldContainSauce() {
        assertTrue(IngredientType.valueOf("SAUCE") instanceof IngredientType);
    }

    @Test
    public void shouldContainFilling() {
        assertTrue(IngredientType.valueOf("FILLING") instanceof IngredientType);
    }
}