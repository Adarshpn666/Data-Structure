import java.util.Scanner;

public class GenerateSubsets {


    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        String s  = sc.nextLine();

        //time complexity O(2^n)
        System.out.println("Strings Subset : ");
        getSubsets(s,"",0);

    }

    private static void getSubsets(String s,String curr, int n) {  

        if (n == s.length()){
            System.out.println(curr);
            return;
        }

        getSubsets(s,curr,n+1);
        curr+=s.charAt(n);
        getSubsets(s,curr,n+1);
    }
    
}
