import conversionTemperatura.TemperatureConverter;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;


class TemperatureConverterTest {

    TemperatureConverter tc;

    @BeforeEach
    void setUp() {
      tc = new TemperatureConverter();

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void conversorFahrenheit() {
        assertEquals(82.4, tc.conversorFahrenheit(28),0);
        assertEquals(-18.4, tc.conversorFahrenheit(-28),0);

    }

    @Test
    void conversorKelvin() {
        assertEquals(301.15, tc.conversorKelvin(28),0);
    }


    @Test
    void conversorFahrenheitCelsius() {
        assertEquals(28, tc.conversorFahrenheitCelsius(82.4), 0.5);
    }
}