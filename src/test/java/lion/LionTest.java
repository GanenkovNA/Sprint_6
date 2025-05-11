package lion;

import com.example.Lion;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static resources.VariablesForTests.SEX_EXCEPTION_MESSAGE;

public class LionTest extends LionBase{
    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Before
    public void createLionObject(){
        // Переопределение метода `@Before`, чтобы не создавался объект `Lion`
    }

    @Test
    public void lionConstructorShouldThrowsExceptionForInvalidSex() throws Exception {
        exceptionRule.expect(Exception.class);
        exceptionRule.expectMessage(SEX_EXCEPTION_MESSAGE);
        new Lion(feline, "UNKNOWN SEX");
    }
}
