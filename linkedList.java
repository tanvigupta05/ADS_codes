//LC 141
// detect if cycle is present in linked list
import java.util.*;

class LN{
    int val;
    LN next;
    LN(int x){
        val=x;
        next=null;
    }
}

public class linkedList {
    // Approach: Floyds Cycle Algo
    // use two pointers, slow moves 1 step and fast moves 2 step
    // if slow and fast meets, cycle exists.
    // to remove cycle: start the pointer from head 
    // move the pinters at the same speed until they meet at the start of the cycle
    // find the last node and remove the cycle

    public static boolean hascycle(LN head){
        LN slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) return true;
        }
        return false;
    }

    public static void remove(LN head){
        LN slow=head;
        LN fast=head;
        boolean cycle = false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                cycle=true;
                break;
            }
        }
        if(!cycle) return;
        slow=head;
        while(slow.next!=fast.next){
            slow=slow.next;
            fast=fast.next;
        }
        fast.next=null;
    }
    public static void main(String[] args) {
        LN head=new LN(1);
        head.next=new LN(2);
        head.next.next= new LN(3);
        head.next.next.next= new LN(4);
        head.next.next.next.next= head.next;
        System.out.println("detected "+hascycle(head));
        remove(head);
        System.out.println("cycle removed "+hascycle(head));
    }
}
