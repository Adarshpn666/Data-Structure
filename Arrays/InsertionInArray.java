import java.util.*;

public class InsertionInArray {
    
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
       int[] array = new int[n];
       
       boolean condition = false;
       int N = 0;
       while(true){
           if(array.length<=N){condition = true; break;}
           int value = sc.nextInt();
           int loc = sc.nextInt();
           insertArray(array, value, loc, N);
           N++;
       }

       if(condition)System.out.println("Array is full");
       for(int i:array)System.out.print(i+" ");
       System.out.println();
       

    }
    private static boolean insertArray(int[] array, int value, int loc, int N) {
        for(int i=N-1;i>=loc;i--){
            array[i+1] = array[i];
        }
        array[loc] = value;
        return true;
    }

    
}