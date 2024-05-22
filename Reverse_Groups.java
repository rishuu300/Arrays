import java.util.Arrays;

public class Reverse_Groups {
    public static void reverse(int arr[], int k) {
        int i = 0;
        int j = k;

        while (j < arr.length) {
            reverseArr(arr, i, j - 1);
            i += k;
            j += k;
        }
        reverseArr(arr, i, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverseArr(int arr[], int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        reverse(arr, 5);
    }
}