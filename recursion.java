//binary search using recursion

public class recursion {
    // types of recursion- 1. direct recursion- a funct. calls itself
    // 2. indirect recursion- a function calls another function which in turn calls
    //

    public static int binarySearch(int[]arr,int target,int left,int right){
        if(left>right){
            return -1;
        }
        int mid= left+(right-left)/2;
        if(arr[mid]==target){
            return mid;
        }else if(arr[mid]>target){
            return binarySearch(arr, target, left, mid-1);
        }else{
            return binarySearch(arr, target, mid+1, right);
        }
    }
    public static void main(String[] args) {
        int[] arr={11,15,18,20,22,25};
        int target=18;
        int index= binarySearch(arr, target, 0,arr.length-1);
        System.out.println(index);
    }
}
