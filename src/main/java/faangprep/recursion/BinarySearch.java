package faangprep.recursion;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearch {
    public int binarySearch(int[] inputList, int left, int right, int target){
        // [-1, 0, 2, 6, 25, 88]
        // Divide and Conquer
        // 1. Find the mid point
        // 2 . Split the input Arr into 2, out of the midpoint
        // 3 . Recursively search, based on target < or > the mid

        // --> Array should be sorted. Otherwise cannot perform a Binary Search
        if(inputList[left] > inputList[right]) return -1;

        // --> Calculate the Mid
        int mid = (left + right) / 2;

        // --> Base Case *****
        if(target == inputList[mid]) return mid;

        // --> Divide the search space based on target's position
        // If target is on left search space
        if(target < inputList[mid])
            return binarySearch(inputList, left, mid-1, target);

        // if target is on the rights search space
        return binarySearch(inputList, mid+1, right, target);
    }

    @Test
    public void testBinarySearch(){
        BinarySearch binarySearch = new BinarySearch();
        int[] inputList = {-1, 0, 2, 6, 25, 88};
        int expected = 4;
        int actual = binarySearch.binarySearch(inputList, 0, inputList.length-1, 25);
        Assert.assertEquals(expected, actual);
    }
}
