// checking if string is plaendrome (ignoring non alphanumrec)

public class PalindromeCheck {
    public static void main(String[] args) {
        String s="hello";
        int left=0;
        int right= s.length()-1;
        while(left<right){
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))){
                System.out.println("false");
            }
            left++;
            right--;
        }
        System.out.println("true");
    }
}
