//calculate all string permutations in a string using recursion

public class stringPermutation {
    public static void generate(String str,String perm){
        if(str.isEmpty()){
            System.out.println(perm);
            return;
        }
        for(int i=0;i<str.length();i++){
            Character ch= str.charAt(i);
            String rem= str.substring(0, i)+str.substring(i+1);
            generate(rem, perm+ch);
        }
    }
    public static void main(String[] args) {
        String str="abcd";
        System.out.println("permutation of "+str+ "is: ");
        generate(str, "");
    }
}
