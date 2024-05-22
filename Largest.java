public class Largest {
    public static int largest(int arr[]){
        int largest = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > arr[largest]){
                largest = i;
            }
        }
        return largest;
    }
    public static void main(String[] args){
        int arr[] = {5,8,20,10};
        System.out.println(largest(arr));
    }
}
