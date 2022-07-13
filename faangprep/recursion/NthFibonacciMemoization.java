package faangprep.recursion;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class NthFibonacciMemoization {


    public int getNthFibanocciMemo(int input){
        Map<Integer, Integer> memoize = new HashMap<>();
        memoize.put(1, 0);
        memoize.put(2, 1);
        return getNthFibanocciMemo(input, memoize);
    }

    public int getNthFibanocciMemo(int input, Map<Integer, Integer> memoize){
        if (!memoize.containsKey(input)) {
            memoize.put(input, getNthFibanocciMemo(input - 1, memoize) + getNthFibanocciMemo(input - 2, memoize));
        }
        return memoize.get(input);
    }

    @Test
    public void testGetNthFibanocciMemoize(){
        NthFibonacciMemoization nthFibanocciMemoization = new NthFibonacciMemoization();
        int expected = 1;
        int actual = nthFibanocciMemoization.getNthFibanocciMemo(3);
        Assert.assertEquals(expected, actual);
    }
}
