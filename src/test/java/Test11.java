/**
 * Created by mff on 2017/4/25.
 */
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class Test11 {

        @Test
        public void testEncrypt() {
            // assertEquals("expected", "actual");
            assertEquals("<...OQDXFVAHFWGSHQVNADYG[B]>", Test1.encrypt("<...OQDXFVAHFWGSHQVNADYG[B]>", 0));
            assertEquals("This is a test!", Test1.encrypt("This is a test!", 0));
            assertEquals("hsi  etTi sats!", Test1.encrypt("This is a test!", 1));
            assertEquals("s eT ashi tist!", Test1.encrypt("This is a test!", 2));
            assertEquals(" Tah itse sits!", Test1.encrypt("This is a test!", 3));
            assertEquals("This is a test!", Test1.encrypt("This is a test!", 4));
            assertEquals("This is a test!", Test1.encrypt("This is a test!", -1));
            assertEquals("hskt svr neetn!Ti aai eyitrsig", Test1.encrypt("This kata is very interesting!", 1));
        }

        @Test
        public void testDecrypt() {
            // assertEquals("expected", "actual");
            assertEquals("<...OQDXFVAHFWGSHQVNADYG[B]>", Test1.decrypt("<...OQDXFVAHFWGSHQVNADYG[B]>", 0));
            assertEquals("This is a test!", Test1.decrypt("This is a test!", 0));
            assertEquals("This is a test!", Test1.decrypt("hsi  etTi sats!", 1));
            assertEquals("This is a test!", Test1.decrypt("s eT ashi tist!", 2));
            assertEquals("This is a test!", Test1.decrypt(" Tah itse sits!", 3));
            assertEquals("This is a test!", Test1.decrypt("This is a test!", 4));
            assertEquals("This is a test!", Test1.decrypt("This is a test!", -1));
            assertEquals("This kata is very interesting!", Test1.decrypt("hskt svr neetn!Ti aai eyitrsig", 1));
        }

        @Test
        public void testNullOrEmpty() {
            // assertEquals("expected", "actual");
            assertEquals("", Test1.encrypt("", 0));
            assertEquals("", Test1.decrypt("", 0));
            assertEquals(null, Test1.encrypt(null, 0));
            assertEquals(null, Test1.decrypt(null, 0));
        }


}
