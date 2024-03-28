package faangprep.recursion;

import org.junit.Assert;
import org.junit.Test;

public class Palindrome {
    public boolean isPalindrome(String input){
        // Base Case
        if(input.length() == 1 || input.equals("")) return true;
        // Least possible action to shrink the problem space
        // and progress towards the goal
        if (input.charAt(0) == input.charAt(input.length()-1))
            return (isPalindrome(input.substring(1, input.length()-1)));

        // Base case to handle negative scenario [non-palindromes]
        return false;
    }

    @Test
    public void testIsPalindrome(){
        Palindrome palindrome = new Palindrome();
        boolean expected = true;
        boolean actual = palindrome.isPalindrome("kayyyyyyyyyyyyyyyyfdghfyyyyyyyyyyak");
        Assert.assertEquals(expected, actual);
    }
}
