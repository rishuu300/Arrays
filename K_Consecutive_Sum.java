public class K_Consecutive_Sum {
    public static void naive(int arr[],int k){
        int maxSum = 0;
        for(int i=0; (i+(k-1))<arr.length; i++){
            int sum = 0;
            for(int j=0; j<k; j++){
                sum += arr[i+j];
            }
            maxSum = Math.max(sum,maxSum);
        }
        System.out.println(maxSum);
    }

    public static void windowSliding(int arr[], int k){
        int currSum = 0;
        for(int i=0; i<k; i++)
            currSum += arr[i];

        int maxSum = currSum;
        for(int i=k; i<arr.length; i++){
            currSum += (arr[i] - arr[i-k]);
            maxSum = Math.max(currSum,maxSum);
        }
        System.out.println(maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        naive(arr,2);
        windowSliding(arr,2);
    }
}
