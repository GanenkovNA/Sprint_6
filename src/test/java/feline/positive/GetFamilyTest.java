package feline.positive;

import feline.FelineBase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static resources.VariablesForTests.FELINE_FAMILY_VALUE;

public class GetFamilyTest extends FelineBase {

    @Test
    public void shouldReturnFelineFamilyValue(){
        assertEquals(FELINE_FAMILY_VALUE, feline.getFamily());
    }
}
