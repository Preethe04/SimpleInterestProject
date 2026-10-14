import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SimpleInterestTest {
    @Test void standardInterest() { assertEquals(1000.0, SimpleInterest.calculate(10000, 5, 2), 0.00001); }
    @Test void zeroPrincipal() { assertEquals(0.0, SimpleInterest.calculate(0, 5, 2), 0.00001); }
    @Test void zeroRate() { assertEquals(0.0, SimpleInterest.calculate(1000, 0, 2), 0.00001); }
    @Test void fractionalRate() { assertEquals(75.0, SimpleInterest.calculate(1000, 2.5, 3), 0.00001); }
    @Test void rejectsNegativeInput() { assertThrows(IllegalArgumentException.class, () -> SimpleInterest.calculate(-1, 5, 2)); }
}
