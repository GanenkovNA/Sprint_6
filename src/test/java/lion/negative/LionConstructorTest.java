package lion.negative;

import com.example.Feline;
import com.example.Lion;
import lion.LionBase;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.mockito.Mockito.mock;
import static resources.VariablesForTests.SEX_EXCEPTION_MESSAGE;

public class LionConstructorTest extends LionBase {

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Before
    public void createLionObject(){
        // Переопределение метода `@Before`, чтобы не создавались объект `Lion` и `Feline`
    }

    @Test
    public void lionConstructorShouldThrowsExceptionWhenFelineIsNull () throws Exception {
        exceptionRule.expect(Exception.class);
        new Lion(feline, "Самец");
    }

    @Test
    public void lionConstructorShouldThrowsExceptionForInvalidSex() throws Exception {
        feline = mock(Feline.class);

        exceptionRule.expect(Exception.class);
        exceptionRule.expectMessage(SEX_EXCEPTION_MESSAGE);
        new Lion(feline, "UNKNOWN SEX");
    }
}
