import java.util.Scanner;

public class PalindromeRecursion {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        String s  = sc.nextLine();

        //time complexity O(n)
        System.out.println("String is palindrome : "+checkPalindrome(s.toLowerCase(), 0, s.length()-1));

    }

    private static boolean checkPalindrome(String s, int i, int j) {  
        if(i>=j)return true;
        if(s.charAt(i) != s.charAt(j)) return false;

        return checkPalindrome(s,i+1, j-1);

    }

    
}
