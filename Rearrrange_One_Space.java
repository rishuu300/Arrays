import java.util.Arrays;

public class Rearrrange_One_Space {
    public static void rearrange(int arr[]){
        for(int i=0; i<arr.length; i++){
            arr[i] += (arr[arr[i]]%arr.length)*arr.length;
        }

        for(int i=0; i<arr.length; i++)
            arr[i] = arr[i]/arr.length;

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = {2,3,1,4,0};
        rearrange(arr);
    }
}
