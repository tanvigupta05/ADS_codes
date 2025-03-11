// stack- lifo, linear ds, push,pop
import java.util.*;
public class stack{
    public static void main(String[] args) {
        Stack<Object> n= new Stack<>();
        n.push(1);
        n.push("neeraj");
        n.push(123456);
        System.out.println(n);
        System.out.println(n.peek());
        System.out.println(n.isEmpty());
    }
}