package lion.positive;

import com.example.Feline;
import com.example.Lion;
import lion.LionBase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import static resources.VariablesForTests.DEFAULT_KITTENS_COUNT;
import static resources.VariablesForTests.LION_DEFAULT_TEST_SEX;

public class GetKittensTest extends LionBase {

    @Test
    public void getKittensShouldCallGetKittens() {
        lion.getKittens();
        verify(feline, times(1))
                .getKittens();
    }

    @Test
    public void getKittensShouldReturnStubbedValue() {
        when(feline.getKittens())
                .thenReturn(DEFAULT_KITTENS_COUNT);
        assertEquals(DEFAULT_KITTENS_COUNT, lion.getKittens());
    }

    @Test
    public void getKittensShouldReturnExpectedValue() throws Exception {
        //Создаётся "шпион" класса `Feline` вместо стандартного мока
        feline = spy(new Feline());
        lion = new Lion(feline, LION_DEFAULT_TEST_SEX);

        assertEquals(DEFAULT_KITTENS_COUNT, lion.getKittens());
    }
}

