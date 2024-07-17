import java.util.HashSet;
import java.util.Set;

public class Subarray_with_0_sum {
    static boolean findsum(int arr[],int n)
    {
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        
        for(int i=0; i<n; i++){
            sum += arr[i];
            if(set.contains(sum)){
                return true;
            }
            
            if(sum==0){
                return true;
            }
            
            set.add(sum);
        }
        return false;
    }
    public static void main(String[] args) {
         
    }
}
