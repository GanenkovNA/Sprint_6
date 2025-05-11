package alex;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static resources.VariablesForTests.ALEX_PLACE_OF_LIVING;

public class GetPlaceOfLivingTest extends AlexBase {

    @Test
    public void getPlaceOfLivingShouldReturnExpectedString () {
        assertEquals(ALEX_PLACE_OF_LIVING, alex.getPlaceOfLiving());
    }
}
