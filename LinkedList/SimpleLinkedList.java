class Node{
    int data;
    Node next;//java object is by default null if not allocated
    Node(int x){
        data = x;
        //next = null;
    }
}

class Print{

    public  void printRecursive(Node head) {
        if(head==null)return;
        System.out.print(head.data+" ");
        printRecursive(head.next);
    }

    public  void printIterative(Node head) {
        Node traverse = head;
        while(traverse !=null){
            System.out.print(traverse.data+" ");
            traverse = traverse.next;
        }
        System.out.println();
    }

}

public class SimpleLinkedList {
    
    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(10);
        head.next.next = new Node(20);
        head.next.next.next = new Node(40);
        Print p = new Print();
        p.printIterative(head);
        p.printRecursive(head);
        System.out.println();

    }


}
