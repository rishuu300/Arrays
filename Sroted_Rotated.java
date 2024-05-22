public class Sroted_Rotated {
    public static void sortedRotated(int arr[]){
        int count = 0;
        for(int i=0; i<arr.length; i++)
            if(arr[i%arr.length] > arr[(i+1)%arr.length])
               count++;
        if(count>1){
            System.out.println(false);
            return;
        }
        System.out.println(true);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3};
        sortedRotated(arr);
    }
}
