import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FunctionsTest {
    Functions functions = new Functions();

    @Test
    public void factorialPositive() {
        assertEquals("Computing factorial of a positive number", 24, functions.factorial(4));
    }
}
