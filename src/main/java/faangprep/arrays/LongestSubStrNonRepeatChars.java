package faangprep.arrays;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

// Leetcode 3. Longest Substring Without Repeating Characters
public class LongestSubStrNonRepeatChars {
    public static int lengthOfLongestSubstring(String s) {
        int lenOfLongestSubStr = 0;
        if(Objects.isNull(s) || s.isEmpty()){
            return 0;
        }
        else if(s.length() == 1){
            return 1;
        }
        else {
            int left=0;
            HashMap<Character, Integer> findingTracker = new HashMap<>();
            for(int right=0; right < s.length(); right++){
                if(findingTracker.containsKey(s.charAt(right)) && findingTracker.get(s.charAt(right))>= left){
                    left = findingTracker.get(s.charAt(right)) + 1;
                }
                lenOfLongestSubStr = Math.max(lenOfLongestSubStr, right - left + 1);
                findingTracker.put(s.charAt(right),right);
            }
        }
        return lenOfLongestSubStr;
    }

    public static void main(String[] args) {
        System.out.println("lengthOfLongestSubstring >> " + lengthOfLongestSubstring("abcdde"));
    }
}
