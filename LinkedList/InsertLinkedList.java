import java.util.Scanner;

public class InsertLinkedList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try{
        int n = sc.nextInt();
        Node head = null;
        Insert ins = new Insert();
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            head = ins.sortedInsert(head, data);
        }
        
        Print p = new Print();
        //p.printIterative(head);
        head = ins.insertPos(head,5,23);
        p.printIterative(head);


        }finally{
            sc.close();
        }



    }
}

class Insert{

    public  Node insertBegin(Node head, int data) {
        if(head==null){
            head = new Node(data);
            return head;
        }
        Node newHead = new Node(data);
        newHead.next = head;
        return newHead;
    }

    public Node insertEnd(Node head, int data){
        if(head==null){
            head = new Node(data);
            return head;
        }
        Node curr = head;
        while(curr.next!=null){
            curr = curr.next;
        }
        Node temp = new Node(data);
        curr.next = temp; 
        return head; 
    }

    public Node insertPos(Node head, int pos, int data){
       
        Node node = new Node(data);
        if(pos==1){
            node.next = head;
            return node;
        }
        Node curr = head;
        for(int count = 1;count!=pos-1 && curr != null;count++){
            curr = curr.next;
        }
        if(curr == null)return head;
        Node temp = curr.next;
        curr.next = node;
        node.next = temp;

        return head;

        
    }

    public Node sortedInsert(Node head, int data) {
        
        Node node = new Node(data);
        if(head==null){
            return node;
        }
        if(head.data > data){
            node.next = head;
            return node;
        }
        Node curr = head;
        while(curr.next!=null && curr.next.data < data){
            curr = curr.next;
        }

        Node temp = curr.next;
        curr.next = node;
        node.next = temp;

        return head;
    }

    public Node insertNthFromEnd(Node head, int n, int data){
        if(head==null){
            return head;
        }
        Node first = head, last = head;
        while(last!=null && n-- > 0)last = last.next;
        while(last!=null){
            first = first.next;
            last = last.next;
        }
        Node temp = first.next;
        Node insert = new Node(data);
        first.next = insert;
        insert.next = temp;

        return head;
        
    }
}