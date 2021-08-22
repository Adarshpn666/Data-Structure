import java.util.Arrays;

public class RadixSort {
    
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int n= 10;
        System.out.println(Arrays.toString(arr));
        radixSort(arr, n);
        System.out.println("Radix Sort: "+Arrays.toString(arr));

    }

    private static void radixSort(int[] arr, int n) {
        int max  = arr[0];
        for (int i = 0; i < n ; i++) {
            if(max < arr[i])max = arr[i];
        }
        for(int exp = 1;max/exp >0;exp*=10){
            countSort(arr,n,exp);
        }
    }

    private static void countSort(int[] arr, int n, int exp) {
        int[] count = new int[10], output = new int[n];
        for(int i= 0 ;i<n;i++){
            count[(arr[i]/exp)%10]++;
        }
        for(int i = 1;i<10;i++){
            count[i] += count[i-1];
        }
        for(int i = n-1; i>=0; i--){
            output[count[(arr[i]/exp)%10]-1] = arr[i];
            count[(arr[i]/exp)%10]--;
        }

        for(int i = 0; i<n;i++){
            arr[i] = output[i];
        }
    }
}
