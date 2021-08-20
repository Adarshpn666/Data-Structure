import java.util.Arrays;

public class LomutoPartition {
    public static void main(String[] args) {
        
        int[] arr = {45,32,67,23,90,108,34,56};
        System.out.println(Arrays.toString(arr));
        partition(arr, 0, arr.length-1);
        System.out.println("Lomuto partition: "+ Arrays.toString(arr));

    }

    public static int partition(int[] arr, int start, int last){
        int pivot  = arr[last];
        int i= start-1;
        for(int j=start;j<=last-1;j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i]  = temp;
            }
        }

        int temp = arr[last];
        arr[last] = arr[i+1];
        arr[i+1] = temp;

        return (i+1);
    }
}
