package org.example.backtracking;
import java.util.ArrayList;
import java.util.List;

/**
 * ============================================================
 * LeetCode #131 - Palindrome Partitioning
 * Difficulty: Medium
 * Category: Backtracking
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given a string s, partition s such that every substring of the
 * partition is a palindrome. Return all possible palindrome
 * partitioning of s.
 *
 * CONSTRAINTS
 * -----------
 * 1 <= s.length <= 16
 * s consists of only lowercase English letters.
 *
 * EXAMPLES
 * --------
 * Input:  s = "aab"
 * Output: [["a","a","b"],["aa","b"]]
 *
 * Input:  s = "a"
 * Output: [["a"]]
 *
 * INTUITION & APPROACH
 * --------------------
 * Backtracking: iterate through all possible starting positions.
 * From the current start index, try every possible end index.
 * Check if the substring s[start..end] is a palindrome. If it is,
 * add it to the current partition list and recurse from end+1.
 * When start reaches the length of the string, the current
 * partition covers the entire string and is added to the results.
 * After recursing, remove the last added substring (backtrack).
 *
 * Optimization: precompute a 2D boolean table isPalin[i][j] using
 * dynamic programming to check palindromes in O(1) during backtracking.
 *
 * KEY CONCEPTS
 * ------------
 * - Backtracking: enumerate all cuts starting from current position
 * - Palindrome check: expand from center or compare s[i]==s[j] with inner check
 * - Optional DP precomputation for O(1) palindrome queries
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n * 2^n) — up to 2^n partitions, each checked in O(n)
 * Space: O(n) recursion stack depth
 * ============================================================
 */
public class P131PalindromePartitioning {

    public List<List<String>> partition(String s) {
        // TODO: implement
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        P131PalindromePartitioning sol = new P131PalindromePartitioning();
        // System.out.println(sol.partition("aab"));
        // expected [["a","a","b"],["aa","b"]]
        System.out.println("P131PalindromePartitioning — uncomment examples above to test.");
    }
}
