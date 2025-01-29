// calculate prime numbers between given left and right range

public class prime {
    public static void main(String[] args) {
        // prime sieve is an algo to efficiently generate all the prime numbers given upto a specified limit.
        //step 1- create a boolean array to store a number is prime or not.
        //step 2- initially mark all numbers from 2 to n as 1(true).
        //step 3- starting from 1st prime(2) mark all multiples of 2 as false. 
        //step 4- move to next number,still marked true and then mark all multiples as false.
        //step 5- continue until you reach sq root of n

        int n=30;
        countPrime(n);
    }

    public static void countPrime(int n){
        boolean[] result = new boolean[n+1];
        for(int i=0;i<=n;i++){
            result[i]= true;
        }
        result[0]=result[1]= false;
        for(int p=2;p*p<=n;p++){
            if(result[p]){
                for(int i=p*p;i<=n;i+=p){
                    result[i]=false;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(result[i]){
                System.out.println(i+" ");
            }
        }
    }
}
