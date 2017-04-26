/**
 * Created by mff on 2017/4/26.
 */
import static org.junit.Assert.*;
        import org.junit.Test;

public class KeypadTest {
    @Test
    public void simpleTest() {
        assertEquals(9, Keypad.presses("LOL"));
        assertEquals(13, Keypad.presses("HOW R U"));
        assertEquals(28, Keypad.presses("HOAJNKDHFIW R U"));
    }
}