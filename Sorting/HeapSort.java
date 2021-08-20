import java.util.Arrays;

public class HeapSort {
    

    public static void main(String[] args) {
        
        int[] arr = {45,32,67,23,90,108,34,56};
        System.out.println(Arrays.toString(arr));
        heapSort(arr, arr.length);
        System.out.println("Heap Sort: "+ Arrays.toString(arr));

    }


    private static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void heapSort(int[] arr, int n) {
        buildHeap(arr, n);
        for(int i = n-1;i>=1;i--){
            swap(arr,0,i);
            maxHeapify(arr,i,0);
        }
    }


    private static void buildHeap(int[] arr, int n) {
        for(int i = (n-2)/2;i>=0;i--){
            maxHeapify(arr,n,i);
        }
    }


    private static void maxHeapify(int[] arr, int n, int i) {
        int largest = i, left = 2*i+1, right = 2*i+2;
        if(left < n && arr[left] > arr[largest]) largest = left; 
        if(right < n && arr[right] > arr[largest])largest = right;
        if(largest != i){
            swap(arr,largest,i);
            maxHeapify(arr,n,largest);
        }
    }
}
