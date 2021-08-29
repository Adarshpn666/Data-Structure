package SimpleLinkedList;

public class SearchLinkedList {
    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(10);
        head.next.next = new Node(20);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);
        System.out.println("Location: "+ searchIterative(head,20));
        System.out.println("Location: "+ searchRecursive(head,30,0));
        System.out.println("Middle data: (naive) " + findMiddleNaive(head));
        System.out.println("Middle data: (Efficient) " + findMiddleEfficient(head));

    }
    private static int searchRecursive(Node head, int value, int location) {
        if(head == null)return -1;
        if(head.data == value)return location;
        return searchRecursive(head.next,value,location+1);
    }
    public static int searchIterative(Node head, int value){
        int location = 0;
        while (head != null){
            if(head.data == value)return location;
            location += 1;
            head  = head.next;
        }
        return -1;
    }

    public static int findMiddleNaive(Node head){
        int length = 0;
        Node curr = head;
        while(curr!=null){
            curr = curr.next;
            length++;
        }
        if(length == 0)return -1;
        curr  = head;
        for(int i=0;i<length/2;i++){
            curr = curr.next;
        }
        return curr.data;
    }

    public static int findMiddleEfficient(Node head){
        if(head == null) return -1;
        Node first = head, last = head;
        while(last!=null && last.next != null){
            last = last.next.next;
            first = first.next;
        }
        return first.data;
    }

    
}
