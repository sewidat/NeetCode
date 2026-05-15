package org.example.dp2d;

/**
 * ============================================================
 * LeetCode #97 - Interleaving String
 * Difficulty: Medium
 * Category: 2-D Dynamic Programming
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given strings s1, s2, and s3, find whether s3 is formed by an
 * interleaving of s1 and s2. An interleaving of two strings s and t
 * is a configuration where s and t are divided into n and m substrings
 * respectively, such that s = s1 + s2 + ... + sn, t = t1 + t2 + ... + tm,
 * and the interleaving is s1 + t1 + s2 + t2 + ... or t1 + s1 + t2 + s2 + ...
 * Characters maintain their relative order from each original string.
 *
 * CONSTRAINTS
 * -----------
 * 0 <= s1.length, s2.length <= 100
 * 0 <= s3.length <= 200
 * s1, s2, and s3 consist of lowercase English letters.
 *
 * EXAMPLES
 * --------
 * s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac"  → true
 * s1 = "aabcc", s2 = "dbbca", s3 = "aadbbbaccc"  → false
 * s1 = "",       s2 = "",      s3 = ""             → true
 *
 * INTUITION & APPROACH
 * --------------------
 * Define dp[i][j] = true if s3[0..i+j-1] can be formed by interleaving
 * s1[0..i-1] and s2[0..j-1].
 *
 * Recurrence (we added one more character to s3 either from s1 or s2):
 *   dp[i][j] = (dp[i-1][j] && s1[i-1] == s3[i+j-1])   // extend from s1
 *           || (dp[i][j-1] && s2[j-1] == s3[i+j-1])   // extend from s2
 *
 * Base cases:
 *   dp[0][0] = true  (both empty strings form empty s3)
 *   dp[i][0] = dp[i-1][0] && s1[i-1] == s3[i-1]  (only s1 chars used)
 *   dp[0][j] = dp[0][j-1] && s2[j-1] == s3[j-1]  (only s2 chars used)
 *
 * Guard: if s1.length + s2.length != s3.length, return false immediately.
 *
 * Space optimization: 1D dp array of length s2.length+1, updated in place
 * row by row, works because we only look left (j-1) and up (previous row).
 *
 * KEY CONCEPTS
 * ------------
 * - 2D DP: dp[i][j] uses i chars from s1 and j chars from s2 to match s3[0..i+j-1]
 * - Two transitions: consume from s1 or consume from s2
 * - Early exit if total lengths mismatch
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(m * n)
 * Space: O(m * n) — optimizable to O(n)
 * ============================================================
 */
public class P97InterleavingString {
    public boolean isInterleave(String s1, String s2, String s3) {
        // TODO: implement
        return false;
    }

    public static void main(String[] args) {
        P97InterleavingString sol = new P97InterleavingString();
        System.out.println(sol.isInterleave("aabcc", "dbbca", "aadbbcbcac")); // true
        System.out.println(sol.isInterleave("aabcc", "dbbca", "aadbbbaccc")); // false
    }
}
