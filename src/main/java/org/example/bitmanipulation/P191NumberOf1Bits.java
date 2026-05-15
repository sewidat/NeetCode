package org.example.bitmanipulation;

/**
 * ============================================================
 * LeetCode #191 - Number of 1 Bits
 * Difficulty: Easy
 * Category: Bit Manipulation
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given a positive integer n, return the number of set bits (1s) in its
 * binary representation. This is also known as the Hamming weight.
 *
 * CONSTRAINTS
 * -----------
 * - 1 <= n <= 2^31 - 1
 * - n is treated as an unsigned 32-bit integer
 *
 * EXAMPLES
 * --------
 * Input: n = 11  (binary: 00000000000000000000000000001011)  Output: 3
 * Input: n = 128 (binary: 00000000000000000000000010000000)  Output: 1
 * Input: n = 2147483645                                       Output: 30
 *
 * INTUITION & APPROACH
 * --------------------
 * Approach 1 — n & (n-1) trick:
 *   n & (n-1) clears the lowest set bit of n. Count how many times this
 *   operation can be applied before n reaches 0. The count equals the
 *   number of set bits.
 *
 * Approach 2 — Shift and check:
 *   Iterate 32 times, checking the LSB with n & 1 and right-shifting n
 *   each time (use unsigned right-shift >>> to avoid sign-extension issues).
 *
 * Approach 3 — Built-in:
 *   Integer.bitCount(n) — O(1) with hardware popcount.
 *
 * KEY CONCEPTS
 * ------------
 * - n & (n-1) removes the lowest set bit; count iterations to reach 0
 * - Use >>> (unsigned right-shift) when shifting to avoid sign extension
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(1)  (at most 32 iterations)
 * Space: O(1)
 * ============================================================
 */
public class P191NumberOf1Bits {

    public int hammingWeight(int n) {
        // TODO: implement
        return 0;
    }

    public static void main(String[] args) {
        // P191NumberOf1Bits sol = new P191NumberOf1Bits();
        // System.out.println(sol.hammingWeight(11));  // 3
        // System.out.println(sol.hammingWeight(128)); // 1
        System.out.println("P191NumberOf1Bits — uncomment examples above to test.");
    }
}
