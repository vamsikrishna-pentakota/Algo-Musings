package faangprep.recursion;

import org.junit.Assert;
import org.junit.Test;

import java.util.Objects;
// Reverse a string using recursion
public class StringReversal {
    public String reverseString(String input){
        // Base Case
        if(Objects.equals(input, "")) return "";
        return reverseString(input.substring(1)) + input.charAt(0);
    }

    @Test
    public void testStringReversal(){
        StringReversal stringReversal = new StringReversal();
        Assert.assertEquals("u" , stringReversal.reverseString("u"));
        Assert.assertEquals("ismav" , stringReversal.reverseString("vamsi"));
    }
}
