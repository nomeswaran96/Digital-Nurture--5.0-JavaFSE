import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        int result = calc.add(2, 3);

        // We expect 2 + 3 to equal 5
        assertEquals(5, result, "2 + 3 should equal 5");
    }
}