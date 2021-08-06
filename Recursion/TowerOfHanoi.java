import java.util.Scanner;

public class TowerOfHanoi {


    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int n  = sc.nextInt();

        //time complexity O(2^n)
        System.out.println("Tower of hanoi: ");
        towerOfHanoi(n,"A","B","C");

    }

    private static void towerOfHanoi(int n, String a, String b, String c) {  

        if (n == 1){
            System.out.println("Move 1 from "+a+" to "+c);
            return;
        }
        towerOfHanoi(n-1, a, c, b);
        System.out.println("Move "+n+ " from "+a+" to "+c);
        towerOfHanoi(n-1,b,a,c);



    }
    
}
