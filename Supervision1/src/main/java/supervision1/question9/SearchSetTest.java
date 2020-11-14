package supervision1.question9;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class SearchSetTest {
    @Test
    public void searchSet_insertHead_whenEmpty() {
        // ARRANGE
        SearchSet s = new SearchSet();

        // ACT
        s.insert(3);

        // ASSERT
        assertEquals(1,s.getNumberElements());
    }
    @Test
    public void searchSet_containsFourTrue_whenEmpty() {
        // ARRANGE
        SearchSet s = new SearchSet();

        // ACT
        s.insert(3);
        s.insert(4);
        s.insert(11);

        // ASSERT
        assertTrue(s.contains(4));
    }
    @Test
    public void searchSet_containsElevenFalse_whenEmpty() {
        // ARRANGE
        SearchSet s = new SearchSet();

        // ACT
        s.insert(3);
        s.insert(4);
        s.insert(999);

        // ASSERT
        assertFalse(s.contains(11));
    }
}
