import org.junit.jupiter.api.Test;
import validadorDeContraseñas.PasswordValidator;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {
    PasswordValidator pv = new PasswordValidator();
    @Test
    void minimumLength() {
        // 8 characters length
        assertTrue(pv.minimumLength("12345678"));
        // 10 characters length
        assertTrue(pv.minimumLength("1234567890"));
        // 7 characters length
        assertFalse(pv.minimumLength("1234567"));
        // 0 characters length
        assertFalse(pv.minimumLength(""));
    }

    @Test
    void containsSpecialCharacters() {
        // contains
        assertTrue(pv.containsSpecialCharacters("123@456"));
        assertTrue(pv.containsSpecialCharacters("123=456"));
        assertTrue(pv.containsSpecialCharacters("123456!"));
        assertTrue(pv.containsSpecialCharacters("´123456"));
        assertTrue(pv.containsSpecialCharacters("}123=456+"));
        // no contains
        assertFalse(pv.containsSpecialCharacters("123456"));
    }

    @Test
    void containsCapital() {
        // contains
        assertTrue(pv.containsCapital("abcdE"));
        assertTrue(pv.containsCapital("Abcde"));
        assertTrue(pv.containsCapital("AbcdE"));
        assertTrue(pv.containsCapital("AbCdE"));
        // no contains
        assertFalse(pv.containsCapital("abcde"));
    }

    @Test
    void containsNumber() {
        // contains
        assertTrue(pv.containsNumber("abcd8"));
        assertTrue(pv.containsNumber("8abcd"));
        assertTrue(pv.containsNumber("ab8cd"));
        assertTrue(pv.containsNumber("abc7d8"));
        assertTrue(pv.containsNumber("1ab0cd8"));
        // no contains
        assertFalse(pv.containsNumber("abcde"));
    }

    @Test
    void securityLevel() {
        // Low
        assertEquals("Low",pv.securityLevel("12345"));
        assertEquals("Low",pv.securityLevel("abcd"));
        assertEquals("Low",pv.securityLevel("123abc"));
        assertEquals("Low",pv.securityLevel("!&/(=?"));
        assertEquals("Low",pv.securityLevel("abc()=?"));
        assertEquals("Low",pv.securityLevel("abcdefghijkl"));
        assertEquals("Low",pv.securityLevel("12ER!"));
        // Acceptable
        assertEquals("Acceptable",pv.securityLevel("12345678"));
        assertEquals("Acceptable",pv.securityLevel("Abcdefgh"));
        assertEquals("Acceptable",pv.securityLevel("!#$%&/()"));
        assertEquals("Acceptable",pv.securityLevel("123ABcde"));
        assertEquals("Acceptable",pv.securityLevel("!#$&%ABcde"));
        // Strong
        assertEquals("Strong",pv.securityLevel("abcdeF@!#123"));
    }
}