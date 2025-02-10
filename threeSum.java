//3 sum closest (16 lc)

import java.util.*;
public class threeSum {
    public static void main(String[] args) {
        int nums[]={-1,2,1,-4};
        int target= 1;
        System.out.println(SumOfThree(nums,target));
    }

    public static int SumOfThree(int[]nums,int target){
        Arrays.sort(nums);
        int closestsum= Integer.MAX_VALUE;
        for(int i=0;i<nums.length-2;i++){
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int currentsum= nums[i]+nums[left]+nums[right];
                if(Math.abs(target-currentsum)<Math.abs(target-closestsum)){
                    closestsum= currentsum;
                }
                if(currentsum<target){
                    left++;
                }
                else if(currentsum>target){
                    right--;
                }
                else{
                    return currentsum;
                }
            }
        }
        return closestsum;
    }

}
