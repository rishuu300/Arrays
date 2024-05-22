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
        int arr[] = {4,2,-2,1};
        naive(arr);
        efficient(arr);
    }
}
