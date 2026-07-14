import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MathUtilsTest {

    @Test
    public void testIsEven() {
        MathUtils utils = new MathUtils();
        boolean result = utils.isEven(4);

        // We expect the result to be true since 4 is even
        assertTrue(result, "4 should be an even number");
    }
}