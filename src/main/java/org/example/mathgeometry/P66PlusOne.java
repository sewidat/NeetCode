package org.example.mathgeometry;

import java.util.Arrays;

/**
 * ============================================================
 * LeetCode #66 - Plus One
 * Difficulty: Easy
 * Category: Math & Geometry
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given a large integer represented as an integer array digits, where each
 * digits[i] is the i-th digit of the integer (most significant digit first),
 * increment the integer by one and return the resulting array.
 * The integer does not contain any leading zeros, except the number 0 itself.
 *
 * CONSTRAINTS
 * -----------
 * - 1 <= digits.length <= 100
 * - 0 <= digits[i] <= 9
 * - No leading zeros (except the number 0 itself)
 *
 * EXAMPLES
 * --------
 * Input: [1,2,3]   Output: [1,2,4]
 * Input: [1,2,9]   Output: [1,3,0]
 * Input: [9,9,9]   Output: [1,0,0,0]
 *
 * INTUITION & APPROACH
 * --------------------
 * Traverse the array from right to left (least-significant to most-significant):
 *   - If digits[i] < 9: increment and return immediately (no carry).
 *   - If digits[i] == 9: set to 0 and carry 1 to the next position.
 * If the loop completes without returning, all digits were 9.
 * Create a new array of length n+1 with a leading 1 (e.g., 999 → 1000).
 *
 * KEY CONCEPTS
 * ------------
 * - Right-to-left carry propagation
 * - If a digit is 9, set to 0 and carry; otherwise increment and done
 * - All-nines edge case requires a new array of length n+1
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n)
 * Space: O(n)  worst case (all 9s requires new array)
 * ============================================================
 */
public class P66PlusOne {

    public int[] plusOne(int[] digits) {
        // TODO: implement
        return new int[0];
    }

    public static void main(String[] args) {
        // P66PlusOne sol = new P66PlusOne();
        // System.out.println(Arrays.toString(sol.plusOne(new int[]{1,2,3}))); // [1, 2, 4]
        // System.out.println(Arrays.toString(sol.plusOne(new int[]{1,2,9}))); // [1, 3, 0]
        // System.out.println(Arrays.toString(sol.plusOne(new int[]{9,9,9}))); // [1, 0, 0, 0]
        System.out.println("P66PlusOne — uncomment examples above to test.");
    }
}
