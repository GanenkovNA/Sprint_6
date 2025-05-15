package lion;

import com.example.Feline;
import com.example.Lion;
import org.junit.Before;

import static org.mockito.Mockito.mock;
import static resources.VariablesForTests.LION_DEFAULT_TEST_SEX;

public class LionBase {
    protected Lion lion;
    protected Feline feline;

    @Before
    public void createLionObject() throws Exception {
        feline = mock(Feline.class);
        lion = new Lion(feline, LION_DEFAULT_TEST_SEX);
    }

}
