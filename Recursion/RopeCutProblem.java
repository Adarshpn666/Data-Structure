import java.util.Scanner;

public class RopeCutProblem {

    /**
     * find maximun number of ropes can be made from rope length n
     * with size a, b, c different lengths.
     * 
     */ 

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int n  = sc.nextInt(),a  = sc.nextInt(),b  = sc.nextInt(),c  = sc.nextInt();

        //Time complexity of this solution is O(3^n)
        //we better solution for this Program in dynamic programing.
        System.out.println("Max Rope can be made : "+ropeCutSolution(n,a,b,c));

    }

    private static int ropeCutSolution(int n, int a, int b, int c) {  
        if(n == 0)return n;
        if(n<0) return -1;

        int x = ropeCutSolution(n-a,a,b,c);
        int y = ropeCutSolution(n-b,a,b,c);
        int z = ropeCutSolution(n-c,a,b,c);

        return Math.max(x, Math.max(y,z))==-1?-1:1+Math.max(x, Math.max(y,z));
    }
    
}
