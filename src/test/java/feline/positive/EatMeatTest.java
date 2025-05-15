package feline.positive;

import feline.FelineBase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static resources.VariablesForTests.PREDATOR_FOOD_LIST;

public class EatMeatTest extends FelineBase {
    // Интеграционный тест
    @Test
    public void shouldReturnPredatorFoodList() throws Exception {
        assertEquals(PREDATOR_FOOD_LIST, feline.eatMeat());
    }

}
