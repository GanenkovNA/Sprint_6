package alex.positive;

import alex.AlexBase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import static resources.VariablesForTests.*;

public class AlexMethodsTest extends AlexBase {

    // Тест метода `getFriends`
    @Test
    public void getFriendsShouldReturnExpectedListOfFriends () {
        assertEquals(ALEX_FRIENDS_LIST, alex.getFriends());
    }

    // Тесты метода `getKittens`
    // Контрактный тест
    @Test
    public void getKittensShouldCallGetKittens() {
        alex.getKittens();
        verify(feline, times(1))
                .getKittens(ALEX_DEFAULT_KITTENS_COUNT);
    }

    // Проверка возвращаемого значения
    @Test
    public void getFoodShouldReturnStubbedValue() {
        when(feline.getKittens(ALEX_DEFAULT_KITTENS_COUNT))
                .thenReturn(ALEX_DEFAULT_KITTENS_COUNT);
        assertEquals(ALEX_DEFAULT_KITTENS_COUNT, alex.getKittens());
    }

    // Тест метода `getPlaceOfLiving`
    @Test
    public void getPlaceOfLivingShouldReturnExpectedString () {
        assertEquals(ALEX_PLACE_OF_LIVING, alex.getPlaceOfLiving());
    }
}
