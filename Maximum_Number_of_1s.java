// Given binary string s consisting of 0s and 1s only. You are allowed to do exactly one move that is you have to choose two indices i and j
// (1 ≤ i ≤ j ≤ |str| where |str| is string length) and toggle all the characters at position k where i ≤ k ≤ j.
// Toggling means changing 0 to 1 and 1 to 0. The task is to count the maximum possible number of 1's after exactly one move.
// Example 1:
// Input: s = "1010"
// Output: 3
// Explanation: You can make move on [2, 2]
// or [2, 4]

public class Maximum_Number_of_1s {
    public int maxOnes(String s){
        int n = s.length();
		int count = 0;
		int max = Integer.MIN_VALUE;
		int sum = 0;
		
		for(int i=0; i<n; i++){
		    int curr = (s.charAt(i)=='0') ? 1 : -1;
		    sum = Math.max(sum+curr, curr);
		    max = Math.max(max,sum);
		    count = (s.charAt(i)=='1') ? count+1 : count;
		}
		
		return max+count;
    }
    public static void main(String[] args) {
        
    }
}
