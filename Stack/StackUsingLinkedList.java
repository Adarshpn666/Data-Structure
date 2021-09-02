public class StackUsingLinkedList {

    public static void main(String[] args) {
        StackLinked st = new StackLinked();

        for(int i=1;i<50;i+=10)st.push(i);

        st.display();

        System.out.println(st.peek()); 
        System.out.println(st.pop()); 
        st.display();
        System.out.println(st.peek());
        System.out.println(st.size());

    }
    
}

class Node{
    int data;
    Node next;
    Node(int x){
        data = x;
        next = null;
    }
}

class StackLinked{
    Node top;
    int size;

    StackLinked(){
        top = null;
        size=0;
    }

    public void push(int x){

        Node temp = new Node(x);
        temp.next = top;
        top  = temp;
        size++;
    }

    public int pop(){
        if(top == null)return -1;
        int res = top.data;
        top = top.next;
        size--;
        return res;
    }

    public int peek(){return top.data;}
    public int size(){return size;}

    public void display(){
        Node curr = top;
        while(curr != null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
        System.out.println();
    }
}
