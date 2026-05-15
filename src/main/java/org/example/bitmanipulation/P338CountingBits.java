package org.example.bitmanipulation;

import java.util.Arrays;

/**
 * ============================================================
 * LeetCode #338 - Counting Bits
 * Difficulty: Easy
 * Category: Bit Manipulation
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given an integer n, return an array ans of length n + 1 such that for
 * each i (0 <= i <= n), ans[i] is the number of 1s in the binary
 * representation of i.
 *
 * CONSTRAINTS
 * -----------
 * - 0 <= n <= 10^5
 *
 * EXAMPLES
 * --------
 * Input: n = 2  Output: [0, 1, 1]
 * Input: n = 5  Output: [0, 1, 1, 2, 1, 2]
 *
 * INTUITION & APPROACH
 * --------------------
 * Dynamic Programming with the bit-shift recurrence:
 *   dp[i] = dp[i >> 1] + (i & 1)
 *
 * Reasoning:
 *   - i >> 1 is i with its least-significant bit removed (same as i / 2).
 *     The number of 1s in i equals the number of 1s in i/2 plus the last bit.
 *   - (i & 1) is 1 if i is odd (has a set LSB), 0 if even.
 *
 * Alternative recurrence: dp[i] = dp[i & (i-1)] + 1
 *   (i & (i-1) clears the lowest set bit, so dp[i] = dp without that bit + 1)
 *
 * KEY CONCEPTS
 * ------------
 * - DP recurrence: dp[i] = dp[i >> 1] + (i & 1)
 * - Leverages already-computed results via bit manipulation
 * - O(n) time with O(n) space for the result array
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n)
 * Space: O(n)
 * ============================================================
 */
public class P338CountingBits {

    public int[] countBits(int n) {
        // TODO: implement
        return new int[0];
    }

    public static void main(String[] args) {
        // P338CountingBits sol = new P338CountingBits();
        // System.out.println(Arrays.toString(sol.countBits(2))); // [0, 1, 1]
        // System.out.println(Arrays.toString(sol.countBits(5))); // [0, 1, 1, 2, 1, 2]
        System.out.println("P338CountingBits — uncomment examples above to test.");
    }
}
