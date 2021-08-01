import java.util.Scanner;

public class DeletionInArray {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
       int[] array = new int[n];
       for(int i=0;i<n;i++)array[i] = sc.nextInt();
       
       boolean condition = false;
       int N = n;
       while(true){
           if(N==0){condition = true; break;}
           int loc = sc.nextInt();
           sc.nextLine();
           deleteArray(array,loc,N);
           System.out.print("exit y/n: ");
           char opt = sc.nextLine().charAt(0);
           if(opt == 'y')break;
           N--;
       }

       if(condition)System.out.println("Array is empty");
        for(int i:array)System.out.print(i+" ");
        System.out.println();

    }

    private static boolean deleteArray(int[] array, int loc, int N) {
        for(int i=loc;i<N-1;i++){
            array[i] = array[i+1];
        }
        array[N-1] = 0;
        return true;
    }
}
