import java.util.*;

public class ques1 {
    public static int longestSubarray(int[] nums, int k) {
        if (nums == null || nums.length == 0) return 0;
        HashMap<Integer, Integer> result = new HashMap<>();
        int curr = 0;
        int max = 0;
        
        result.put(0, -1);
        
        for (int i = 0; i < nums.length; i++) {
            curr += nums[i];
            if (result.containsKey(curr - k)) {
                int start = result.get(curr - k);
                max = Math.max(max, i - start);
            }
            if (!result.containsKey(curr)) {
                result.put(curr, i);
            }
        }
        
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 1, 5, -1};
        int k = 5;
        System.out.println("Longest subarray length with sum " + k + " is: " + longestSubarray(nums, k));
    }
}
