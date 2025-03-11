// to multiply 2 numbers without using multiply operator

public class test2 {
    public static void main(String[] args) {
        int a=-50;
        int b=2;
        System.out.println(multiplyWithoutOperator(a, b));
    }

    public static int multiplyWithoutOperator(int a,int b){
        if(a==0 || b==0){
            return 0;
        }
        int result=0;
        int a1=Math.abs(a);
        int a2= Math.abs(b);

        for(int i=0;i<a2;i++){
            result+=a1;
        }

        if((a<0 && b>0) || (a>0 && b<0)){
            return -result;
        }else{
            return result;
        }
    }
}
