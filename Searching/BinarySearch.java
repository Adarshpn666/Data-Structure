import java.util.Scanner;

public class BinarySearch{

    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();
        int value = sc.nextInt();

        System.out.println(binarySearchIterative(arr,value));
        System.out.println(binarySearchRecursive(arr,value, 0,n));
        
    }

    private static int  binarySearchIterative(int[] arr, int value) {
        int start = 0, last = arr.length-1;
        int mid =  (start+last)/2;
        while(start<=last){
            mid =  (start+last)/2;
            if(arr[mid] == value) return mid;
            else if(arr[mid] > value)last = mid-1;
            else if(arr[mid] < value)start = mid+1;
        }

        return -1;
    }


    private static int  binarySearchRecursive(int[] arr, int value, int first, int last) {
        int mid = (first+last)/2;
        if(last<first)return -1;
        if(arr[mid] == value) return mid;
        if(arr[mid] > value) last = mid-1;
        if(arr[mid] < value) first = mid+1;

        return binarySearchRecursive(arr, value, last, first);
    }
}