package cat;

import com.example.Cat;
import com.example.Feline;
import org.junit.Before;

import static org.mockito.Mockito.mock;

public class CatBase {
    protected Cat cat;
    protected Feline feline;

    @Before
    public void createCatObject() {
        feline = mock(Feline.class);
        cat = new Cat(feline);
    }
}
