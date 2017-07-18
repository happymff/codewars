import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.AssertJUnit.assertEquals;


// TODO: Replace examples and use TDD development by writing your own tests

public class Solution11Test {
    @Test
    public void testSomething() {
        AssertJUnit.assertEquals("10 + 2", Kata.expandedForm(12));
        AssertJUnit.assertEquals("40 + 2", Kata.expandedForm(42));
        AssertJUnit.assertEquals("70000 + 300 + 4", Kata.expandedForm(70304));
        AssertJUnit.assertEquals("70000", Kata.expandedForm(70000));
        AssertJUnit.assertEquals("7", Kata.expandedForm(7));
     }
}