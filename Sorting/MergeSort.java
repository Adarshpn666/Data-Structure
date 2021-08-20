import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        
        int[] arr = {45,32,67,23,90,108,34,56};
        System.out.println(Arrays.toString(arr));
        mergeSort(arr, 0, arr.length-1);
        System.out.println("Merge Sort: "+ Arrays.toString(arr));

    }


    private static void mergeSort(int[] arr, int start, int last){

        if(start ==  last){
            return;
        }
        int mid = start + (last-start)/2;//the given array is same as (start+last)/2, we write this to avoid overflow when size of array  very large;

        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, last);
        
        merge(arr,start,last,mid);

        

    }

    private static void  merge(int[] a, int start, int last, int mid){
        
        int[] left = new int[(mid-start)+1],
        right  = new int[(last-mid)];
        
        for(int i = 0,j = start; i<=(mid-start);i++,j++)left[i] = a[j];
        for(int i = 0, j = mid+1; i<=(last-mid-1);i++,j++)right[i] = a[j];
        
        int i = 0, j = 0,curr = start;
        while(i<= (mid-start) && j <= (last-mid-1)){
            if(left[i] <= right[j]){
                a[curr] = left[i];
                curr++;
                i++;
            }
            else{
                a[curr] = right[j];
                curr++;
                j++;
            }
        }

        while(i<=(mid-start) ){a[curr] = left[i];curr++;i++;}
        while(j<=(last-mid-1)){a[curr] = right[j];curr++;j++;}
    }
    
}
