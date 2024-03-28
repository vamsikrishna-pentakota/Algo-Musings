package faangprep.arrays;

// 209. Minimum Size Subarray Sum
public class MinSizeSubArrSum {
    public static int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;
        return min;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        int target = 7;
        System.out.println("Answer :: " + minSubArrayLen(target, nums));
    }
}
