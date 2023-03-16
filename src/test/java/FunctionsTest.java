import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FunctionsTest {
    Functions functions = new Functions();
    private static final double DELTA = 1e-15;

    @Test
    public void factorialValid() {
        assertEquals(24, functions.factorial(4));
    }

    @Test (expected = IllegalArgumentException.class)
    public void factorialInvalid() {
        functions.factorial(-1);
    }

    @Test
    public void powerValid() {
        assertEquals(Math.pow(2.0, 3.0), functions.power(2.0, 3.0), DELTA);
    }

    @Test
    public void logeValid() {
        assertEquals(Math.log(4.0), functions.loge(4.0), DELTA);
    }

    @Test (expected = IllegalArgumentException.class)
    public void logeInvalid() {
        functions.loge(0);
    }

    @Test
    public void sqrootValid() {
        assertEquals(Math.sqrt(4.0), functions.sqroot(4.0), DELTA);
    }

    @Test (expected = IllegalArgumentException.class)
    public void sqrootInvalid() {
        functions.sqroot(-1);
    }
}
