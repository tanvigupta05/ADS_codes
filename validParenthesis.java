// LC 20
import java.util.*;
public class validParenthesis {
    public static void main(String[] args) {
        String str="{[()]}";
        System.out.println("is valid: "+isval(str) );
    }

    public static boolean isval(String s){
        Stack<Character> stack = new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='['){
                stack.push(ch);
            }else{
                if(stack.isEmpty()) return false;
                char top=stack.pop();
                if((ch==')' && top!='(') || (ch=='}' && top!='{') || (ch==']' && top!='[')){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
