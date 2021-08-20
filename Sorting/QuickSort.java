import java.util.Arrays;

public class QuickSort {
    
    public static void main(String[] args) {
        
        int[] arr = {45,32,67,23,90,108,34,56},
        arr1 = {34,23,56,44,78,2,108,67};
        System.out.println(Arrays.toString(arr));
        quickSortLomuto(arr, 0, arr.length-1);
        quickSortHoare(arr1, 0,arr.length-1);
        System.out.println("Quick Sort using Lomuto partition: "+ Arrays.toString(arr));
        System.out.println("Quick Sort using Hoare partition: "+ Arrays.toString(arr1));

    }

    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void quickSortLomuto(int[] arr, int l, int h){

        if(l<h){
            int p = lomutoPartition(arr,l,h);
            quickSortLomuto(arr, l, p-1);
            quickSortLomuto(arr, p+1, h);
        }
    }

    public static void quickSortHoare(int[] arr, int l, int h){
        if(l<h){
            int p = hoaresPartition(arr, l, h);
            quickSortHoare(arr,l,p);
            quickSortHoare(arr, p+1, h);
        }
    }

    public static int lomutoPartition(int[] arr, int start, int last){

        int pivot = arr[last];
        int i = start-1;
        for (int j = start; j<= last-1;j++){
            if(arr[j] < pivot){
                i++;
                swap(arr, i,j);
            }
        }
        swap(arr, i+1, last);
        return (i+1);
    }

    public static int hoaresPartition(int[] arr, int l, int h){
        int pivot = arr[l];
        int i = l-1, j = h+1;
        while(true){
            do{
                i++;
            }while(arr[i] < pivot);

            do{
                j--;
            }while(arr[j] > pivot);
            if(i>=j)return j;
            swap(arr, i, j);
        }
    }
}
