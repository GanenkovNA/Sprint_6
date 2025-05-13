package alex.positive;

import alex.AlexBase;
import com.example.Alex;
import com.example.Feline;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import static resources.VariablesForTests.*;

public class GetKittensTest extends AlexBase {

    // Контрактный тест
    @Test
    public void getKittensShouldCallGetKittens() {
        alex.getKittens();
        verify(feline, times(1))
                .getKittens(ALEX_DEFAULT_KITTENS_COUNT);
    }

    // Проверка возвращаемого значения
    @Test
    public void getFoodShouldReturnStubbedValue() {
        when(feline.getKittens(ALEX_DEFAULT_KITTENS_COUNT))
                .thenReturn(ALEX_DEFAULT_KITTENS_COUNT);
        assertEquals(ALEX_DEFAULT_KITTENS_COUNT, alex.getKittens());
    }

    // Интеграционный тест
    @Test
    public void getKittensShouldReturnExpectedValue() throws Exception {
        //Создаётся "шпион" класса `Feline` вместо стандартного мока
        feline = spy(new Feline());
        alex = new Alex(feline);

        assertEquals(ALEX_DEFAULT_KITTENS_COUNT, alex.getKittens());
    }
}
