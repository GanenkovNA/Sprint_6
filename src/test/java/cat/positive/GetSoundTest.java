package cat.positive;

import cat.CatBase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static resources.VariablesForTests.CAT_SOUND_VALUE;

public class GetSoundTest extends CatBase {
    @Test
    public void shouldReturnCatSound(){
        assertEquals(CAT_SOUND_VALUE, cat.getSound());
    }

}
