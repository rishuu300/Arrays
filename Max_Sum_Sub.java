public class Max_Sum_Sub {
    public static void naive(int arr[]){
        int maxSum = 0;
        for(int i=0; i<arr.length; i++){
            int curr = 0;
            for(int j=i; j<arr.length; j++){
                curr = curr + arr[j];
                maxSum = Math.max(maxSum,curr);
            }
        }
        System.out.println(maxSum);
    }

    public static void Kadanes(int arr[]){
        int maxEnd = arr[0];
        int maxSum = arr[0];
        for(int i=1; i<arr.length; i++){
            maxEnd = Math.max(maxEnd+arr[i],arr[i]);
            maxSum = Math.max(maxEnd,maxSum);
        }
        System.out.println(maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,3,-1,2};
        naive(arr);
        Kadanes(arr);
    }
}
