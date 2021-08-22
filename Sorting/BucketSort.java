import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BucketSort {

    //only efficent when array elements are uniformly distributed..
    public static void main(String[] args) {
        int[] arr = {30,40,10,80,5,12,70};
        int n= 7, k = 4;
        System.out.println(Arrays.toString(arr));
        bucketSort(arr, n, k);
        System.out.println("Bucket Sort: "+Arrays.toString(arr));

    }

    private static void bucketSort(int[] arr, int n, int k) {
        int max = arr[0];
        for(int i=1;i<n;i++)max = Math.max(max,arr[i]);
        max++;
        ArrayList<ArrayList<Integer>> output = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            output.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            int bi = (k*arr[i])/max;
            output.get(bi).add(arr[i]);
        }
        for(int i = 0;i<k;i++){
            Collections.sort(output.get(i));
        }
        int index = 0;
        for(int i = 0; i<k;i++){
            for(int j =0;j<output.get(i).size();j++){
                arr[index] = output.get(i).get(j);
                index++;
            }
        }
    }
    
}
