package alex.negative;

import alex.AlexBase;
import com.example.Alex;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class AlexConstructorTest extends AlexBase {

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Before
    public void createAlexObject () {
        // Переопределение метода `@Before`, чтобы не создавались объект `Alex` и `Feline`
    }

    @Test
    public void alexConstructorShouldThrowsExceptionWhenFelineIsNull() throws Exception {
        exceptionRule.expect(Exception.class);
        new Alex(feline);
    }


}
