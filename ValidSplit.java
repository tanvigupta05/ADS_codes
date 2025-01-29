// count valid array splits

public class ValidSplit{
    public static void main(String[]args){
        int[] arr= {10,4,-8,7};
        long result= validsplit(arr);
        System.out.println(result);
    }
    public static long validsplit(int[] arr){
        int totalsum=0;
        for(int num:arr){
            totalsum+=num;
        }
        int leftsum=0;
        long validsum=0;
        for(int i=0;i<arr.length-1;i++){
            leftsum+=arr[i];
            int rightsum=totalsum-leftsum;
            if(leftsum>=rightsum){
                validsum++;
            }
        }
        return validsum;
    }

}