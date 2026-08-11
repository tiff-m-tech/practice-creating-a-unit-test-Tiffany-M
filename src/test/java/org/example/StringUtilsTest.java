package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {
    // -------- reverse ----------

    // postive: a normal word reverses correctly
    @Test
    public void testReverse() {
        StringUtils stringUtils = new StringUtils();
        assertEquals("tac", stringUtils.reverse("cat"));
    }

    // edge: an empty string should just return an empty string
    @Test
    public void testReverseEmptyString() {
        StringUtils stringUtils = new StringUtils();
        assertEquals("", stringUtils.reverse(""));
    }

    // negative: reversing a non-palindrome should NOT give back the original
    @Test
    public void testReverseNotEqualToOriginal() {
        StringUtils stringUtils = new StringUtils();
        assertNotEquals("cat", stringUtils.reverse("cat"));  // "tac" != "cat"
    }

    // --------- isPalindrome -----------

    // positive: string is the same forward and backwards
    @Test
    public void testIsPalindromeTrue() {
        StringUtils stringUtils = new StringUtils();
        assertTrue(stringUtils.isPalindrome("racecar"));
    }

    // negative: string is not the same forward and backwards
    @Test
    public void testIsPalindromeFalse() {
        StringUtils stringUtils = new StringUtils();
        assertFalse(stringUtils.isPalindrome("cat"));
    }

    // edge: an empty string counts as a palindrome (nothing to mismatch)
    @Test
    public void testIsPalindromeEmptyString() {
        StringUtils stringUtils = new StringUtils();
        assertTrue(stringUtils.isPalindrome(""));
    }

}