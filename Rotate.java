import java.util.Arrays;

public class Rotate {
    public static void rotate(int arr[], int n){
        int arr2[] = new int[n];
        for(int i=0; i<n; i++){
            arr2[i] = arr[i];
        }

        for(int i=n; i<arr.length; i++){
            arr[i-n] = arr[i];
        }

        for(int i=0; i<n; i++){
            arr[arr.length-n+i] = arr2[i];
        }
    }

    public static void efficient(int arr[], int n){
        reverse(arr,0,n-1);
        reverse(arr,n,arr.length-1);
        reverse(arr,0,arr.length-1);
    }
    private static void reverse(int[] arr, int low, int high) {
        while(low<high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;high--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        // rotate(arr,2);
        efficient(arr,2);
        System.out.println(Arrays.toString(arr));
    }
}
