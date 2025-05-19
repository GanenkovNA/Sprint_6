package lion.negative;

import com.example.Feline;
import com.example.Lion;
import lion.LionBase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.mock;
import static resources.VariablesForTests.SEX_EXCEPTION_MESSAGE;

public class LionConstructorTest extends LionBase {

    @Before
    public void createLionObject(){
        // Переопределение метода `@Before`, чтобы не создавались объект `Lion` и `Feline`
    }

    @Test
    public void lionConstructorShouldThrowsExceptionWhenFelineIsNull () {
        assertThrows(
                NullPointerException.class,
                () -> new Lion(null, "Самец")
        );
    }

    @Test
    public void lionConstructorShouldThrowsExceptionForInvalidSex() {
        feline = mock(Feline.class);

        Exception exception = assertThrows(
                Exception.class,
                () -> new Lion(feline, "UNKNOWN SEX")
        );

        assertEquals(SEX_EXCEPTION_MESSAGE, exception.getMessage());
    }
}
