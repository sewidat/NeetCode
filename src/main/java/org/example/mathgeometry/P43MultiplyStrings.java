package org.example.mathgeometry;

/**
 * ============================================================
 * LeetCode #43 - Multiply Strings
 * Difficulty: Medium
 * Category: Math & Geometry
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given two non-negative integers num1 and num2 represented as strings,
 * return the product of num1 and num2, also represented as a string.
 * You must not use any built-in BigInteger library or convert the inputs
 * directly to integers.
 *
 * CONSTRAINTS
 * -----------
 * - 1 <= num1.length, num2.length <= 200
 * - num1 and num2 consist of digits only
 * - Neither num1 nor num2 has leading zeros, except the number "0" itself
 *
 * EXAMPLES
 * --------
 * Input: num1 = "2",   num2 = "3"    Output: "6"
 * Input: num1 = "123", num2 = "456"  Output: "56088"
 *
 * INTUITION & APPROACH
 * --------------------
 * Simulate grade-school long multiplication.
 * A result array of size m + n (m = num1.length, n = num2.length) is
 * sufficient because the product of an m-digit and n-digit number has at
 * most m + n digits.
 *
 * For each pair (i, j) — digit i in num1, digit j in num2:
 *   - product = (num1[i] - '0') * (num2[j] - '0')
 *   - The contribution lands at positions p1 = i+j and p2 = i+j+1
 *     (p1 is the higher-order position, p2 the lower-order).
 *   - sum = product + result[p2]
 *   - result[p2] = sum % 10
 *   - result[p1] += sum / 10
 *
 * Build the final string from result[], skipping any leading zeros.
 *
 * KEY CONCEPTS
 * ------------
 * - Grade-school multiplication with position mapping (i+j, i+j+1)
 * - Carry propagation via result[p1] += sum/10
 * - Skip leading zeros in result; handle "0" edge case
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(m * n)
 * Space: O(m + n)
 * ============================================================
 */
public class P43MultiplyStrings {

    public String multiply(String num1, String num2) {
        // TODO: implement
        return "";
    }

    public static void main(String[] args) {
        // P43MultiplyStrings sol = new P43MultiplyStrings();
        // System.out.println(sol.multiply("123", "456")); // 56088
        // System.out.println(sol.multiply("2",   "3"));   // 6
        // System.out.println(sol.multiply("0",   "0"));   // 0
        System.out.println("P43MultiplyStrings — uncomment examples above to test.");
    }
}
