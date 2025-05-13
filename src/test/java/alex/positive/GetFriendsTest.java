package alex.positive;

import alex.AlexBase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static resources.VariablesForTests.ALEX_FRIENDS_LIST;

public class GetFriendsTest extends AlexBase {

    @Test
    public void getFriendsShouldReturnExpectedListOfFriends () {
        assertEquals(ALEX_FRIENDS_LIST, alex.getFriends());
    }
}
