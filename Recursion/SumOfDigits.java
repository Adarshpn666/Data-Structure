import java.util.Scanner;

public class SumOfDigits {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int n  = sc.nextInt();

        //time complexity O(n) axuliary  space O(n) worst case and in best case O(1)
        System.out.println("Sum of Digits : "+sumOfDigits(n,0));
        System.out.println("Absolute Sum of Digits : "+absoluteSumOfDigits(n,0));

    }

    private static int sumOfDigits(int n, int k) {  
        if(n==0)return k;
        return sumOfDigits(n/10,k+(n%10));

    }


    private static int absoluteSumOfDigits(int n, int k) {  
        if(n==0){
            if(k>9){ n = k;k=0;}
            else return k;
        }

        return absoluteSumOfDigits(n/10,k+(n%10));

    }
    
}
