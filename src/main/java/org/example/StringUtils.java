package org.example;

public class StringUtils {
    // Returns the input string reversed
    public String reverse(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >=0; i--) {
            reversed = reversed + input.charAt(i);
        }
        return reversed;
    }


    // Returns true if the words is a palindrome (reads the same backwards)
    public boolean isPalindrome(String word) {
        String reversed = reverse(word); // Call my method above!
        return word.equals(reversed);
    }

}
