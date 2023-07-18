import discountCalculator.DiscountCalculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertEquals;


class DiscountCalculatorTest {
    DiscountCalculator a;
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void calcular() {
        assertEquals(1125,a.calcular(1500,25),0);
        assertEquals(1350,a.calcular(1500,10),0);
        assertEquals(1500,a.calcular(1500,0),0);
    }
}
