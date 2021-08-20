import java.util.Arrays;

public class HoarePartition {
    
    public static void main(String[] args) {
        
        int[] arr = {45,32,67,23,90,108,34,56};
        System.out.println(Arrays.toString(arr));
        partition(arr, 0, arr.length-1);
        System.out.println("Hoare's partition: "+ Arrays.toString(arr));

    }

    public static int partition(int[] arr, int start, int last){
        int pivot  = arr[start];
        int i= start-1, j = last+1;

        while(true){
            do{
                i++;
            }while(arr[i] < pivot);
            do{
                j--;
            }while(arr[j] > pivot);
            if(i>=j)return j;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
