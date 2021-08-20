import java.util.*;

//We swap adjecent elements till it reaches its write position

public class BubbleSort {
    
    public static void main(String[] args) {
        
        int[] arr = {45,32,67,23,90,108,34,56};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("Bubble Sort: "+ Arrays.toString(arr));

    }


    private static void bubbleSort(int[] arr){
        int size = arr.length;

        for(int i=0;i<size-1; i++){
            boolean swapped = false;
            for(int j=0;j<size-i-1;j++){//since last element is already max there is no point to compare them we decrease j-i-1;
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }

                if(swapped == false)break;
            }
        }
    }
}
