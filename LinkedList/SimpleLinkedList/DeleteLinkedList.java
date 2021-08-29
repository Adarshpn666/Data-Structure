package SimpleLinkedList;
import java.util.Scanner;

public class DeleteLinkedList {

    public static void main(String[] args) {
        Insert ins = new Insert();
        Print p = new Print();
        Scanner sc = new Scanner(System.in);
        try {
            Node head = null;
            int n = sc.nextInt();
            for(int i = 0;i<n;i++){
                int data = sc.nextInt();
                head = ins.insertEnd(head, data);
            }
            //p.printIterative(head);
            //After deletion..
            Delete d = new Delete();
            head = d.deleteHead(head);
            p.printIterative(head);
            head = d.deleteEnd(head);
            p.printIterative(head);

        }finally {
            sc.close();
        }
        

    }
    
}
class Delete{

    public Node deleteHead(Node head) {
        if(head == null)return null;
        Node temp = head.next;
        return temp;
    }

    public Node deleteEnd(Node head){
        if(head == null) return null;
        Node curr = head;
        while(curr.next.next != null){
            curr = curr.next;
        }
        curr.next = null;
        return head;
    }

}