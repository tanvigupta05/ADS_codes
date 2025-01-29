// Kadane's algorithm (O(n))

import java.util.*;

public class Kadanes{
    public static void main(String[] args) {
        // steps, 1.initialization 2.Iteration 3.Comparison 
        int nums[]= {1,-2,3,4,-1,2,1,-5,4};
        System.out.println("maximum subarray sum: "+ maxSubarray(nums));
    }
    public static int maxSubarray(int[] nums){
        if(nums.length==0 || nums==null){
            return 0;
        }
        int sum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int num:nums){
            sum=Math.max(num,sum+num);
            maxsum=Math.max(sum,maxsum);
        }
        return maxsum;
    }
}