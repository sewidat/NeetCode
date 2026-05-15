package org.example.slidingwindow;

/**
 * ============================================================
 * LeetCode #424 - Longest Repeating Character Replacement
 * Difficulty: Medium
 * Category: Sliding Window
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given a string s and an integer k, return the length of the longest substring
 * that contains only one distinct character after replacing at most k characters
 * in the string with any uppercase letter.
 *
 * CONSTRAINTS
 * -----------
 * - 1 <= s.length <= 10^5
 * - s consists of uppercase English letters only
 * - 0 <= k <= s.length
 *
 * EXAMPLES
 * --------
 * Input: s = "ABAB",    k = 2  → Output: 4  (replace both B's or both A's)
 * Input: s = "AABABBA", k = 1  → Output: 4  (replace one char to get "AABA" or "ABBA")
 *
 * INTUITION & APPROACH
 * --------------------
 * A window is valid if (window size - count of most frequent char) <= k, because
 * we can replace all non-dominant characters using at most k operations. Use a
 * sliding window: expand right and track character frequencies. When the window
 * becomes invalid (replacements needed > k), shrink from the left. Key optimization:
 * maxCount only ever increases — we only care about windows longer than our current
 * best, so we never need to decrease maxCount when shrinking (invalid smaller windows
 * are irrelevant).
 *
 * KEY CONCEPTS
 * ------------
 * - Sliding window with frequency count array of size 26
 * - Validity invariant: windowSize - maxFrequency <= k
 * - maxCount monotonically non-decreasing trick: avoids recomputing max on shrink
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n) — right pointer moves n steps; left pointer at most n steps total
 * Space: O(1) — fixed int[26] for letter frequencies
 * ============================================================
 */
public class P424LongestRepeatingCharacterReplacement {

    public int characterReplacement(String s, int k) {
        // TODO: implement
        return 0;
    }

    public static void main(String[] args) {
        P424LongestRepeatingCharacterReplacement sol = new P424LongestRepeatingCharacterReplacement();
        // Example 1: expected 4
        // System.out.println(sol.characterReplacement("ABAB", 2));
        // Example 2: expected 4
        // System.out.println(sol.characterReplacement("AABABBA", 1));
        System.out.println("P424LongestRepeatingCharacterReplacement — uncomment examples above to test.");
    }
}
