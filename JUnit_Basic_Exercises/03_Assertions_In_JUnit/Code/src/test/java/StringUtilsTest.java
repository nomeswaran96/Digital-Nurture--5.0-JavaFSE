import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @Test
    public void testVariousAssertions() {
        StringUtils utils = new StringUtils();

        // 1. assertEquals - checking exact values
        assertEquals("cba", utils.reverse("abc"), "The string should be reversed");

        // 2. assertNull - checking for null handling
        assertNull(utils.reverse(null), "Reversing null should return null");

        // 3. assertTrue - checking boolean logic
        assertTrue(utils.isPalindrome("racecar"), "racecar is a palindrome");

        // 4. assertFalse - checking negative boolean logic
        assertFalse(utils.isPalindrome("hello"), "hello is not a palindrome");
    }
}
