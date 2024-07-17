public class Frequencies_of_Limited_Range_Array_Elements {
    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void naive(int arr[], int N, int P){
        int hash[]=new int[N+1];
        for(int i=0;i<N;i++){
            if(arr[i]<=N)
            hash[arr[i]]++;
        }
        
        for(int i=0;i<N;i++){
            arr[i]=hash[i+1];
        }
    }

    public static void efficient(int arr[], int N, int P){
        for(int i=0; i<N;){
            if(arr[i]>0 && arr[i]<=N){
                int j = arr[i]-1;
                
                if(arr[j] > 0){
                    swap(arr,i,j);
                    arr[j] = -1;
                }
                else{
                    arr[j]--;
                    arr[i] = 0;
                    i++;
                }
            }
            else if(arr[i]>N){
                arr[i] = 0;
                i++;
            }
            else{
                i++;
            }
        }
        
        for(int i=0; i<N; i++){
            arr[i] = -arr[i];
        }
    }
    public static void main(String[] args) {
        
    }
}
