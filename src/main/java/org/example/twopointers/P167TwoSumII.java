package org.example.twopointers;

import java.util.Arrays;

/**
 * ============================================================
 * LeetCode #167 - Two Sum II - Input Array Is Sorted
 * Difficulty: Medium
 * Category: Two Pointers
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given a 1-indexed array of integers numbers that is already sorted in
 * non-decreasing order, return the 1-indexed indices [index1, index2] of
 * two numbers that add up to target. Exactly one solution exists and you
 * may not use the same element twice. The solution must use O(1) extra space.
 *
 * CONSTRAINTS
 * -----------
 * - 2 <= numbers.length <= 3 * 10^4
 * - -1000 <= numbers[i] <= 1000
 * - numbers is sorted in non-decreasing order
 * - -1000 <= target <= 1000
 * - Exactly one valid solution is guaranteed
 *
 * EXAMPLES
 * --------
 * Input: numbers = [2,7,11,15], target = 9  → Output: [1,2]
 * Input: numbers = [2,3,4],     target = 6  → Output: [1,3]
 *
 * INTUITION & APPROACH
 * --------------------
 * The sorted property makes two pointers directly applicable. Place one pointer
 * at the leftmost (smallest) element and one at the rightmost (largest). If the
 * sum of the two pointed elements equals target, return their 1-indexed positions.
 * If the sum is less than target, move the left pointer right to increase the sum.
 * If the sum is greater than target, move the right pointer left to decrease the sum.
 * This converges in O(n) without any extra space, exploiting the sorted order fully.
 *
 * KEY CONCEPTS
 * ------------
 * - Two pointers on a sorted array (opposite ends converging)
 * - Sorted property guarantees monotonic adjustment of sum
 * - Binary search is an alternative for each fixed left pointer: O(n log n)
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n) — each pointer moves at most n steps total
 * Space: O(1) — only two pointer variables used
 * ============================================================
 */
public class P167TwoSumII {

    public int[] twoSum(int[] numbers, int target) {
        // TODO: implement
        return new int[]{};
    }

    public static void main(String[] args) {
        P167TwoSumII sol = new P167TwoSumII();
        // Example 1: expected [1, 2]
        // System.out.println(Arrays.toString(sol.twoSum(new int[]{2,7,11,15}, 9)));
        // Example 2: expected [1, 3]
        // System.out.println(Arrays.toString(sol.twoSum(new int[]{2,3,4}, 6)));
        System.out.println("P167TwoSumII — uncomment examples above to test.");
    }
}
