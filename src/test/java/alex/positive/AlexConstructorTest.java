package alex.positive;

import alex.AlexBase;
import org.junit.Test;

import static org.junit.Assert.*;

public class AlexConstructorTest extends AlexBase {

    @Test
    public void alexObjectMustBeNotNull () {
        assertNotNull(alex);
    }
}
