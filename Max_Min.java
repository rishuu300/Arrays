import java.util.Arrays;

public class Max_Min {
    public static void maxMin(int arr[]){
        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[arr.length-1];
        System.out.println(max+" "+min);
    }
    public static void main(String[] args){
        int arr[] = {4,6,12,4,5,8,9};
        maxMin(arr);
    }
}
