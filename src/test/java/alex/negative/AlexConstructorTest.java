package alex.negative;

import alex.AlexBase;
import com.example.Alex;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertThrows;

public class AlexConstructorTest extends AlexBase {

    @Before
    public void createAlexObject () {
        // Переопределение метода `@Before`, чтобы не создавались объект `Alex` и `Feline`
    }

    @Test
    public void alexConstructorShouldThrowsExceptionWhenFelineIsNull() throws Exception {
        assertThrows(
                NullPointerException.class,
                () -> {new Alex(feline);}
        );
    }


}
