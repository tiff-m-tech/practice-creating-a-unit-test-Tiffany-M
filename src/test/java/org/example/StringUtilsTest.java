package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {
    private StringUtils stringUtils;

    @BeforeEach
    public void createTestData() {
        stringUtils = new StringUtils();   // fresh object before each test
    }

    // -------- reverse ----------

    // positive case: a normal word reverses correctly
    @Test
    public void testReverse() {
        assertEquals("tac", stringUtils.reverse("cat"), "reverse() should return the input with its characters in reverse order");
    }

    // negative case: reversing a non-palindrome should NOT give back the original
    @Test
    public void testReverseNotEqualToOriginal() {
        assertNotEquals("cat", stringUtils.reverse("cat"), "reverse() of a non-palindrome should not equal the original string");  // "tac" != "cat"
    }

    // edge case: an empty string should just return an empty string
    @Test
    public void testReverseEmptyString() {
        assertEquals("", stringUtils.reverse(""), "reverse() of an empty string should return an empty string");
    }

    // --------- isPalindrome -----------

    // positive case: string is the same forward and backwards
    @Test
    public void testIsPalindromeTrue() {
        assertTrue(stringUtils.isPalindrome("racecar"), "isPalindrome() should return true for a word that reads the same backwards");
    }

    // negative case: string is not the same forward and backwards
    @Test
    public void testIsPalindromeFalse() {
        assertFalse(stringUtils.isPalindrome("cat"), "isPalindrome() should return false for a word that differs when reversed");
    }

    // edge case: an empty string counts as a palindrome (nothing to mismatch)
    @Test
    public void testIsPalindromeEmptyString() {
        assertTrue(stringUtils.isPalindrome(""), "isPalindrome() should return true for an empty string");
    }

}