public class Second_largest {
    public static int Naive(int arr[]){
        int largest = getLargest(arr);
        int res = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=arr[largest]){
                if(res==-1){
                    res = i;
                }
                else if(arr[i]>arr[res]){
                    res = i;
                }
            }
        }
        return res;
    }

    private static int getLargest(int[] arr) {
        int largest = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > arr[largest]){
                largest = i;
            }
        }
        return largest;
    }

    public static int Efficient(int arr[]){
        int largest = 0; int res = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>arr[largest]){
                res = largest;
                largest = i;
            }

            if(arr[i]!=arr[largest]){
                if(res==-1){
                    res = i;
                }
                else if(arr[i]>arr[res]){
                    res = i;
                }
            }
        }
        return res;
    }
    public static void main(String[] args){
        int arr[] = {5,8,20,10};
        int arr2[] = {1,1,1,1};
        System.out.println(Naive(arr));
        System.out.println(Efficient(arr2));
    }
}
