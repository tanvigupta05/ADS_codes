
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;

public class ReverseVowels {
    public static void main(String[] args) {
        ReverseVowels r= new ReverseVowels();
        String s1="hello";
        System.out.println("input: "+s1);
        System.out.println("output: "+ r.reverse(s1));  
    }
    public String reverse(String s){
        if(s==null || s.length()==0){
            return s;
        }
        Set<Character>vowels=new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        char[] chars= s.toCharArray();
        int left=0, right= chars.length;
        while(left<right){
            while(left<right && !vowels.contains(chars[left])){
                left++;
            }
            while(left<right && !vowels.contains(chars[right])){
                right--;
            }
           
            char temp=chars[left];
            chars[left]=chars[right];
            chars[right]=temp;
        }
        return chars.toString();
    }
}
