package feline.negative;

import feline.FelineBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertThrows;

@RunWith(Parameterized.class)
public class GetKittensParamTest extends FelineBase {
    private final int countOfKittens;

    public GetKittensParamTest(int countOfKittens) {
        this.countOfKittens = countOfKittens;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {-1}
                // Теоретически ещё должно быть значение для верхней границы, но оно не было обозначено
        });
    }

    @Test
    public void shouldReturnCountOfKittens(){
        assertThrows(
                // Теоретически подошёл бы `IllegalArgumentException`, но разработчик может использовать кастомные исключения
                Exception.class,
                () -> feline.getKittens(countOfKittens)
        );
    }
}
