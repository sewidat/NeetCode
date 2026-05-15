package org.example.dp1d;

/**
 * ============================================================
 * LeetCode #5 - Longest Palindromic Substring
 * Difficulty: Medium
 * Category: 1-D Dynamic Programming
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given a string s, return the longest palindromic substring in s.
 *
 * CONSTRAINTS
 * -----------
 * 1 <= s.length <= 1000
 * s consists of digits and English letters.
 *
 * EXAMPLES
 * --------
 * s = "babad" → "bab"  (or "aba")
 * s = "cbbd"  → "bb"
 *
 * INTUITION & APPROACH
 * --------------------
 * Use the expand-around-center technique instead of a 2D DP table.
 * Every palindrome has a center — either a single character (odd length)
 * or a gap between two identical characters (even length).
 *
 * For each index i (0 to n-1):
 *   - Expand outward for odd-length  palindromes (center = i)
 *   - Expand outward for even-length palindromes (center = i, i+1)
 *   While s[left] == s[right], expand: left--, right++.
 *   Track the start and length of the longest palindrome found.
 *
 * This achieves O(n²) time with O(1) extra space.
 * Alternative: 2D DP where dp[i][j] = true if s[i..j] is palindrome,
 * but that costs O(n²) space.
 *
 * KEY CONCEPTS
 * ------------
 * - Expand-around-center for both odd and even length palindromes
 * - O(1) space vs O(n²) space DP table approach
 * - Iterate each center, expand while characters match
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n²)
 * Space: O(1)
 * ============================================================
 */
public class P5LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        // TODO: implement
        return "";
    }

    public static void main(String[] args) {
        P5LongestPalindromicSubstring sol = new P5LongestPalindromicSubstring();
        System.out.println(sol.longestPalindrome("babad")); // "bab" or "aba"
        System.out.println(sol.longestPalindrome("cbbd"));  // "bb"
    }
}
