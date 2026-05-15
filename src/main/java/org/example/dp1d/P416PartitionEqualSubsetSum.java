package org.example.dp1d;

/**
 * ============================================================
 * LeetCode #416 - Partition Equal Subset Sum
 * Difficulty: Medium
 * Category: 1-D Dynamic Programming
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given an integer array nums, return true if you can partition the array
 * into two subsets such that the sum of elements in both subsets is equal.
 *
 * CONSTRAINTS
 * -----------
 * 1 <= nums.length <= 200
 * 1 <= nums[i] <= 100
 *
 * EXAMPLES
 * --------
 * nums = [1, 5, 11, 5]  → true   (subsets {1,5,5} and {11})
 * nums = [1, 2, 3, 5]   → false  (no equal-sum partition)
 *
 * INTUITION & APPROACH
 * --------------------
 * For a valid partition: both subsets must have equal sum, so the total
 * sum must be even. If odd, immediately return false.
 *
 * Reduce to 0/1 Knapsack: can we select a subset of nums that sums to
 * total/2 (the "target")?
 *
 * Define dp[j] = true if we can form sum j using some subset of nums.
 * Base: dp[0] = true (empty subset sums to 0).
 *
 * For each num in nums:
 *   Iterate j from target down to num (reverse to prevent reusing num):
 *     dp[j] |= dp[j - num]
 *
 * Reverse iteration is critical: it ensures each element is used at most
 * once (0/1 knapsack property). Forward iteration would allow reuse.
 *
 * Answer: dp[target].
 *
 * KEY CONCEPTS
 * ------------
 * - Reduce to 0/1 subset-sum: target = totalSum / 2
 * - 1D DP with reverse iteration to avoid reusing elements
 * - Recurrence: dp[j] |= dp[j - num], iterated j from target down to num
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n * target)  where target = sum(nums) / 2
 * Space: O(target)
 * ============================================================
 */
public class P416PartitionEqualSubsetSum {
    public boolean canPartition(int[] nums) {
        // TODO: implement
        return false;
    }

    public static void main(String[] args) {
        P416PartitionEqualSubsetSum sol = new P416PartitionEqualSubsetSum();
        System.out.println(sol.canPartition(new int[]{1, 5, 11, 5})); // true
        System.out.println(sol.canPartition(new int[]{1, 2, 3, 5}));  // false
    }
}
