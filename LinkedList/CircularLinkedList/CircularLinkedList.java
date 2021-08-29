package CircularLinkedList;

public class CircularLinkedList{
    public static void main(String[] args) {

        Node head = null;
        Insert ins = new Insert();
        Delete dl = new Delete();
        for (int i = 1;i<5;i++){
            head =ins.insertBegin(head, i);
        } 
        head.printCircularList(head);
        head =dl.deleteKth(head,4);      
        head.printCircularList(head);
    }
}

class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }

    public void printCircularList(Node head){
        if(head==null)return;

        Node curr = head;
        do{
            System.out.print(curr.data+" ");
            curr = curr.next;
        }while(curr!=head);
        System.out.println();
    }
    
}

class Insert{
    public Node insertBegin(Node head, int data){
        Node temp = new Node(data);
        if(head==null){
            temp.next = temp;
            return temp;
        }
        temp.next = head.next;
        head.next = temp;

        int t = temp.data;
        temp.data =  head.data;
        head.data = t;

        return head;
    }

    public Node insertBeginNaive(Node head, int data){
        Node temp = new Node(data);
        if(head==null){
            temp.next = temp;
            return temp;
        }
        Node curr = head;
        while(curr.next!=head)curr = curr.next;

        temp.next = head;
        curr.next = temp;

        return temp;
    }


    public Node insertEnd(Node head, int data){
        Node temp = new Node(data);
        if(head==null){
            temp.next = temp;
            return temp;
        }

        temp.next = head.next;
        head.next = temp;

        int t = head.data;
        head.data = temp.data;
        temp.data = t;

        return temp;
    }
}

class Delete{
    public Node deleteHead(Node head) {
        if(head==null || head.next == head) return null;

        head.data = head.next.data;
        head.next = head.next.next;

        return head;

    }

    public Node deleteKth(Node head,int k){
        if(head==null)return null;
        if(k==1)return deleteHead(head);

        Node curr = head;
        int count=1;
        while(count<k-1){
            curr = curr.next;
            count++;
        }
        curr.next = curr.next.next;
        return head;
    }
}