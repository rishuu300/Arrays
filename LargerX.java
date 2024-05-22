public class LargerX {
    public static int naive(int arr[], int x){
        int count = 0;
        for(int i=0; i<arr.length; i++)
            if(arr[i]>x)
               count++;
        return count;
    }
    public static int binary(int arr[], int x){
        int count = 0; int left = 0;
        int right = arr.length-1;
        while(left<=right){
           int mid = (left+right)/2;
           if(arr[mid]>x){
            count = mid;
            right = mid-1;
           }
           else{
            left = mid+1;
           }
        }
        return count;
    }
    public static void main(String[] args) {
        // int arr[] = {8,5,9,3,12,20,10};
        int arr2[] = {3,5,8,9,10,12,20};
        System.out.println(binary(arr2,12));
    }
}
