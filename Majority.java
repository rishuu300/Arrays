public class Majority {
    public static void naive(int arr[]){
        for(int i=0; i<arr.length; i++){
            int count = 1;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j])
                   count++;
            }
            if(count>arr.length/2){
               System.out.println(arr[i]);
               return;
            }
        }
        System.out.println("No majority element present");
    }

    public static void efficient(int arr[]){
        int res = 0;int count = 1;
        for(int i=1; i<arr.length; i++){
            if(arr[res]==arr[i])
               count++;
            else
                count--;
            if(count==0){
                count = 1;
                res = i;
            }
        }

        count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==arr[res])
              count++;
        }
        if(count>arr.length/2)
               System.out.println(arr[res]);
        else
            System.out.println("No majority element present");
    }
    public static void main(String[] args) {
        int arr[] = {8,7,8,6,6,6,6};
        int arr2[] = {1,2,3,4,5};
        naive(arr);
        efficient(arr2);
    }
}
