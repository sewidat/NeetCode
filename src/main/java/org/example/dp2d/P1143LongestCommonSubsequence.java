package org.example.dp2d;

/**
 * ============================================================
 * LeetCode #1143 - Longest Common Subsequence
 * Difficulty: Medium
 * Category: 2-D Dynamic Programming
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given two strings text1 and text2, return the length of their longest
 * common subsequence. If there is no common subsequence, return 0.
 * A subsequence is a sequence derived from a string by deleting some
 * characters (possibly none) without changing the relative order of the
 * remaining characters.
 *
 * CONSTRAINTS
 * -----------
 * 1 <= text1.length, text2.length <= 1000
 * text1 and text2 consist of only lowercase English characters.
 *
 * EXAMPLES
 * --------
 * text1 = "abcde", text2 = "ace"   → 3   (LCS = "ace")
 * text1 = "abc",   text2 = "abc"   → 3   (LCS = "abc")
 * text1 = "abc",   text2 = "def"   → 0   (no common subsequence)
 *
 * INTUITION & APPROACH
 * --------------------
 * Define dp[i][j] = length of LCS of text1[0..i-1] and text2[0..j-1].
 *
 * Recurrence:
 *   If text1[i-1] == text2[j-1]:   dp[i][j] = dp[i-1][j-1] + 1
 *     (characters match — extend the diagonal value)
 *   Else:                           dp[i][j] = max(dp[i-1][j], dp[i][j-1])
 *     (mismatch — take best of dropping a char from either string)
 *
 * Base cases: dp[0][j] = dp[i][0] = 0 (LCS with empty string is 0).
 *
 * Fill the table bottom-up, row by row. The answer is dp[m][n].
 *
 * Space optimization: Only the current and previous rows are needed,
 * reducing space from O(m*n) to O(n).
 *
 * KEY CONCEPTS
 * ------------
 * - 2D DP table, indices are 1-based (0th row/col are base-case zeros)
 * - Match: extend diagonal (dp[i-1][j-1] + 1)
 * - Mismatch: max of top (dp[i-1][j]) or left (dp[i][j-1])
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(m * n)
 * Space: O(m * n) — optimizable to O(n)
 * ============================================================
 */
public class P1143LongestCommonSubsequence {
    public int longestCommonSubsequence(String text1, String text2) {
        // TODO: implement
        return 0;
    }

    public static void main(String[] args) {
        P1143LongestCommonSubsequence sol = new P1143LongestCommonSubsequence();
        System.out.println(sol.longestCommonSubsequence("abcde", "ace")); // 3
        System.out.println(sol.longestCommonSubsequence("abc", "def"));   // 0
    }
}
