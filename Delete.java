import java.util.Arrays;

public class Delete {
    public static int delete(int arr[], int element){
        int i=0;
        for(i=0; i<arr.length; i++){
            if(arr[i]==element){
                break;
            }
        }
        if(i==arr.length){
                return -1;
        }

        for(int j=i; j<arr.length-1; j++){
            arr[j] = arr[j+1];
        }
        return arr.length-1;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,7,10,20};
        System.out.println(Arrays.toString(arr));
        delete(arr,7);
        System.out.println(Arrays.toString(arr));
    }
}
