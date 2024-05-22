import java.util.Arrays;

public class Insert {
    public static int insert(int arr[], int n, int element, int pos){
        if(pos>arr.length){
            return -1;
        }
        for(int i=n-1; i>=pos-1; i--){
            arr[i+1] = arr[i];
        }
        arr[pos-1] = element;
        return arr.length+1;
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0] = 5;
        arr[1] = 7;
        arr[2] = 10;
        arr[3] = 20;
        System.out.println(Arrays.toString(arr));
        insert(arr,4,3,2);
        System.out.println(Arrays.toString(arr));
    }
}
