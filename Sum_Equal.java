import java.util.ArrayList;
import java.util.Arrays;

public class Sum_Equal {
    public static void naive(int arr[], int Gsum){
        for(int i=0; i<arr.length; i++){
            int sum = 0;
            for(int j=i; j<arr.length; j++){
                sum += arr[j];
                if(sum==Gsum){
                    System.out.println("true");
                    return;
                }
            }
        }
        System.out.println("flase");
    }

    static ArrayList<Integer> efficient(int[] arr, int n, int sum) {
        int st = 0;
        int currSum = 0;
        ArrayList<Integer> al = new ArrayList<>();
        
        for(int end=0; end<n; end++){
            currSum += arr[end];
            
            while(currSum > sum && st<end){
                currSum -= arr[st];
                st++;
            }
            
            if(currSum==sum){
                al.add(st+1);
                al.add(end+1);
                return al;
            }
        }
        
        return new ArrayList<>(Arrays.asList(-1));
    }
    public static void main(String[] args) {
        int arr[] = {1,34,5,7,8};
        int n = arr.length;
        naive(arr,5);
        System.out.println(efficient(arr,n,20));
    }
}
