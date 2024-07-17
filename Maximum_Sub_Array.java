import java.util.ArrayList;
import java.util.Arrays;

public class Maximum_Sub_Array {
    ArrayList<Integer> findSubarray(int n, int arr[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Integer> al = new ArrayList<>();
        
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0; i<n; i++){
            if(arr[i] < 0){
                if(sum > maxSum){
                    maxSum = sum;
                    ans.clear();
                    ans.addAll(al);
                }
                else if(sum == maxSum && al.size() > ans.size()){
                    ans.clear();
                    ans.addAll(al);
                }
                
                sum = 0;
                al.clear();
                continue;
            }
            
            sum += arr[i];
            al.add(arr[i]);
        }
        
        if(sum > maxSum){
            maxSum = sum;
            ans.clear();
            ans.addAll(al);
        }
        else if(sum == maxSum && al.size() > ans.size()){
            ans.clear();
            ans.addAll(al);
        }
        
        if(ans.size() == 0){
            return new ArrayList<>(Arrays.asList(-1));
        }
        
        return ans;
    }
    public static void main(String[] args) {
        
    }
}
