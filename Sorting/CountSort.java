import java.util.Arrays;

public class CountSort {

    public static void main(String[] args) {
        int[] arr = {1,6,4,3,2,0,0,1,4};
        int k = 7, n= 9;
        System.out.println(Arrays.toString(arr));
        naiveCountSort(arr, n, k);
        System.out.println("Count Sort:(naive) "+Arrays.toString(arr));
        generalPurposeCountSort(arr, n, k);
        System.out.println("Count Sort:(general) "+Arrays.toString(arr));

    }

    private static void  naiveCountSort(int[] arr, int n , int k) {
        int[] count = new int[k];
        for (int i = 0; i <n; i++) count[arr[i]]++;
        int index = 0;
        for (int i = 0; i<k;i++){
            for(int j =0;j<count[i];j++){
                arr[index] = i;
                index++;
            }
        }
    }


    private static void  generalPurposeCountSort(int[] arr, int n , int k) {
        int[] count = new int[k];
        
        for (int i = 0; i <n; i++) count[arr[i]]++;
        
        for(int i = 1;i<k;i++)count[i] = count[i-1] + count[i];

        int[] output = new int[n];

        for (int i = n-1; i>=0;i--){
            output[count[arr[i]]-1] = arr[i];
            count[arr[i]]--;
        }

        for (int i = 0; i <n; i++) arr[i] = output[i];
        
    }
    
}
