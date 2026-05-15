package org.example.arrays;

/**
 * ============================================================
 * LeetCode #242 - Valid Anagram
 * Difficulty: Easy
 * Category: Arrays & Hashing
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given two strings s and t, return true if t is an anagram of s, and
 * false otherwise. An anagram is a word formed by rearranging the letters
 * of another word using all original letters exactly once.
 *
 * CONSTRAINTS
 * -----------
 * - 1 <= s.length, t.length <= 5 * 10^4
 * - s and t consist of lowercase English letters only
 *
 * EXAMPLES
 * --------
 * Input: s = "anagram", t = "nagaram"  → Output: true
 * Input: s = "rat",     t = "car"      → Output: false
 *
 * INTUITION & APPROACH
 * --------------------
 * Sorting approach: sort both strings and compare — O(n log n) time, simple but not optimal.
 * Optimal approach: since the alphabet is fixed (26 lowercase letters), use an int[26]
 * frequency array. Increment counts for each character in s, decrement for each character
 * in t. If all counts are zero at the end, t is an anagram of s. First check lengths — if
 * they differ, it cannot be an anagram.
 *
 * KEY CONCEPTS
 * ------------
 * - Frequency counting array of size 26 (fixed alphabet → O(1) space)
 * - Character-to-index mapping: ch - 'a'
 * - Early length check to short-circuit
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n) — two passes of length n through each string
 * Space: O(1) — fixed-size int[26] regardless of input length
 * ============================================================
 */
public class P242ValidAnagram {

    public boolean isAnagram(String s, String t) {
        // TODO: implement
        return false;
    }

    public static void main(String[] args) {
        P242ValidAnagram sol = new P242ValidAnagram();
        // Example 1: expected true
        // System.out.println(sol.isAnagram("anagram", "nagaram"));
        // Example 2: expected false
        // System.out.println(sol.isAnagram("rat", "car"));
        System.out.println("P242ValidAnagram — uncomment examples above to test.");
    }
}
