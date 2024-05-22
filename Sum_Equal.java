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

    public static void efficient(int arr[], int Gsum){
        int sum = arr[0];
        int s = 0;
        for(int i=1; i<arr.length; i++){
            while(sum>Gsum && s<i-1){
                sum -= arr[s];
                s++;
            }
            if(sum==Gsum){
               System.out.println("true");
               return;
            }
            if(i<arr.length)
               sum += arr[i];
        }
        System.out.println("false");
    }
    public static void main(String[] args) {
        int arr[] = {1,34,5,7,8};
        naive(arr,5);
        efficient(arr,34);
    }
}
