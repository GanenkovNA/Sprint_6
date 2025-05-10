package feline;

import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;
import static resources.VariablesForTests.PREDATOR_FOOD_LIST;
import static resources.VariablesForTests.PREDATOR_VALUE;

public class EatMeatTest extends FelineBase {

    // Контрактный тест
    @Test
    public void shouldCallGetFoodWithPredatorValue() throws Exception {
        feline = spy(new Feline());

        doReturn(List.of(PREDATOR_FOOD_LIST))
                .when(feline)
                .getFood(PREDATOR_VALUE);
        feline.eatMeat();
        verify(feline).getFood(eq(PREDATOR_VALUE));
    }

    // Интеграционный тест
    @Test
    public void shouldReturnPredatorFoodList() throws Exception {
        assertEquals(PREDATOR_FOOD_LIST, feline.eatMeat());
    }

}
