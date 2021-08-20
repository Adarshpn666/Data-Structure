import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        
        int[] arr = {45,32,67,23,90,108,34,56};
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Insertion Sort: "+ Arrays.toString(arr));

    }


    private static void insertionSort(int[] arr){
        int size = arr.length;
        for (int i = 0; i < size-1; i++) {
            if(arr[i] > arr[i+1]){
                for (int j = i+1; j > 0; j--) {
                    if(arr[j] < arr[j-1]){
                        int temp = arr[j-1];
                        arr[j-1] = arr[j];
                        arr[j] = temp;
                    }
                   
                }
            }
 
        }
    }
    
}
