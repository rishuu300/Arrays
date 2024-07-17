public class Missing_in_Array {
    int missingNumber(int n, int arr[]) {
        int sum = 0;
        for(int i=0; i<n-1; i++){
            sum += arr[i];
        }
        
        return ((n*(n+1))/2) - sum;
    }
    public static void main(String[] args) {
        
    }
}
