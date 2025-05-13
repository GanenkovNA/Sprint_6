package cat.negative;

import cat.CatBase;
import com.example.Cat;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertThrows;

public class CatConstructorTest extends CatBase {

    @Before
    public void createCatObject() {
        // Переопределение метода `@Before`, чтобы не создавались объекты `Cat` и `Feline`
    }

    @Test
    public void catConstructorShouldThrowsExceptionWhenFelineIsNull() {
        assertThrows(
                NullPointerException.class,
                () -> new Cat(feline)
        );
    }
}
