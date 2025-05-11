package lion;

import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

@RunWith(Parameterized.class)
public class HaveManeParamTest extends LionBase {
    private final String lionSex;
    private final boolean isMale;

    public HaveManeParamTest(String lionSex, boolean isMale) {
        this.lionSex = lionSex;
        this.isMale = isMale;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"Самец", true},
                {"Самка", false}
        });
    }

    @Before
    public void createLionObject() throws Exception {
        //feline = mock(Feline.class);
        lion = new Lion(feline, lionSex);
    }

    @Test
    public void HaveManeMaleTest() throws Exception {
        assertEquals(isMale, lion.doesHaveMane());
    }
}
