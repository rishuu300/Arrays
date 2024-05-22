import java.util.*;

public class N_bonacci {
    public static void nBonacci(int n, int m){
        int arr[] = new int[m];
        arr[n-1] = 1;
        arr[n] = 1;

        for(int i=n+1; i<m; i++)
           arr[i] = 2*arr[i-1] - arr[i-n-1];

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        nBonacci(3,10);
        nBonacci(2,10);
    }
}