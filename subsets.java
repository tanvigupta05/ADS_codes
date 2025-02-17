// LC question 78 - calculate all subsets of given array
import java.util.*;

public class subsets {
    public static void gs(int[]nums, int in,List<Integer>curr,List<List<Integer>>res){
        res.add(new ArrayList<>(curr));
        for(int i=in;i<nums.length;i++){
            curr.add(nums[i]);
            gs(nums,i+1,curr,res);
            curr.remove(curr.size()-1); //it removes the last added element (backtracking) so that it can try the next possibility.
        }
    }
    public static List<List<Integer>> subsets(int[]nums){
        List<List<Integer>> res= new ArrayList<>();
        gs(nums,0,new ArrayList<>(),res);
        return res;
    }
    public static void main(String[] args) {
        int [] nums={1,2,3};
        System.out.println(subsets(nums));
    }
}
