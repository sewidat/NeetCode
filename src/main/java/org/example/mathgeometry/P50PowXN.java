package org.example.mathgeometry;

/**
 * ============================================================
 * LeetCode #50 - Pow(x, n)
 * Difficulty: Medium
 * Category: Math & Geometry
 * ============================================================
 *
 * PROBLEM
 * -------
 * Implement pow(x, n), which calculates x raised to the power n (i.e., x^n).
 * Handle negative exponents and the full signed 32-bit integer range for n.
 *
 * CONSTRAINTS
 * -----------
 * - -100.0 < x < 100.0
 * - -2^31 <= n <= 2^31 - 1
 * - n is a 32-bit signed integer
 * - The answer is guaranteed to be within 10^4 in absolute value
 *
 * EXAMPLES
 * --------
 * Input: x = 2.00000, n = 10   Output: 1024.00000
 * Input: x = 2.10000, n = 3    Output: 9.26100
 * Input: x = 2.00000, n = -2   Output: 0.25000  (1/2^2 = 1/4 = 0.25)
 *
 * INTUITION & APPROACH
 * --------------------
 * Binary (fast) exponentiation:
 *   - If n is negative, compute pow(1/x, -n).
 *   - Recursively (or iteratively):
 *       If n == 0, return 1.
 *       If n is even: pow(x, n) = pow(x*x, n/2)   — halve the work.
 *       If n is odd:  pow(x, n) = x * pow(x, n-1) — reduce to even case.
 * Caution: n can be Integer.MIN_VALUE; use a long to avoid overflow when
 * negating n.
 *
 * KEY CONCEPTS
 * ------------
 * - Binary exponentiation (divide-and-conquer on exponent)
 * - Even exponent: square the base, halve the exponent
 * - Negative exponent: invert base (x → 1/x), negate exponent
 * - Use long for n to handle Integer.MIN_VALUE safely
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(log n)
 * Space: O(log n) recursive; O(1) iterative
 * ============================================================
 */
public class P50PowXN {

    public double myPow(double x, int n) {
        // TODO: implement
        return 0.0;
    }

    public static void main(String[] args) {
        // P50PowXN sol = new P50PowXN();
        // System.out.println(sol.myPow(2.0,  10)); // 1024.0
        // System.out.println(sol.myPow(2.0,  -2)); // 0.25
        // System.out.println(sol.myPow(2.1,   3)); // ~9.261
        System.out.println("P50PowXN — uncomment examples above to test.");
    }
}
