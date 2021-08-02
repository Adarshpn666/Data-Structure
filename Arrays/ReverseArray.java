import java.util.Scanner;

public class ReverseArray {
    
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       int n = sc.nextInt();
       
       int[] array = new int[n];
       
       for(int i=0;i<n;i++)array[i] = sc.nextInt();
       
       reverseArray(array);
       
       System.out.println("Array is reversed");
       for(int i:array)System.out.print(i+" ");
       System.out.println();

    }

    private static boolean reverseArray(int[] array) {
        int i =0, j = array.length-1;
        while(i<j){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
        return true;
    }
}
