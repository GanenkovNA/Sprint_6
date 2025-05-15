package lion.positive;

import lion.LionBase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import static resources.VariablesForTests.DEFAULT_KITTENS_COUNT;

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
}

