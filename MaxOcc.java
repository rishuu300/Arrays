public class MaxOcc {
    public static void maxOccur(int L[], int R[]){
        long arr[] = new long[1000];
        for(int i=0; i<arr.length; i++){
            arr[L[i]]++;
            arr[R[i]+1]--;
        }

        long maxOcc = arr[0];
        for(int i=1; i<arr.length; i++){
            arr[i] += arr[i-1];
            maxOcc = Math.max(maxOcc,arr[i]);
        }
        System.out.println(maxOcc);
    }
    public static void main(String[] args) {
        int L[] = {1,2,3};
        int R[] = {3,5,7};
        maxOccur(L,R);
    }
}
