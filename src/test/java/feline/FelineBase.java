package feline;

import com.example.Feline;
import org.junit.Before;

public class FelineBase {
    protected Feline feline;

    @Before
    public void createFelineObject(){
        feline = new Feline();
    }
}
