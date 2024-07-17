import java.util.HashMap;

public class Two_Sum_Count {
    int getPairsCount(int[] arr, int sum) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        
        for(int i=0; i<arr.length; i++){
            if(map.containsKey(sum-arr[i])){
                count += map.get(sum-arr[i]);
            }
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        
        return count;
    }
    public static void main(String[] args) {
        
    }
}
