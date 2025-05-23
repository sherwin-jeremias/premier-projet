import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatriceTest {

    private Calculatrice calc;

    @BeforeEach
    public void setUp() {
        calc = new Calculatrice();
    }

    @Test
    public void testAdd() {
        assertEquals(5.0f, calc.add(2.0f, 3.0f));
    }

    @Test
    public void testDiv() {
        assertEquals(2.0f, calc.div(4.0f, 2.0f));
    }

    @Test
    public void testDivByZero() {
        assertThrows(ArithmeticException.class, () -> calc.div(4.0f, 0.0f));
    }

    @Test
    public void testMult() {
        assertEquals(6.0f, calc.mult(2.0f, 3.0f));
    }
}
