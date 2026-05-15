package org.example.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ============================================================
 * LeetCode #49 - Group Anagrams
 * Difficulty: Medium
 * Category: Arrays & Hashing
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given an array of strings strs, group the anagrams together and return
 * the groups in any order. Two strings are anagrams if one is a rearrangement
 * of the other using exactly the same characters.
 *
 * CONSTRAINTS
 * -----------
 * - 1 <= strs.length <= 10^4
 * - 0 <= strs[i].length <= 100
 * - strs[i] consists of lowercase English letters
 *
 * EXAMPLES
 * --------
 * Input: ["eat","tea","tan","ate","nat","bat"]
 *   → Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 * Input: [""]  → Output: [[""]]
 *
 * INTUITION & APPROACH
 * -----------------------------------------------
 * The key insight is that all anagrams share the same canonical form. Two
 * approaches to generate the key: (1) Sort each word — anagrams sort to the
 * same string, O(k log k) per word. (2) Build a character-count array of
 * length 26 and convert to a string key, O(k) per word. In both cases, use
 * a HashMap<String, List<String>> to group words by their canonical key.
 * After processing all words, return the HashMap values as the result.
 *
 * KEY CONCEPTS
 * ------------
 * - HashMap with canonical key (sorted string or char-count string)
 * - Sorted string as anagram fingerprint: Arrays.sort on char[]
 * - Character-count array as an O(k) alternative key strategy
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n * k log k) with sort key, or O(n * k) with count key
 * Space: O(n * k) — storing all strings in the HashMap
 * ============================================================
 */
public class P49GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        // TODO: implement
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        P49GroupAnagrams sol = new P49GroupAnagrams();
        // Example 1: expected groups containing [bat], [nat,tan], [ate,eat,tea]
        // System.out.println(sol.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
        // Example 2: expected [[""]]
        // System.out.println(sol.groupAnagrams(new String[]{""}));
        System.out.println("P49GroupAnagrams — uncomment examples above to test.");
    }
}
