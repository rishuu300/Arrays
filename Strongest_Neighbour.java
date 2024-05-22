import java.util.Arrays;

public class Strongest_Neighbour {
    public static void strongest(int arr[]){
        int arr2[] = new int[arr.length];

        arr2[0] = Math.max(arr[0],arr[1]);
        arr2[arr.length-1] = Math.max(arr[arr.length-1],arr[arr.length-2]);

        for(int i=1; i<arr.length-1; i++)
            arr2[i] = Math.max(arr[i+1],arr[i-1]);
        
        System.out.println(Arrays.toString(arr2));
    }
    public static void main(String[] args){
        int arr[] = {34,65,14,87,37,92};
        strongest(arr);
    }
}
