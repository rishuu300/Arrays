import java.util.Arrays;

public class Missing {
    public static void missing(int arr[]){
        Arrays.sort(arr);
        boolean contains = Arrays.asList(arr).contains(new int[]{1});//This collection creates new array containing only one element '1' if we just pass '1'.  
        if(contains){                                                //So instead of passing just '1' in contains fun we ourself create new array.
            System.out.println(1);
            return;
        }

        // boolean contains = false;
        // for(int num:arr)
        //     if(num==1)
        //        contains = true;     //This is also an effective way with T.C - O(n) but to further more reduce the run time
        // if(!contains){              //We use the above function
        //     System.out.println(1);
        //     return;
        // }

        for(int i=0; i<arr.length; i++)
            if(arr[i]>0)
                if(arr[i]!=arr[i-1]+1){
                    System.out.println(arr[i-1]+1);
                    return;
                }
    }

    public static void main(String[]args){
        int arr[] = {0,1,2};
        missing(arr);
    }
}
