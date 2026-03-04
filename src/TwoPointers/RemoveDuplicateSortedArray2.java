/*80. Remove Duplicates from Sorted Array II

Given a sorted array, modify it in-place such that each unique element appears at most twice. Return the new length k after placing the valid elements in the first k positions.

💡 Approach

Used Two Pointer technique.

First two elements are always valid.

From index 2, compare current element with nums[k-2].

If different, place it at index k and increment k.

Ensures each element appears at most twice.

In-place modification with constant extra space.

⏱ Complexity

Time Complexity: O(n)

Space Complexity: O(1) */
public class RemoveDuplicateSortedArray2 {

    public int removeDuplicates(int[] nums) {
        int k = 2;// allowed two copies
        int n = nums.length;
        if (n <= 2)
            return n;
        for (int i = 2; i < n; i++) {
            if (nums[i] != nums[k - 2]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;

    }
}
