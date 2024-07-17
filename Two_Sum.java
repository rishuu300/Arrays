import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Two_Sum {
    public static int naive(int arr[], int n, int sum)
    {
        Set<Integer> s = new HashSet<>();
        
        for(int i=0; i<n; i++){
            if(s.contains(sum-arr[i])){
                return 1;
            }
            s.add(arr[i]);
        }
        return 0;
    }

    public static int  efficient(int arr[], int n, int sum){
        Arrays.sort(arr);
        int i=0;
        int j=n-1;
        
        while(i<j){
            if(arr[i]+arr[j] == sum){
                return 1;
            }
            else if(arr[i]+arr[j] > sum){
                j--;
            }
            else{
                i++;
            }
        }
        
        return 0;
    }
    public static void main(String[] args) {
        
    }
}
