import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class NonuniqueHashSetTest {
    Set<String> nonUniqueSet;

    @Before
    public void init() {
        nonUniqueSet = new NonuniqueHashSet<String>();
        nonUniqueSet.add("first");
    }

    @Test
    public void shouldReturnCountOfObjectsInSetAfterAddingSecongObject() throws Exception {
        //given
        int expected = 2;
        nonUniqueSet.add("first");
        //when
        int actual = ((NonuniqueHashSet) nonUniqueSet).count("first");
        //then
        assertEquals("test failed", expected, actual);
    }

}