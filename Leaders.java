public class Leaders {
    public static void naive(int arr[]){
        for(int i=0; i<arr.length; i++){
            boolean flag = false;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]<arr[j])
                   flag = true;
            }
            if(flag==false)
               System.out.println(arr[i]);
        }
    }

    public static void efficient(int arr[]){
        int currlead = arr[arr.length-1];
        System.out.println(currlead);
        for(int i=arr.length-2; i>=0; i--){
            if(currlead<arr[i]){
                currlead = arr[i];
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args){
        int arr[] = {34,56,7,8,934,98};
        naive(arr);
        efficient(arr);
    }
}
