import java.util.Scanner;

public class NTo1 {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int n  = sc.nextInt();

        System.out.println("Recursive Result N to 1: ");
        recursivePrintNto1(n);
        System.out.println();
        System.out.println("Recursive Result 1 to N: ");
        recursivePrint1toN(n);
        System.out.println();


    }

    private static void recursivePrintNto1(int n) {

        if(n==0){
            return;
        }
        System.out.print(n+" ");
        recursivePrintNto1(n-1);
        return;
    }

    private static void recursivePrint1toN(int n) {

        if(n==0){
            return;
        }
        recursivePrint1toN(n-1);
        System.out.print(n+" ");
        return;
    }


    
}
