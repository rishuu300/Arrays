public class Container_With_Most_Water {
    public static int water(int arr[]){
        int l = 0;
        int r = arr.length-1;
        int max = 0;
        while(l<r){
            max = Math.max(Math.min(arr[l],arr[r])*(r-l-1),max);
            if(arr[l]<arr[r])
               l++;
            else
                r--;
        }
        return max;
    }
    public static void main(String[] args) {
        int height[] = { 2, 1, 3, 4, 6, 5 };
        System.out.println(water(height));
    }
}
