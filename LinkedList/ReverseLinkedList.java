import java.util.ArrayList;
import java.util.Scanner;

public class ReverseLinkedList {

    public static void main(String[] args) {
        Insert i = new Insert();
        Print p = new Print();
        Scanner in = new Scanner(System.in);
        try{
            Node head = null;
            int n = in.nextInt();
            for (int j = 0; j < n; j++) {
                int data = in.nextInt();
                head = i.insertEnd(head, data);
            }
            //p.printIterative(head);
            //After reverse
            ReverseIterative ri = new ReverseIterative();
            ReverseRecursive rr = new ReverseRecursive();
            head = rr.reverseMethod2(head,null);
            p.printIterative(head);
            head = ri.reverseEfficent(head);
            p.printIterative(head);

        }finally{
            in.close();
        }
        
    }
    
}
class ReverseIterative{
    public Node reverseNaive(Node head) {
        if(head == null) return head;
        ArrayList<Integer> arr = new ArrayList<>();
        Node curr = head;
        while (curr!=null){arr.add(curr.data); curr = curr.next;}

        curr = head;
        while(curr!=null){curr.data = arr.remove(arr.size()-1); curr = curr.next;}

        return head;
    }

    public Node reverseEfficent(Node head) {
        if(head == null) return head;
        Node prev = null, curr = head;
        while(curr!=null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next; 
        }

        return prev;

    }
}

class ReverseRecursive{
    public Node reverseMethod1(Node head) {
        if(head==null || head.next ==null)return head;

        Node tail = head.next;
        Node node = reverseMethod1(tail);
        tail.next = head;
        head.next = null;
        return node;  
    }

    public Node reverseMethod2(Node head, Node prev) {
        if(head==null)return prev;
        Node next = head.next;
        head.next = prev;
        prev = head;

        return reverseMethod2(next, prev);

    }
}
