public class Rearrange_Array_Alternately {
    public static void naive(long arr[], int n){
        if(n==1)return;
        
        long aux[] = new long[n];
        int i=0, k = 0;
        int j = n-1;
        
        while(i<=j && k<n){
            aux[k++] = arr[j--];
            if(k>=n)break;
            aux[k++] = arr[i++];
        }
        
        for(i=0; i<n; i++){
            arr[i] = aux[i];
        }
    }

    public static void efficeint(long arr[], int n){
        long max = arr[n-1] + 1;
        int minIdx = 0;
        int maxIdx = n-1;
        
        for(int i=0; i<n; i++){
            if(i%2==0){
                arr[i] = (arr[maxIdx] % max) * max + arr[i];
                maxIdx--;
            }
            else{
                arr[i] = (arr[minIdx] % max) * max + arr[i];
                minIdx++;
            }
        }
        
        for(int i=0; i<n; i++){
            arr[i] = arr[i]/max;
        }
    }
    public static void main(String[] args) {
        
    }
}
