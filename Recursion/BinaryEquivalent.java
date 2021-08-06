import java.util.Scanner;

public class BinaryEquivalent {


    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int n  = sc.nextInt();

        System.out.println("Recursive Binary Equivalent Result : ");
        binaryEquivalent(n);
        System.out.println();


    }

    private static void binaryEquivalent(int n) {

        if(n==0){
            return;
        }
        
        binaryEquivalent(n/2);
        System.out.print(n%2);
        return;
    }
    
}
