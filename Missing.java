import java.util.Arrays;

public class Missing {
    static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void naive(int arr[], int n){
        Arrays.sort(arr);
        for(int i=0; i<n; i++){
            if(arr[i]>0){
                if(arr[i]!=arr[i-1]+1){
                    System.out.println(arr[i-1]+1);
                    return;
                }
            }
        }
        System.out.println(n);
    }

    public static int efficeint(int arr[], int n){
        for(int i=0; i<n; i++){
            int CI = arr[i] - 1;
            
            while(arr[i] > 0 && arr[i] <= n && arr[i] != arr[CI]){
                swap(arr,i,CI);
                CI = arr[i] - 1;
            }
        }
        
        for(int i=0; i<n; i++){
            if(arr[i] != i+1){
                return i+1;
            }
        }
        
        return n+1;
    }

    public static void main(String[]args){
        int arr[] = {0,1,2};
        int n = arr.length;
        naive(arr,n);
        System.out.println(efficeint(arr, 3));
    }
}
