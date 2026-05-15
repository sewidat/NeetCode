package org.example.greedy;

/**
 * ============================================================
 * LeetCode #53 - Maximum Subarray
 * Difficulty: Medium
 * Category: Greedy
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given an integer array nums, find the contiguous subarray (containing
 * at least one number) which has the largest sum and return its sum.
 *
 * CONSTRAINTS
 * -----------
 * - 1 <= nums.length <= 10^5
 * - -10^4 <= nums[i] <= 10^4
 *
 * EXAMPLES
 * --------
 * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]  Output: 6  (subarray [4,-1,2,1])
 * Input: nums = [1]                        Output: 1
 * Input: nums = [5,4,-1,7,8]              Output: 23
 *
 * INTUITION & APPROACH
 * --------------------
 * Kadane's algorithm: maintain a running currentSum. At each position, decide
 * whether to extend the existing subarray or start fresh from nums[i].
 * currentSum = max(nums[i], currentSum + nums[i])
 * When currentSum goes negative it can only hurt future sums — reset by
 * starting a new subarray at the current element.
 * Track the global maximum across all positions.
 *
 * KEY CONCEPTS
 * ------------
 * - Kadane's algorithm
 * - Reset subarray (currentSum) when it goes negative
 * - Single pass, constant space
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n)
 * Space: O(1)
 * ============================================================
 */
public class P53MaximumSubarray {

    public int maxSubArray(int[] nums) {
        // TODO: implement
        return 0;
    }

    public static void main(String[] args) {
        // P53MaximumSubarray sol = new P53MaximumSubarray();
        // System.out.println(sol.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4})); // 6
        // System.out.println(sol.maxSubArray(new int[]{1}));                      // 1
        // System.out.println(sol.maxSubArray(new int[]{5,4,-1,7,8}));             // 23
        System.out.println("P53MaximumSubarray — uncomment examples above to test.");
    }
}
