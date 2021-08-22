import java.util.Arrays;

public class ShellSort {
    

    public static void main(String[] args) {
        int[] arr = {1,6,4,3,2,0,0,1,4};
        int n= 9;
        System.out.println(Arrays.toString(arr));
        shellSort(arr, n);
        System.out.println("Shell Sort: "+Arrays.toString(arr));
    }

    public static void shellSort(int arr[], int n)
    {
        for(int gap = n/2;gap>0;gap/=2){
            for(int i = gap;i<n;i++){
                int temp = arr[i];
                int j;
                for(j = i;j>=gap && arr[j-gap] > temp ;j-=gap){
                    arr[j] = arr[j-gap];
                }
                arr[j] = temp;
            }
        }
    }
}
