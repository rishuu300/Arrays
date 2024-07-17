public class Eqilibrium {
    public static void naive(int arr[]){
        for(int i=0; i<arr.length; i++){
            int lsum = 0;
            for(int j=0; j<i; j++)
                lsum += arr[j];

            int rsum = 0;
            for(int j=i+1; j<arr.length; j++)
                rsum += arr[j];

            if(lsum == rsum){
               System.out.println(arr[i]);
               return;
            }
        }
        System.out.println("-1");
    }

    public static void better(int arr[], int n){
        int l[] = new int[n];
        int r[] = new int[n];
        l[0] = arr[0];
        r[n-1] = arr[n-1];
        
        for(int i=1; i<n; i++){
            l[i] = arr[i] + l[i-1];
        }
        
        for(int i=n-2; i>=0; i--){
            r[i] = arr[i] + r[i+1];
        }
        
        int ans = -1;
        for(int i=0; i<n; i++){
            if(l[i] == r[i]){
                ans  = i;
                break;
            }
        }
        
        System.out.println(arr[ans]);
    }

    public static void efficient(int arr[]){
        int lsum = 0;
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];               
        }
        for(int i=0; i<arr.length; i++){
            if(lsum == sum-arr[i]){
               System.out.println(arr[i]);
               return;
            }
            else{
                lsum += arr[i];
                sum -= arr[i];
            }
            
        }
        System.out.println("-1");
    }
    public static void main(String[] args){
        int arr[] = {4,2,-2};
        int n = arr.length;
        naive(arr);
        better(arr,n);
        efficient(arr);
    }
}
