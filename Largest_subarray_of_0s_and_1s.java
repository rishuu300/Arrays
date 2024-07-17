import java.util.HashMap;
import java.util.Map;

public class Largest_subarray_of_0s_and_1s {
    int maxLen(int[] arr, int n)
    {
        Map<Integer,Integer> map = new HashMap<>();
        int sum = 0, maxLen = 0;
        map.put(0,-1);
        
        for(int i=0; i<n; i++){
            sum = (arr[i]==0) ? sum-1 : sum+1;
            if(map.containsKey(sum)){
                maxLen = Math.max(maxLen ,i - map.get(sum));
            }
            else{
                map.put(sum,i);
            }
        }
        
        return maxLen;
    }
    public static void main(String[] args) {
        
    }
}
