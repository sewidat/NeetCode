package org.example.bitmanipulation;

/**
 * ============================================================
 * LeetCode #371 - Sum of Two Integers
 * Difficulty: Medium
 * Category: Bit Manipulation
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given two integers a and b, return the sum of the two integers without
 * using the operators + or -.
 *
 * CONSTRAINTS
 * -----------
 * - -1000 <= a, b <= 1000
 *
 * EXAMPLES
 * --------
 * Input: a = 1, b = 2   Output: 3
 * Input: a = 2, b = 3   Output: 5
 * Input: a = -1, b = 1  Output: 0
 *
 * INTUITION & APPROACH
 * --------------------
 * Simulate binary addition with XOR and AND:
 *   - a ^ b  gives the sum of bits WITHOUT carry (XOR = addition mod 2).
 *   - (a & b) << 1  gives the carry bits shifted to the correct position.
 * Iterate: set a = a ^ b (sum without carry), b = (a_old & b) << 1 (carry).
 * Repeat until b == 0 (no more carry), at which point a is the final sum.
 *
 * In Java, negative numbers use two's complement. The iteration still
 * converges correctly for signed integers because Java int arithmetic is
 * already two's complement and the carry eventually becomes 0.
 * If the language requires masking (e.g., Python with arbitrary precision),
 * use mask = 0xFFFFFFFF and convert back at the end.
 *
 * KEY CONCEPTS
 * ------------
 * - a ^ b = sum without carry
 * - (a & b) << 1 = carry bits
 * - Iterate until carry (b) == 0
 * - Java two's complement handles negatives correctly
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(1)  (bounded by 32-bit width)
 * Space: O(1)
 * ============================================================
 */
public class P371SumOfTwoIntegers {

    public int getSum(int a, int b) {
        // TODO: implement
        return 0;
    }

    public static void main(String[] args) {
        // P371SumOfTwoIntegers sol = new P371SumOfTwoIntegers();
        // System.out.println(sol.getSum(1, 2));   // 3
        // System.out.println(sol.getSum(-1, 1));  // 0
        // System.out.println(sol.getSum(2, 3));   // 5
        System.out.println("P371SumOfTwoIntegers — uncomment examples above to test.");
    }
}
