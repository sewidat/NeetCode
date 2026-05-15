package org.example.slidingwindow;

import java.util.HashMap;
import java.util.Map;

/**
 * ============================================================
 * LeetCode #76 - Minimum Window Substring
 * Difficulty: Hard
 * Category: Sliding Window
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given strings s and t, return the minimum length window substring of s such
 * that every character in t (including duplicates) is present in the window.
 * If no such window exists, return the empty string "". The answer is guaranteed
 * to be unique when it exists.
 *
 * CONSTRAINTS
 * -----------
 * - 1 <= s.length, t.length <= 10^5
 * - s and t consist of uppercase and lowercase English letters
 * - The answer is guaranteed to be unique if it exists
 *
 * EXAMPLES
 * --------
 * Input: s = "ADOBECODEBANC", t = "ABC"  → Output: "BANC"
 * Input: s = "a", t = "a"               → Output: "a"
 * Input: s = "a", t = "aa"              → Output: ""
 *
 * INTUITION & APPROACH
 * --------------------
 * Use a variable-size sliding window. Build a frequency map for t (need map). Expand
 * the right pointer: when s[right] is a needed character, increment "have" if its
 * count in the window now matches the needed count. When have == need (all t chars
 * satisfied), record the window if it's the smallest seen, then shrink from the left
 * to try to minimize. When shrinking removes a needed character (window count drops
 * below required), decrement "have" and continue expanding. This guarantees O(n+m).
 *
 * KEY CONCEPTS
 * ------------
 * - Variable-size sliding window: expand until valid, shrink to minimize
 * - Two HashMaps: need (from t) and window (current window counts)
 * - have/need integer counters for O(1) validity check per step
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n + m) — n = s.length(), m = t.length(); each pointer traverses s once
 * Space: O(n + m) — frequency maps for s characters in window and all t characters
 * ============================================================
 */
public class P76MinimumWindowSubstring {

    public String minWindow(String s, String t) {
        // TODO: implement
        return "";
    }

    public static void main(String[] args) {
        P76MinimumWindowSubstring sol = new P76MinimumWindowSubstring();
        // Example 1: expected "BANC"
        // System.out.println(sol.minWindow("ADOBECODEBANC", "ABC"));
        // Example 2: expected ""
        // System.out.println(sol.minWindow("a", "aa"));
        System.out.println("P76MinimumWindowSubstring — uncomment examples above to test.");
    }
}
