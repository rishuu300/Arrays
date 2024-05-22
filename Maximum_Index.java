public class Maximum_Index {
    public static void max(int arr[]){
        int lmin[] = new int[arr.length];
        int rmax[] = new int[arr.length];
        lmin[0] = arr[0];
        rmax[arr.length-1] = arr[arr.length-1];

        for(int i=1; i<arr.length; i++)
            lmin[i] = Math.min(lmin[i-1],arr[i]);

        for(int i=arr.length-2; i>=0; i--)
            rmax[i] = Math.max(rmax[i+1],arr[i]);

        int i=0; int j=0; int max = -1;
        while(i<arr.length && j<arr.length){
            if(lmin[i]<=rmax[j]){
                max = Math.max(max,j-i);
                j++;
            }
            else{
                i++;
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int arr[] = {34, 8, 10, 3, 2, 80, 30, 33, 1};
        max(arr);
    }
}
