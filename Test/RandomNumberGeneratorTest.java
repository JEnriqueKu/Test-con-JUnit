import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import randomNumberGenerator.RandomNumberGenerator;

import static org.junit.Assert.assertTrue;

class RandomNumberGeneratorTest {
    RandomNumberGenerator r;
    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void randomNumber() {
        for (int i = 0; i < 200; i++) {
            int number=r.random();
            assertTrue(number<=10&&number>=1);
        }

    }
}