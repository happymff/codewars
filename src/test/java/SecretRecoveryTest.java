/**
 * Created by mff on 2017/7/11.
 */

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SecretRecoveryTest {
    private SecretDetective detective;
    private SecretDetective1 detective1;
    @Before
    public void setup() {
        detective = new SecretDetective();
        detective1 = new SecretDetective1();
    }

    @Test
    public void secret1() {
        char[][] triplets = {
                {'t', 'u', 'p'},
                {'w', 'h', 'i'},
                {'t', 's', 'u'},
                {'a', 't', 's'},
                {'h', 'a', 'p'},
                {'t', 'i', 's'},
                {'w', 'h', 's'}
        };
        //assertEquals("whatisup", detective.recoverSecret(triplets));
        assertEquals("whatisup", detective1.recoverSecret(triplets));
    }
}
