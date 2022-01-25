import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class StubTest {

    @Test
    public void test() {

        UsersList doUserStub = new Stub();

        GetUsers users = new GetUsers(doUserStub);

        List<String> retriveUsers = users.getUsers(" Filip ");

        assertEquals(2, retriveUsers.size());
        System.out.println(" Stub is working correctly...!!");
    }

    @Test
    public void First_Mock() {

        UsersList users = Mockito.mock(UsersList.class);

        List<String> list = Arrays.asList(" Fil ", " MockitoIsGood ", " Welcome ", " ILoveJava ");
        when(users.getNames("Fil")).thenReturn(list);

        GetUsers user = new GetUsers(users);

        List<String> alt = user.getUsers("Fil");

        System.out.println(alt);
        assertEquals(1, alt.size());
    }
}
