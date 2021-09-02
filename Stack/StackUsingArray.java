import java.util.ArrayList;

public class StackUsingArray {

    public static void main(String[] args) {
        StackArray st = new StackArray();

        for(int i=1;i<50;i+=10)st.push(i);

        st.display();

        System.out.println(st.peek()); 
        System.out.println(st.pop()); 
        st.display();
        System.out.println(st.peek());
        System.out.println(st.size());

    }
    
}

class StackArray{
    ArrayList<Integer> arr;
    int size;
    int top;

    StackArray(){
        arr = new ArrayList<>();
        size = 0;
        top =-1;
    }

    public void push(int x){
        arr.add(x);
        top++;
        size++;
    }

    public int pop(){
        if(top==-1)return -1;

        int res  = arr.get(top);
        arr.remove(top);
        top--;
        size--;

        return res;
    }

    public int size(){
        return size;
    }

    public int peek(){
        return arr.get(top);
    }

    public void display(){
        for (int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

}
