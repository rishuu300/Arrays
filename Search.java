public class Search{
    public static int search(int arr[], int n){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==n)
               return i;
        }
        return -1;
    }
    public static void main(String[] args){
        int arr[] = {3,5,7,9,1};
        System.out.println(search(arr,5));
    }
}