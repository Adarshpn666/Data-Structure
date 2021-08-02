import java.util.Scanner;

/*
This alogrithm is used when we are working with array where we have to Query related 
to the subarray or any continous array.

Example finding max sum Subarray of fixed size k..
[1,2,3,4,1,7,,3,8,9,10] 

Example find min length of subarray of given sum 
*/

public class SlidingWindow {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        
        int[] array = new int[n];
        
        for(int i=0;i<n;i++)array[i] = sc.nextInt();

        int k = sc.nextInt();
        int sum = sc.nextInt();
       

        System.out.println("Max Sum : " +findMaxSumSubarray(array, k));

        System.out.println("Min Sub Array Length : "+findMinSubarrayGivenSum(array, sum));


    }

    private static int findMaxSumSubarray(int[] array, int k) {
        int max = Integer.MIN_VALUE;
        int currentMax = 0;
        for (int i = 0; i < array.length; i++) {
            currentMax += array[i];
            if(i>=k-1){
                if(currentMax > max) max = currentMax;
                currentMax -= array[i-(k-1)];
            } 
        }

        return max;
    }

    private static int findMinSubarrayGivenSum(int[] array, int sum) {
        int minSubarrayLength = Integer.MAX_VALUE;
        int subarrayStart = 0;
        int currentMax = 0;
        for (int subarrayEnd = 0; subarrayEnd < array.length; subarrayEnd++) {
            currentMax += array[subarrayEnd];
            while(currentMax >= sum){
                minSubarrayLength = Math.min(minSubarrayLength, subarrayEnd - subarrayStart+1);
                currentMax -= array[subarrayStart];
                subarrayStart++;
            }

        }

        return minSubarrayLength;
    }

    
}
