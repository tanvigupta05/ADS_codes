public class towersOfHanoi {
    // you are given a three rods and n discs stacked in one rod in an increasing order of size from top to bottom
    // only one disc can be moved at a time
    // a larger disc cannot be plaed on a smaller disc

    //recursive formula- t(n)= 2t(n-1)+1;
    //t(1)=1
    //time complexity= O(2^n)

    //step 1: move n-1 disks from source to auxillary
    // move the Nth disk from source to destination
    // move n-1 disk from auxillary to destination(source helper)

    public static void sh(int n,char sou,char aux, char dest){
        if(n==1){
            System.out.println("move disk 1 from "+sou+ "to "+ dest);
            return;
        }
        sh(n-1,sou,dest,aux);
        System.out.println("move disk "+n+"from "+sou+ " to "+dest);
        sh(n-1,aux,sou,dest);
    }
    public static void main(String[] args) {
        int n=3;
        sh(n,'A','B','C');
    }
}
