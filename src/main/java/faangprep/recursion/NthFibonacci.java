package faangprep.recursion;

import org.junit.Assert;
import org.junit.Test;

public class NthFibonacci {
    public int getNthFibanocci(int input){
        // Base Case
        if(input == 1) return 0;
        else if(input == 2) return 1;
        else
        // Reduce the problem space
        return getNthFibanocci(input-1) + getNthFibanocci(input-2);
    }

    @Test
    public void testNthFib(){
        NthFibonacci nthFibonacci = new NthFibonacci();
        int expected = 5;
        int actual = nthFibonacci.getNthFibanocci(6);
        Assert.assertEquals(expected, actual);
    }
}
