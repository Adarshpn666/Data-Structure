package leetcode;

import java.util.Scanner;

public class BuildArrayfromPermutation {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        
        int[] array = new int[n];
        
        for(int i=0;i<n;i++)array[i] = sc.nextInt();
       
        int[] arr = buildArray(array);


        for(int i=0;i<n;i++)System.out.print(arr[i]+" ");
        System.out.println();

    }

    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i] = nums[nums[i]];
        }
        
        return ans;
        
    }
    
}
