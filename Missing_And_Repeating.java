public class Missing_And_Repeating {
    int[] findTwoElement(int arr[], int n) {
        boolean visited[] = new boolean[n];
        int[] ans = new int[2];
        long sum = 0;
        
        for(int i=0; i<n; i++){
            if(!visited[arr[i]-1]){
                visited[arr[i]-1] = true;
            }
            else{
                ans[0] = arr[i];
            }
            
            sum += arr[i];
        }
        
        long sum_natural = (long) n * (n + 1) / 2;
        
        if(sum_natural > sum){
            ans[1] = (int)(ans[0] + (sum_natural - sum));
        }
        else{
            ans[1] = (int)(ans[0] - (sum - sum_natural));
        }
        
        return ans;
    }
    public static void main(String[] args) {
        
    }
}
