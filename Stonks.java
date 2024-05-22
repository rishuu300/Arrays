public class Stonks {
    public static void ALPHAstonks(int arr[]){
        int minBP = arr[0];
        int max_profit = 0;
        for(int i=0; i<arr.length; i++){
            if(minBP>arr[i])
               minBP = arr[i];
            int profit = arr[i] - minBP;
            if(max_profit < profit)
               max_profit = profit;
        }
        System.out.println(max_profit);
    }

    public static void GFGstonks(int arr[]){
        int profit = 0;
        for(int i=1; i<arr.length; i++){
            if(arr[i]>arr[i-1])
               profit += arr[i] - arr[i-1];
        }
        System.out.println(profit);
    }
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,8};
        ALPHAstonks(arr);
        GFGstonks(arr);
    }
}
