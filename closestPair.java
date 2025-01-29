import java.util.*;

public class closestPair {
    public static void main(String[] args) {
        int nums[]={1,3,5,8,10};
        int target= 14;
        System.out.println(closestPair(nums,target));
    }

    public static int closestPair(int[]nums,int target){
        int closest= Integer.MAX_VALUE;
        for(int i=0;i<nums.length-1;i++){
            int right= nums.length-1;
            
            while(i<right){
                int sum= nums[i]+nums[right];
                if(Math.abs(target-sum)<Math.abs(target-closest)){
                    closest=sum;
                }
                else if(sum<target){
                    i++;
                }
                else if(sum>target){
                    right--;
                }
                else{
                    return closest;
                }
            }
            
        }
        return closest;
    }
}
