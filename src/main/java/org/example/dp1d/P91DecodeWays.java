package org.example.dp1d;

/**
 * ============================================================
 * LeetCode #91 - Decode Ways
 * Difficulty: Medium
 * Category: 1-D Dynamic Programming
 * ============================================================
 *
 * PROBLEM
 * -------
 * A message containing letters A-Z can be encoded into numbers using:
 * 'A' → "1", 'B' → "2", ..., 'Z' → "26".
 * Given a string s of digits, return the number of ways to decode it.
 * The string may have leading zeros. A '0' cannot stand alone as a code.
 *
 * CONSTRAINTS
 * -----------
 * 1 <= s.length <= 100
 * s contains only digits.
 * s may contain leading zeros.
 *
 * EXAMPLES
 * --------
 * s = "12"  → 2   ("AB" = 1 2, or "L" = 12)
 * s = "226" → 3   ("BZ"=2 26, "VF"=22 6, "BBF"=2 2 6)
 * s = "06"  → 0   (leading zero — invalid)
 *
 * INTUITION & APPROACH
 * --------------------
 * Define dp[i] = number of ways to decode s[0..i-1] (first i characters).
 *
 * At each position i (1-indexed):
 *   1. Single-digit decode: if s[i-1] != '0', the digit alone is valid (1-9).
 *      dp[i] += dp[i-1]
 *   2. Two-digit decode: if i >= 2 and the two-digit number s[i-2..i-1] is
 *      in range [10, 26], it forms a valid letter.
 *      dp[i] += dp[i-2]
 *
 * Base cases:
 *   dp[0] = 1  (empty prefix — one way to decode nothing)
 *   dp[1] = 1  if s[0] != '0', else 0
 *
 * KEY CONCEPTS
 * ------------
 * - dp[i] counts ways to decode the first i characters
 * - Check single-digit (1-9) and two-digit (10-26) decodings separately
 * - '0' cannot be decoded alone; two-digit must be 10-26
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n)
 * Space: O(n) — can be optimized to O(1) with two variables
 * ============================================================
 */
public class P91DecodeWays {
    public int numDecodings(String s) {
        // TODO: implement
        return 0;
    }

    public static void main(String[] args) {
        P91DecodeWays sol = new P91DecodeWays();
        System.out.println(sol.numDecodings("226")); // 3
        System.out.println(sol.numDecodings("06"));  // 0
        System.out.println(sol.numDecodings("12"));  // 2
    }
}
