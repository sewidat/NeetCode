package org.example.dp1d;

/**
 * ============================================================
 * LeetCode #647 - Palindromic Substrings
 * Difficulty: Medium
 * Category: 1-D Dynamic Programming
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given a string s, return the number of palindromic substrings in it.
 * A string is a palindrome when it reads the same backward as forward.
 * A substring is a contiguous sequence of characters within the string.
 * Count each occurrence separately (e.g., "aa" in "aaa" counts twice).
 *
 * CONSTRAINTS
 * -----------
 * 1 <= s.length <= 1000
 * s consists of lowercase English letters.
 *
 * EXAMPLES
 * --------
 * s = "abc" → 3   (each single character: "a", "b", "c")
 * s = "aaa" → 6   ("a","a","a","aa","aa","aaa")
 *
 * INTUITION & APPROACH
 * --------------------
 * Similar to #5 (Longest Palindromic Substring) but instead of tracking
 * the longest, we COUNT every palindrome found.
 *
 * Use expand-around-center:
 * For each index i (0 to n-1):
 *   - Expand odd-length  palindromes centered at i
 *   - Expand even-length palindromes centered at (i, i+1)
 *   While s[left] == s[right], increment count and expand: left--, right++.
 *
 * Every successful (left, right) pair during expansion is a distinct palindrome.
 * Single characters trivially satisfy the condition and are counted immediately.
 *
 * KEY CONCEPTS
 * ------------
 * - Expand-around-center technique
 * - Count every palindrome, not just the longest
 * - Two expansion passes per center: odd (i,i) and even (i,i+1)
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n²)
 * Space: O(1)
 * ============================================================
 */
public class P647PalindromicSubstrings {
    public int countSubstrings(String s) {
        // TODO: implement
        return 0;
    }

    public static void main(String[] args) {
        P647PalindromicSubstrings sol = new P647PalindromicSubstrings();
        System.out.println(sol.countSubstrings("aaa")); // 6
        System.out.println(sol.countSubstrings("abc")); // 3
    }
}
