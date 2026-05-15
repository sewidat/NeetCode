package org.example.slidingwindow;

import java.util.HashSet;
import java.util.Set;

/**
 * ============================================================
 * LeetCode #3 - Longest Substring Without Repeating Characters
 * Difficulty: Medium
 * Category: Sliding Window
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given a string s, find the length of the longest substring that contains
 * no duplicate characters. A substring is a contiguous sequence of characters
 * within the string.
 *
 * CONSTRAINTS
 * -----------
 * - 0 <= s.length <= 5 * 10^4
 * - s consists of English letters, digits, symbols, and spaces (any ASCII)
 *
 * EXAMPLES
 * --------
 * Input: s = "abcabcbb"  → Output: 3  (substring "abc")
 * Input: s = "bbbbb"     → Output: 1  (substring "b")
 * Input: s = "pwwkew"    → Output: 3  (substring "wke")
 *
 * INTUITION & APPROACH
 * --------------------
 * Use a sliding window with a HashSet tracking characters currently in the window.
 * Expand the right pointer one character at a time. If the new character is already
 * in the set (duplicate), shrink the window from the left — remove s[left] from the
 * set and advance left — until the duplicate is gone. Then add s[right] and update
 * the max length. A faster variant uses a HashMap of char → last index for O(1)
 * jumps of the left pointer, skipping past the previous occurrence directly.
 *
 * KEY CONCEPTS
 * ------------
 * - Variable-size sliding window (expand right, shrink left on duplicate)
 * - HashSet to maintain current window's character set
 * - HashMap optimization: jump left pointer to lastIndex[char] + 1
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n) — each character is added and removed from the set at most once
 * Space: O(min(n, m)) — window size bounded by charset size m (ASCII: 128)
 * ============================================================
 */
public class P3LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        // TODO: implement
        return 0;
    }

    public static void main(String[] args) {
        P3LongestSubstringWithoutRepeatingCharacters sol = new P3LongestSubstringWithoutRepeatingCharacters();
        // Example 1: expected 3
        // System.out.println(sol.lengthOfLongestSubstring("abcabcbb"));
        // Example 2: expected 3
        // System.out.println(sol.lengthOfLongestSubstring("pwwkew"));
        System.out.println("P3LongestSubstringWithoutRepeatingCharacters — uncomment examples above to test.");
    }
}
