import java.util.*;

public class Chaining{

    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int b = sc.nextInt();
        MyBucket bucket = new MyBucket(b);

        bucket.addBucket(23);
        bucket.addBucket(3);
        System.out.println(bucket.search(23));
        bucket.removeBucket(23);
        System.out.println(bucket.search(23));
        
    }
}

class MyBucket{
    private int bucket;
    private ArrayList<LinkedList<Integer>> hashTable;

    MyBucket(int b){
        bucket = b;
        hashTable = new ArrayList<>();
        for (int i = 0; i < b; i++) {
            hashTable.add(new LinkedList<Integer>());
        }
    }

    public void addBucket(int value){
        int i = value%bucket;
        hashTable.get(i).add(value);
    }

    public void removeBucket(int key){
        int i = key%bucket;
        hashTable.get(i).remove((Integer)key); 
    }

    public boolean search(int key){
        int i = key%bucket;
        return hashTable.get(i).contains(key);
    }
}