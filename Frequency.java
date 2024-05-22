public class Frequency {
    public static void frequency(int arr[]){
        int count = 1;
        int element = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]==arr[i-1]){
                count++;
            }
            else{
                System.out.println(element +" "+ count);
                count = 1;
                element = arr[i];
            }
        }
        System.out.println(element + " " + count);
    }
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 30, 30, 40, 50, 50, 50, 50, 70, 70, 70}; 
        frequency(arr);
    }
}
