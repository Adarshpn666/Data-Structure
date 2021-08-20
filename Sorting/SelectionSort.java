//We find out the min element and put it in the first pos 
//Then 2nd min to second pos 
//third min to third pos and so on.

import java.util.*;

public class SelectionSort {

    public static void main(String[] args) {
        
        int[] arr = {45,32,67,23,90,108,34,56};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("Selection Sort: "+ Arrays.toString(arr));

    }


    private static void selectionSort(int[] arr){
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            int min = i;
            for (int j = i+1; j < size; j++) {
                if(arr[min] > arr[j])min = j;
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
    
}
