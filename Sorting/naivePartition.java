import java.util.Arrays;

public class naivePartition {
    

    public static void main(String[] args) {
        
        int[] arr = {45,32,67,23,90,108,34,56};
        System.out.println(Arrays.toString(arr));
        partition(arr, 0, arr.length-1, 4);
        System.out.println("Naive partition: "+ Arrays.toString(arr));

    }

    public static int partition(int[] arr, int start, int last, int pivotIndex){
        int[] temp = new int[last-start+1];
        int index = 0;
        for (int i = start; i <= last; i++) 
            if(arr[i] < arr[pivotIndex]){
                temp[index] = arr[i];
                index++;
            }
        for (int i = start; i <= last; i++)
            if(arr[i] == arr[pivotIndex]){
                temp[index] = arr[i];
                index++;
            }
        int result = start+index - 1;
        
        for (int i = start; i<= last;i++)
            if(arr[i] > arr[pivotIndex]){
                temp[index] = arr[i];
                index++;
            }
        
        for(int i = start; i <= last; i++){
            arr[i] = temp[i-start];
        }
        return result;
    }
}
