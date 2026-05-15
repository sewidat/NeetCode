package org.example.bitmanipulation;

/**
 * ============================================================
 * LeetCode #190 - Reverse Bits
 * Difficulty: Easy
 * Category: Bit Manipulation
 * ============================================================
 *
 * PROBLEM
 * -------
 * Reverse the bits of a given 32-bit unsigned integer and return the result
 * as an unsigned integer (represented as a signed Java int).
 *
 * CONSTRAINTS
 * -----------
 * - The input must be treated as an unsigned 32-bit integer
 * - The output must be returned as an unsigned 32-bit integer
 *
 * EXAMPLES
 * --------
 * Input:  n = 43261596
 *         binary: 00000010100101000001111010011100
 * Output: 964176192
 *         binary: 00111001011110000010100101000000
 *
 * Input:  n = 4294967293  (unsigned 11111111111111111111111111111101)
 * Output: 3221225471
 *
 * INTUITION & APPROACH
 * --------------------
 * Iterate exactly 32 times (one per bit):
 *   1. Left-shift result by 1 to make room for the next bit.
 *   2. Extract the LSB of n with (n & 1) and OR it into result.
 *   3. Right-shift n by 1 (unsigned: >>>1) to process the next bit.
 * After 32 iterations, result holds the bit-reversed value.
 *
 * Alternative: Integer.reverse(n) in one line.
 * Alternative: Divide-and-conquer with bitmask swaps (swap halves, quarters,
 * pairs, individual bits) — also O(1) but more complex.
 *
 * KEY CONCEPTS
 * ------------
 * - Extract LSB with n & 1; shift n right with >>> (unsigned)
 * - Accumulate into result by shifting left and OR-ing the extracted bit
 * - Exactly 32 iterations for 32-bit integers
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(1)  (fixed 32 iterations)
 * Space: O(1)
 * ============================================================
 */
public class P190ReverseBits {

    public int reverseBits(int n) {
        // TODO: implement
        return 0;
    }

    public static void main(String[] args) {
        // P190ReverseBits sol = new P190ReverseBits();
        // System.out.println(sol.reverseBits(43261596));  // 964176192
        // System.out.println(Integer.toUnsignedString(sol.reverseBits(43261596))); // "964176192"
        System.out.println("P190ReverseBits — uncomment examples above to test.");
    }
}
