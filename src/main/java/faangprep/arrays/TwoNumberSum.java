package faangprep.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TwoNumberSum {
   /*
    Write a function that takes in a non-empty array of distinct integers and an
    integer representing a target sum. If any two numbers in the input array sum
    up to the target sum, the function should return them in an array, in any
    order. If no two numbers sum up to the target sum, the function should return
    an empty array.

    Note that the target sum has to be obtained by summing two different integers
    in the array; you can't add a single integer to itself in order to obtain the
    target sum.

    You can assume that there will be at most one pair of numbers summing up to
    the target sum.

    Sample I/P :
        array  = [3, 5, -4, 8, 11, 1, -1, 6];
        targetSum = 10;
    Sample O/P :
        [-1, 11]
    */
   // return the pair --> Actual Numbers
   public int[] twoSum(int[] nums, int target) {
        //nums[i] -> nums[i] - target = complement
      // [1,3,-2,1,3] ; target = 1
      Set<Integer> countRegister = new HashSet<>();
      for(int num : nums){
         int complement = target - num;
         if(countRegister.contains(complement)){
            return new int[]{num, complement};
         }
         else countRegister.add(num);
      }
      return new int[]{};
   }

   //return the indices of the pair
   public int[] twoSum_ReturnIndices(int[] nums, int target) {
      //nums[i] -> nums[i] - target = complement
      // [1,3,-2,1,3] ; target = 1
      Set<Integer> countRegister = new HashSet<>();
      for(int num : nums){
         int complement = target - num;
         if(countRegister.contains(complement)){
            return new int[]{num, complement};
         }
         else countRegister.add(num);
      }
      return new int[]{};
   }
}
