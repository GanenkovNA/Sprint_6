package feline.positive;

import feline.FelineBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class GetKittensParamTest extends FelineBase {
    private final int countOfKittens;

    public GetKittensParamTest(int countOfKittens) {
        this.countOfKittens = countOfKittens;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {0},
                {1},
                {5}
                // Теоретически ещё должны быть значения для верхней границы, но они не были обозначены
        });
    }

    @Test
    public void shouldReturnCountOfKittens(){
        assertEquals(countOfKittens, feline.getKittens(countOfKittens));
    }
}
