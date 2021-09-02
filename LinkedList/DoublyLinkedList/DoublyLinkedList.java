public class DoublyLinkedList{
    public static void main(String[] args) {
        DoubleNode head = null;
        Insert ins = new Insert();
        for(int i=1;i<6;i++){
            head = ins.insertEnd(head, i);
        }
        head.print(head);
        Delete d = new Delete();
        head = d.deleteHead(head);
        head.print(head);
        head = d.deleteEnd(head);
        head.print(head);
        Reverse r = new Reverse();
        head = r.reverseList(head);
        head.print(head);
    }
}

class DoubleNode{
    int data;
    DoubleNode prev;
    DoubleNode next;

    DoubleNode(int d){
        data = d;
        prev = null;
        next = null;
    }

    public void print(DoubleNode head) {
        if(head == null)return;
        while(head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }
}

class Insert{
    public DoubleNode insertBegin(DoubleNode head, int data ){

        DoubleNode temp = new DoubleNode(data);
        if(head == null){
            return temp;
        }
        head.prev = temp;
        temp.next = head;

        return temp;
    }

    public DoubleNode insertEnd(DoubleNode head, int data ){

        DoubleNode temp = new DoubleNode(data);
        if(head == null) return temp;

        DoubleNode curr = head;
        while(curr.next != null){
            curr = curr.next;
        }

        curr.next = temp;
        temp.prev = curr;

        return head;
        
    }
}

class Delete{
    public DoubleNode deleteHead(DoubleNode head) {
        
        if(head == null || head.next == null)return null;

        head.next.prev = null;
        return head.next;
    }

    public DoubleNode deleteEnd(DoubleNode head) {
        
        if(head == null || head.next == null)return null;

        DoubleNode curr = head;
        while(curr.next.next!=null)curr = curr.next;

        curr.next = null;
        return head;
    }
}

class Reverse{
    public DoubleNode reverseList(DoubleNode head){
        if(head == null || head.next == null){
            return head;
        }
        DoubleNode prev = head.prev;
        while(head!=null){
            head.prev = head.next;
            head.next = prev;
            prev = head;
            head = head.prev;    
        }

        return prev;

    }
}

