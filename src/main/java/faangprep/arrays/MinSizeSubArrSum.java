package faangprep.arrays;

// 209. Minimum Size Subarray Sum
public class MinSizeSubArrSum {
    public static int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int left = 0;
        int result = Integer.MAX_VALUE;

        for(int right = 0; right< nums.length; right++){
            sum += nums[right];
            while (sum >= target){
                // Found the solution, record it!
                result = Math.min(right-left+1, result);
                //but now need to shrink window and check if there is a better window size
                sum -= nums[left];
                left++;

            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        int target = 7;
        System.out.println("Answer :: " + minSubArrayLen(target, nums));
    }
}
