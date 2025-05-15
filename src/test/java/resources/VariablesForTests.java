package resources;

import java.util.List;

public class VariablesForTests {
    // Переменные для класса `Feline`
        // Переменные для тестов метода `eatMeat`
        public static final String PREDATOR_VALUE = "Хищник";
        public static final List<String> PREDATOR_FOOD_LIST = List.of("Животные", "Птицы", "Рыба");

        // Переменные для тестов метода `getFamily`
        public static final String FELINE_FAMILY_VALUE = "Кошачьи";

        // Переменные для тестов метода `getKittens`
        public static final int DEFAULT_KITTENS_COUNT = 1;

    // Переменные для класса `Cat`
        // Переменные для тестов метода `getSound`
        public static final String CAT_SOUND_VALUE = "Мяу";

    // Переменные для класса `Lion`
        public static final String LION_DEFAULT_TEST_SEX = "Самец";
        // Переменные для тестов конструктора
        public static final String SEX_EXCEPTION_MESSAGE = "Используйте допустимые значения пола животного - самец или самка";

    // Переменные для класса `Alex`
        // Переменные для тестов метода `getKittens`
        public static final int ALEX_DEFAULT_KITTENS_COUNT = 0;
        // Переменные для тестов метода `getFriends`
        public static final List<String> ALEX_FRIENDS_LIST = List.of("Марти", "Глория", "Мелман");
        // Переменные для тестов метода `getPlaceOfLiving`
        public static final String ALEX_PLACE_OF_LIVING = "Нью-Йоркский зоопарк";
}
