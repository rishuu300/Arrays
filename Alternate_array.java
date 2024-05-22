import java.util.*;
public class Alternate_array {
    public static void rearrange(int arr[]){
        Arrays.sort(arr);
        int temp[] = new int[arr.length];
        int right = arr.length-1;
        int left = 0;
        int i=0;
        while(left<right){
            temp[i] = arr[right];
            temp[i+1] = arr[left];
            left++;right--;i+=2;
        }
        arr = temp;
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int arr[] = {34,92,54,8,21,28};
        rearrange(arr);
    }
}
