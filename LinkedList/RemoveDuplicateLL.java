import java.util.Scanner;

public class RemoveDuplicateLL {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Print p = new Print();
        Insert i = new Insert();
        try {
            Node head = null;
            int n = in.nextInt();
            for (int j = 0; j < n; j++) {
                int data = in.nextInt();
                head = i.insertEnd(head, data);
            }
            p.printIterative(head);
            DuplicateRemoved dr = new DuplicateRemoved();
            head = dr.remove(head);
            p.printIterative(head);
        }finally{
            in.close();
        }
    }
    
}

class DuplicateRemoved{

    public Node remove(Node head) {
        
        if(head == null) return head;

        Node curr = head;
        while(curr!=null && curr.next != null){
            Node next = curr.next;
            if(next.data ==  curr.data){
                curr.next = curr.next.next;
            }
            else curr = curr.next;
        }

        return head;
    }

}
