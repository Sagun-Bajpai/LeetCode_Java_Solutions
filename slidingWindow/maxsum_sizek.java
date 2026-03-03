/*
 Problem: Max Sum Subarray of Size K (GFG)
 Technique: Sliding Window (Two Pointers)

 Time Complexity: O(n)
 Space Complexity: O(1)
*/
package slidingWindow;

public class maxsum_sizek {
    public int maxSubarraySum(int[] arr, int k) {

        int n = arr.length;
        int sum = 0;
        int low = 0;
        int high = k;

        // First window
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        int result = sum;

        while (high < n) {
            sum = sum - arr[low]; // remove left
            sum = sum + arr[high]; // add new right

            result = Math.max(result, sum);

            low++;
            high++;
        }

        return result;
    }
}
