/**
 * Created by mengfeifei on 2017/4/26.
 */
import org.junit.Test;
        import static org.junit.Assert.assertEquals;
        import org.junit.runners.JUnit4;

public class LineTests {
    @Test
    public void test1() {
        //assertEquals("YES", Line.Tickets(new int[] {}));

        assertEquals("NO", Line.Tickets(new int[] {25, 50, 100,50}));
        assertEquals("YES", Line.Tickets(new int[] {25,25, 50,100,25}));
    }
    @Test
    public void test2() {
        assertEquals("NO", Line.Tickets(new int []{25, 100}));
    }
}