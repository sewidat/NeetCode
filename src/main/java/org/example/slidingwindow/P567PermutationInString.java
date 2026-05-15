package org.example.slidingwindow;

/**
 * ============================================================
 * LeetCode #567 - Permutation in String
 * Difficulty: Medium
 * Category: Sliding Window
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given two strings s1 and s2, return true if s2 contains a permutation of s1
 * as a contiguous substring. In other words, return true if any window of length
 * s1.length() in s2 is an anagram of s1.
 *
 * CONSTRAINTS
 * -----------
 * - 1 <= s1.length, s2.length <= 10^4
 * - s1 and s2 consist of lowercase English letters only
 *
 * EXAMPLES
 * --------
 * Input: s1 = "ab", s2 = "eidbaooo"  → Output: true  (window "ba" is a permutation)
 * Input: s1 = "ab", s2 = "eidboaoo"  → Output: false
 *
 * INTUITION & APPROACH
 * --------------------
 * A permutation of s1 is an anagram, so we need a window of exactly length s1.length()
 * in s2 whose character frequencies match s1's. Use a fixed-size sliding window:
 * precompute frequency arrays for s1 and the initial window of s2. Slide the window
 * right one character at a time, adding the new character and removing the old one.
 * Rather than comparing all 26 counts each step, maintain a "matches" counter that
 * tracks how many of the 26 characters have equal counts in s1 and the current window.
 * When matches == 26, a permutation exists.
 *
 * KEY CONCEPTS
 * ------------
 * - Fixed-size sliding window of length s1.length()
 * - Two int[26] frequency arrays (one for s1, one for current window)
 * - "matches" counter for O(1) per-step validity check instead of O(26)
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n) — where n = s2.length(); each character processed once
 * Space: O(1) — two fixed-size int[26] arrays
 * ============================================================
 */
public class P567PermutationInString {

    public boolean checkInclusion(String s1, String s2) {
        // TODO: implement
        return false;
    }

    public static void main(String[] args) {
        P567PermutationInString sol = new P567PermutationInString();
        // Example 1: expected true
        // System.out.println(sol.checkInclusion("ab", "eidbaooo"));
        // Example 2: expected false
        // System.out.println(sol.checkInclusion("ab", "eidboaoo"));
        System.out.println("P567PermutationInString — uncomment examples above to test.");
    }
}
