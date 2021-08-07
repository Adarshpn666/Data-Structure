
import java.util.*;


//given example is of linear Probing..
public class OpenAddressing{

    //private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        MyHash hash =  new MyHash(7);
      
        hash.add(49);
        hash.add(63);
        hash.add(78);
        hash.add(23);
        System.out.println(hash.search(49));
        System.out.println(hash.search(23));
        hash.remove(23);
        System.out.println(hash.search(23));
        ArrayList<Integer> arr = hash.getHashTable();

        for (Integer integer : arr) {
            System.out.print(integer+" ");
        }

        System.out.println();
        
    }
}

class MyHash{
    private int cap, size;
    private ArrayList<Integer> hashTable;

    MyHash(int c){
        cap = c;
        size = 0;
        hashTable = new ArrayList<>();
        for (int i = 0; i < cap; i++) {
            hashTable.add(-1);
        }
    }

    private int hashfunction(int key){
        return key%cap;
    }

    public boolean add(int key){

        if(size == cap)return false;
        int h = hashfunction(key);
        int i = h;
        while(hashTable.get(i)!=-1 && hashTable.get(i) != -2 && hashTable.get(i) != key ){
             i = (i+1)%cap;
             if(i==h)return false;
        }        
        if(hashTable.get(i) == key)return false;

        hashTable.add(i, key);
        size++;
        return true;
    }

    public boolean remove(int key){
        
        int h = hashfunction(key);
        int i = h;

        while(hashTable.get(i)!=-1){
            if(hashTable.get(i) == key){
                hashTable.remove(i) ;
                hashTable.add(i,-2);              
                return true;
            }
            i = (i+1)%cap;
            if(i==h)return false;
        }
        return false; 
    }


    public boolean search(int key){

        int h = hashfunction(key);
        int i = h;

        while(hashTable.get(i)!=-1){
            if(hashTable.get(i) == key)return true;
            i = (i+1)%cap;
            if(i==h)return false;
        }
        return false; 
    }

    public ArrayList<Integer> getHashTable() {
        return hashTable;
    }
}