public class Equal_Part_Sum {
    public static void sum(int arr[]){
        int totalSum = 0;
        for(int i=0; i<arr.length; i++)
            totalSum += arr[i];
        
        if(totalSum%3!=0){
           System.out.println("false");
           return;
        }

        int partSum = totalSum/3;
        int sum = 0;
        int count = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            if(sum==partSum){
                count++;
                sum = 0;
            }
        }

        if(count==3){
            System.out.println("true");
            return;
        }
        System.out.println("false");
    }
    public static void main(String[] args) {
        int[] arr = {5,2,6,1,1,1,5};
        sum(arr);
    }
}
