package stackqueue;

import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class _03_02_MinStackTest {

    private _03_02_MinStack s = new _03_02_MinStack();

    @Test
    public void oneElement() throws Exception{
        s.push(3);
        assertEquals(3, s.min());
        assertEquals(3, s.pop());
    }

    @Test
    public void scrambledElements() throws Exception{
        s.push(4);
        s.push(1);
        s.push(9);
        assertEquals(1, s.min());
        assertEquals(9, s.pop());
        assertEquals(1,s.pop());
        assertEquals(4, s.pop());
    }

    @Test
    public void checkMinAfterPoppingMin() throws Exception{
        int[] el = {3, 5, 1};
        for (int i: el) {
            s.push(i);
        }
        assertEquals(1, s.min());
        assertEquals(1, s.pop());
        assertEquals(3, s.min());
    }

    @Test
    public void withDecreasing() throws Exception{
        s.push(3);
        s.push(2);
        s.push(1);
        assertEquals(1, s.min());
        assertEquals(1, s.pop());
        assertEquals(2, s.min());
        assertEquals(2, s.pop());
        assertEquals(3, s.min());
        assertEquals(3, s.pop());
    }

    @Test
    public void withInterleaving() throws Exception{
        s.push(3);
        s.push(5);
        s.push(2);
        s.push(6);
        s.push(1);

        assertEquals(1, s.min());
        assertEquals(1, s.pop());
        assertEquals(2, s.min());
        assertEquals(6, s.pop());
        assertEquals(2, s.min());
        assertEquals(2, s.pop());
        assertEquals(3, s.min());
        assertEquals(5, s.pop());
    }

    @Test
    public void withInterleavingActions() throws Exception{
        s.push(3);
        s.push(5);
        assertEquals(3, s.min());
        s.push(4);
        assertEquals(3, s.min());
        assertEquals(4, s.pop());
        assertEquals(5, s.pop());
        assertEquals(3, s.pop());
    }

    @Test
    public void withEmptyStack() {
        try {
            s.pop();
            assertTrue(false);
        } catch (Exception e) {
            e.printStackTrace();
            assertTrue(true);
        }
    }
}