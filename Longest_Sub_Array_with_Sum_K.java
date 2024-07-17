import java.util.HashMap;
import java.util.Map;

public class Longest_Sub_Array_with_Sum_K {
    public static int lenOfLongSubarr (int arr[], int n, int K) {
        Map<Integer,Integer> map = new HashMap<>();
        int max = 0;
        int sum = 0;
        
        for(int i=0; i<n; i++){
            sum += arr[i];
            
            if(sum == K){
                max = Math.max(max,i+1);
            }
            else if(map.containsKey(sum - K)){
                max = Math.max(max, i- map.get(sum - K));
            }
            
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        
        return max;
    }
    public static void main(String[] args) {
        
    }
}
