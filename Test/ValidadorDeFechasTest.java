import ValidadorDeFechas.ValidadorDeFechas;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ValidadorDeFechasTest {

    ValidadorDeFechas vf = new ValidadorDeFechas();
    @Before
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void validadorDeFecha() {
        // dia valido
        assertTrue(vf.ValidadorDeFecha(2024,02,29));
        // dia inválido
        assertFalse(vf.ValidadorDeFecha(2024,02,30));
    }
}