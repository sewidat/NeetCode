package org.example.arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * ============================================================
 * LeetCode #217 - Contains Duplicate
 * Difficulty: Easy
 * Category: Arrays & Hashing
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given an integer array nums, return true if any value appears at least
 * twice in the array, and return false if every element is distinct.
 *
 * CONSTRAINTS
 * -----------
 * - 1 <= nums.length <= 10^5
 * - -10^9 <= nums[i] <= 10^9
 *
 * EXAMPLES
 * --------
 * Input: nums = [1,2,3,1]  → Output: true
 * Input: nums = [1,2,3,4]  → Output: false
 *
 * INTUITION & APPROACH
 * --------------------
 * Brute force: O(n²) nested loops checking every pair — too slow.
 * Optimal: Use a HashSet for O(1) average-case lookup. Iterate through
 * the array; for each element, check if it already exists in the set.
 * If it does, we found a duplicate — return true. Otherwise, add it to
 * the set and continue. If we exhaust the array with no duplicate, return false.
 *
 * KEY CONCEPTS
 * ------------
 * - HashSet for O(1) average contains/add operations
 * - Early-exit pattern: return as soon as duplicate is found
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n) — single pass through the array
 * Space: O(n) — HashSet stores up to n elements
 * ============================================================
 */
public class P217ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        // TODO: implement
        return false;
    }

    public static void main(String[] args) {
        P217ContainsDuplicate sol = new P217ContainsDuplicate();
        // Example 1: expected true
        // System.out.println(sol.containsDuplicate(new int[]{1,2,3,1}));
        // Example 2: expected false
        // System.out.println(sol.containsDuplicate(new int[]{1,2,3,4}));
        System.out.println("P217ContainsDuplicate — uncomment examples above to test.");
    }
}
