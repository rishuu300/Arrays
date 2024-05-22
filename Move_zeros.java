import java.util.Arrays;

public class Move_zeros {
    public static void naive(int arr[]){
        for(int i=0; i<arr.length; i++)
            if(arr[i]==0)
                for(int j=i+1; j<arr.length; j++)
                    if(arr[j]!=0)
                        swap(arr,i,j);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void efficient(int arr[]){
        int count = 0;
        for(int i=0; i<arr.length; i++)
            if(arr[i]!=0){
                swap(arr,i,count);
                count++;
            }
    }
    public static void main(String[] args) {
        int arr[] = {5,7,0,0,8,0,9,0};
        System.out.println(Arrays.toString(arr));
        naive(arr);
        efficient(arr);
        System.out.println(Arrays.toString(arr));
    }
}
