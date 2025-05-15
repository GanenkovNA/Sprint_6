package alex.negative;

import com.example.Alex;
import org.junit.Test;

import static org.junit.Assert.assertThrows;

public class AlexConstructorTest  {

    @Test
    public void alexConstructorShouldThrowsExceptionWhenFelineIsNull() {
        assertThrows(
                NullPointerException.class,
                () -> new Alex(null)
        );
    }
}
