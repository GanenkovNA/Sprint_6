package cat;

import com.example.Cat;
import com.example.Feline;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import static resources.VariablesForTests.PREDATOR_FOOD_LIST;

public class GetFoodTest extends CatBase {
    //Проверка вызова метода `eatMeat` класса `Feline`
    @Test
    public void getFoodShouldCallEatMeat() throws Exception {
        cat.getFood();
        verify(feline, times(1))
                .eatMeat();
    }

    //Проверка значения, возвращаемого методом
    @Test
    public void getFoodShouldReturnStubbedValue() throws Exception {
        when(feline.eatMeat())
                .thenReturn(PREDATOR_FOOD_LIST);
        assertEquals(PREDATOR_FOOD_LIST, cat.getFood());
    }

    //Интеграционный тест
    @Test
    public void getFoodShouldReturnExpectedValue() throws Exception {
        //Создаётся "шпион" класса `Feline` вместо стандартного мока
        feline = spy(new Feline());
        cat = new Cat(feline);

        assertEquals(PREDATOR_FOOD_LIST, cat.getFood());
    }
}
