import java.util.Scanner;

public class SumOfNNaturalNumber {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int n  = sc.nextInt();

        //we can solve this problem using formula n*(n+1)/2 with time complexity O(1)..

        System.out.println("Sum N Natural Numbers: "+sumOfNNaturalNumber(n));//time complexity O(n) and Auxilary space O(n)
        System.out.println("Sum N Natural Numbers (Tail Recursion): "+sumOfNNaturalNumberTailrecursion(n,0));
    }

    private static int sumOfNNaturalNumber(int n) {  //This function is not a tail recursion 

        if(n==0){
            return 0;
        }

        return n+ sumOfNNaturalNumber(n-1);
    }

    private static int sumOfNNaturalNumberTailrecursion(int n,int k) {  //This function is not a tail recursion 

        if(n==0){
            return k;
        }

        return sumOfNNaturalNumberTailrecursion(n-1,k+n);
    }
    
}
