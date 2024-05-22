public class Remove_Duplicates {
    public static int remove_duplicate(int arr[],int n){
        int size = 0;
        
        if(n <= 1){
            return 1;
        }
        
        for(int i=0;i<n;i++){
            if(arr[i] != arr[size]){
                size++;
                arr[size] = arr[i];
            }
        }
        
        return size+1;
    }
    public static void main(String[] args) {
        
    }
}
