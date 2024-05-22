public class ConsecutiveMax {
    public static void naive(int arr[]){
        int res = 0;
        for(int i=0; i<arr.length; i++){
            int count = 0;
            for(int j=i; j<arr.length; j++){
                if(arr[j]==1)
                  count++;
                else
                    break;
            }
            res = Math.max(res,count);
        }
        System.out.println(res);
    }

    public static void efficient(int arr[]){
        int count = 0;
        int res = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0)
               count = 0;
            else
                count++;
            res = Math.max(res,count);
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        int arr[] = {1,1,0,0,0,1,1,1,1,0};
        naive(arr);
        efficient(arr);
    }
}
