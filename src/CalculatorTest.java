import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void testChainedOperations() {
        double result = Calculator.divide(
                            Calculator.multiply(
                                Calculator.add(10, 5), // 15
                                2                        // 30
                            ),
                            3                            // 10
                        );

        assertEquals(10.0, result);
    }

    @Test
    void testAnotherChain() {
        double result = Calculator.subtract(
                            Calculator.multiply(4, 5), // 20
                            Calculator.divide(10, 2)   // 5
                        );

        assertEquals(15.0, result);
    }
}