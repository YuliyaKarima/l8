import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CustomImmutableListTest {
    List<Integer> list;

    @Before
    public void init() {
        list = new CustomImmutableList<>(1, 2, 3, 4, 5, 6, 7);
    }

    @Test
    public void shouldReturnFirstEementInList() throws Exception {
        //given
        int actual = 0;
        int expected = list.get(0);
        //when
        for (int i = 0; i < list.size() + 1; i++) {
            actual = (Integer) ((CustomImmutableList) list).next();
        }
        //then
        assertEquals("test failed", actual, expected);

    }

    @Test(expected = UnsupportedOperationException.class)
    public void add() {
        list.add(9);
    }

    @Test(expected = Exception.class)
    public void remove() throws Exception {
        list.remove(0);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void clear() throws Exception {
        list.clear();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void addAll() throws Exception {
        list.addAll(new ArrayList<>());
    }
}