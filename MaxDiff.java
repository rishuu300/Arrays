public class MaxDiff {
    public static void naive(int arr[]){
        int maxDiff = 0;
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]-arr[i]>maxDiff){
                   maxDiff = arr[j]-arr[i];
                }
            }
        }
        System.out.println(maxDiff);
    }

    public static void efficient(int arr[]){
        int max_diff = arr[1]-arr[0];
        int min_value = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]-min_value>max_diff)
               max_diff = arr[i]-min_value;
            if(arr[i]<min_value)
               min_value = arr[i];
        }
        System.out.println(max_diff);
    }
    public static void main(String[] args){
        int arr[] = {45,23,61,93,87};
        naive(arr);
        efficient(arr);
    }
}
