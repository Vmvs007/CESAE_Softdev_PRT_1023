package Ex_02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {
    @Test
    void isPalindromeTest() {
        // assertEquals(true, StringUtils.isPalindrome("ovo"));
        assertTrue(StringUtils.isPalindrome("ovo"));
        assertTrue(StringUtils.isPalindrome("radar"));
        assertTrue(StringUtils.isPalindrome("Radar"));
        assertTrue(StringUtils.isPalindrome("radar ovo radar"));


        assertFalse(StringUtils.isPalindrome("vitor"));
        assertFalse(StringUtils.isPalindrome("isto não é um palindromo"));

        assertFalse(StringUtils.isPalindrome(null));
    }
}