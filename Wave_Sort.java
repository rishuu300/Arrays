import java.util.*;
public class Wave_Sort {
    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void naive(int arr[]){
        Arrays.sort(arr);
        for(int i=0; i<arr.length-1; i+=2)
            swap(arr,i,i+1);
        System.out.println(Arrays.toString(arr));
    }

    public static void efficient(int arr[]){
        for(int i=0; i<arr.length-1; i+=2){
            if(i>0 && arr[i]<arr[i-1])
               swap(arr,i,i-1);
            if(i<arr.length-1 && arr[i]<arr[i+1])
               swap(arr,i,i+1);
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int arr[] = {34,65,14,87,37,92};
        int arr2[] = {10, 90, 49, 2, 1, 5, 23};
        naive(arr);
        efficient(arr2);
    }
}
