package by.jrr.strings.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordServiceTest {

    PasswordService passwordService;

    @BeforeEach
    public void setUp() {
        passwordService = new PasswordService();
    }

    @Test
    void verify() {
        assertTrue(passwordService.verifyToLeft("1234"));
        assertFalse(passwordService.verifyToLeft(new String("1234")));
        assertFalse(passwordService.verifyToLeft(null));

        assertTrue(passwordService.verifyToRight("1234"));
        assertFalse(passwordService.verifyToRight(new String("1234")));
        assertFalse(passwordService.verifyToRight(null));
    }

    @Test
    void compareWithEquals() {
        assertTrue(passwordService.compareWithEquals("1234"));
        assertTrue(passwordService.compareWithEquals(new String("1234")));
        assertFalse(passwordService.compareWithEquals(null));
    }

    @Test
    void riskyCompareWithEquals() {
        assertTrue(passwordService.riskyCompareWithEquals("1234"));
        assertTrue(passwordService.riskyCompareWithEquals(new String("1234")));
        assertFalse(passwordService.riskyCompareWithEquals(null)); //NPE
    }
}
