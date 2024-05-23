public class Circular_Max_Sum {
    public static void naive(int arr[]) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            int maxSum = arr[i];
            int currSum = arr[i];
            for (int j = 1; j < arr.length; j++) {
                int idx = (i + j) % arr.length;
                currSum += arr[idx];
                maxSum = Math.max(currSum, maxSum);
            }
            res = Math.max(maxSum, res);
        }
        System.out.println(res);
    }

    public static int KadanesMax(int arr[]) {
        int maxSum = arr[0];
        int maxEnd = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxEnd = Math.max(arr[i], maxEnd + arr[i]);
            maxSum = Math.max(maxSum, maxEnd);
        }
        return maxSum;
    }

    public static int KadanesMin(int arr[]) {
        int minSum = arr[0];
        int minEnd = arr[0];
        for (int i = 1; i < arr.length; i++) {
            minEnd = Math.min(arr[i], minEnd + arr[i]);
            minSum = Math.min(minSum, minEnd);
        }
        return minSum;
    }

    public static void efficient(int arr[]) {
        int normalMax = KadanesMax(arr);
        if (normalMax < 0) {
            System.out.println(normalMax);
            return;
        }
        int minSum = KadanesMin(arr);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int circularMax = sum - minSum;// Overall sum of the array minus minimum sum of the array gives circular max
                                       // sum
        System.out.println((Math.max(circularMax, normalMax)));
    }

    public static void main(String[] args) {
        int arr[] = { 5, -2, 3, 4 };
        naive(arr);
        efficient(arr);
    }
}
