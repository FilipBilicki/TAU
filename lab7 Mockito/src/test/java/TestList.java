import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;
import org.junit.Test;
import org.mockito.Mock;

public class TestList {

    @Test
    public void testList_Single() {

        List mocklist = mock(List.class);
        when(mocklist.size()).thenReturn(2);

        assertEquals(2, mocklist.size());

        System.out.println(mocklist.size());
        System.out.println(mocklist);
    }

    @Test
    public void testList_Multiple() {

        List mocklist = mock(List.class);
        when(mocklist.size()).thenReturn(4).thenReturn(12).thenReturn(43);

        assertEquals(4, mocklist.size());
        assertEquals(12, mocklist.size());
        assertEquals(43, mocklist.size());

        System.out.println(mocklist.size());
        System.out.println(mocklist);
    }

    @Test
    public void testList_String() {

        List mocklist = mock(List.class);

        when(mocklist.get(0)).thenReturn("Zwracam tekst");

        assertEquals("Tez zwracam tekst", mocklist.get(0));
        System.out.println(mocklist.get(0));
    }
}