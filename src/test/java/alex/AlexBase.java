package alex;

import com.example.Alex;
import com.example.Feline;
import org.junit.Before;

import static org.mockito.Mockito.mock;

public class AlexBase {
    protected Feline feline;
    protected Alex alex;

    @Before
    public void createAlexObject () throws Exception {
        feline = mock(Feline.class);
        alex = new Alex(feline);
    }
}
