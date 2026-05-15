package org.example.bitmanipulation;

/**
 * ============================================================
 * LeetCode #268 - Missing Number
 * Difficulty: Easy
 * Category: Bit Manipulation
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given an array nums containing n distinct numbers in the range [0, n],
 * return the only number in the range that is missing from the array.
 *
 * CONSTRAINTS
 * -----------
 * - n == nums.length
 * - 1 <= n <= 10^4
 * - 0 <= nums[i] <= n
 * - All the numbers of nums are unique
 *
 * EXAMPLES
 * --------
 * Input: [3,0,1]                   Output: 2
 * Input: [0,1]                     Output: 2
 * Input: [9,6,4,2,3,5,7,0,1]       Output: 8
 *
 * INTUITION & APPROACH
 * --------------------
 * Approach 1 — Gauss sum (Math):
 *   Expected sum of 0..n = n*(n+1)/2.
 *   Actual sum = sum of all elements in nums.
 *   Missing = expected - actual.  O(n) time, O(1) space.
 *
 * Approach 2 — XOR (Bit Manipulation):
 *   XOR all indices from 0 to n with all values in nums.
 *   Every number that appears cancels out (x^x=0), leaving only the missing
 *   number (which never got to cancel its index).
 *   result = 0 ^ 0 ^ nums[0] ^ 1 ^ nums[1] ^ ... ^ n  O(n) time, O(1) space.
 *
 * KEY CONCEPTS
 * ------------
 * - Gauss formula: n*(n+1)/2 gives expected sum without iteration
 * - XOR pairing: each present number cancels its own index; missing one remains
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n)
 * Space: O(1)
 * ============================================================
 */
public class P268MissingNumber {

    public int missingNumber(int[] nums) {
        // TODO: implement
        return 0;
    }

    public static void main(String[] args) {
        // P268MissingNumber sol = new P268MissingNumber();
        // System.out.println(sol.missingNumber(new int[]{3,0,1}));               // 2
        // System.out.println(sol.missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));  // 8
        System.out.println("P268MissingNumber — uncomment examples above to test.");
    }
}
