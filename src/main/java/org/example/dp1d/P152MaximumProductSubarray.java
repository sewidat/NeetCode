package org.example.dp1d;

/**
 * ============================================================
 * LeetCode #152 - Maximum Product Subarray
 * Difficulty: Medium
 * Category: 1-D Dynamic Programming
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given an integer array nums, find a contiguous subarray (containing
 * at least one number) which has the largest product, and return its product.
 *
 * CONSTRAINTS
 * -----------
 * 1 <= nums.length <= 2 * 10^4
 * -10 <= nums[i] <= 10
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 *
 * EXAMPLES
 * --------
 * nums = [2, 3, -2, 4]  → 6   (subarray [2, 3])
 * nums = [-2, 0, -1]    → 0   (subarray [0])
 *
 * INTUITION & APPROACH
 * --------------------
 * Unlike maximum sum subarray (Kadane's), a negative number can flip
 * the sign of the product. A large negative times another negative
 * becomes a large positive. We must track BOTH the max and min product
 * ending at the current index.
 *
 * At each element num:
 *   candidates = {num, num * prevMax, num * prevMin}
 *   newMax = max of all three candidates
 *   newMin = min of all three candidates
 *
 * Update global result with newMax at each step.
 *
 * Recurrence (letting M = prevMax, m = prevMin):
 *   curMax = max(num, num * M, num * m)
 *   curMin = min(num, num * M, num * m)
 *   result = max(result, curMax)
 *
 * KEY CONCEPTS
 * ------------
 * - Track both max and min product ending at each position
 * - Negative number swaps max and min
 * - Three-way max/min at each step: num alone, num*prevMax, num*prevMin
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n)
 * Space: O(1)
 * ============================================================
 */
public class P152MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        // TODO: implement
        return 0;
    }

    public static void main(String[] args) {
        P152MaximumProductSubarray sol = new P152MaximumProductSubarray();
        System.out.println(sol.maxProduct(new int[]{2, 3, -2, 4})); // 6
        System.out.println(sol.maxProduct(new int[]{-2, 0, -1}));   // 0
    }
}
