package feline;

import com.example.Feline;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import static resources.VariablesForTests.DEFAULT_KITTENS_COUNT;

public class GetKittensDefaultCountTest extends FelineBase {

    //Контрактный тест
    @Test
    public void shouldCallGetKittensWithDefaultCount(){
        feline = spy(new Feline());
        doReturn(DEFAULT_KITTENS_COUNT)
                .when(feline)
                .getKittens(DEFAULT_KITTENS_COUNT);
        feline.getKittens();
        verify(feline).getKittens(eq(DEFAULT_KITTENS_COUNT));
    }

    // Интеграционный тест
    @Test
    public void shouldReturnDefaultCountOfKittens(){
        assertEquals(DEFAULT_KITTENS_COUNT, feline.getKittens());
    }
}
