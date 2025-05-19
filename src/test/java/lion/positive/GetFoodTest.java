package lion.positive;

import lion.LionBase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import static resources.VariablesForTests.*;

public class GetFoodTest extends LionBase {

    //Проверка вызова метода `eatMeat` класса `Feline`
    @Test
    public void getFoodShouldCallEatMeat() throws Exception {
        lion.getFood();
        verify(feline, times(1))
                .getFood(PREDATOR_VALUE);
    }

    //Проверка значения, возвращаемого методом
    @Test
    public void getFoodShouldReturnStubbedValue() throws Exception {
        when(feline.getFood(PREDATOR_VALUE))
                .thenReturn(PREDATOR_FOOD_LIST);
        assertEquals(PREDATOR_FOOD_LIST, lion.getFood());
    }
}