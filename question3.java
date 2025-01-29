// sliding window 

public class question3 {
    public static void main(String[] args) {
        int[] arr= {2,3,1,2,4,3};
        int target=7;
        System.out.println(length(arr, target));
    }

    public static int length(int[]nums,int target){
        int max=Integer.MIN_VALUE;
        int j=0,sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(sum>=target){
                max= Math.max(max,i-j+1);
                sum= sum-nums[j++];
            }
        }
        return max;

    }
}
