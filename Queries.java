import java.util.Arrays;

public class Queries {
    public static void queries(int arr[], int i, int r){
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for(int j=1; j<arr.length; j++){
            prefix[j] = arr[j] + prefix[j-1];
        }
        System.out.println(Arrays.toString(prefix));

        if(i!=0)
           System.out.println(prefix[r]-prefix[i-1]);
        else
            System.out.println(prefix[r]);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        queries(arr,1,3);
    }
}
