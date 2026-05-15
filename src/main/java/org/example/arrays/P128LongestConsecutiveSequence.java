package org.example.arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * ============================================================
 * LeetCode #128 - Longest Consecutive Sequence
 * Difficulty: Medium
 * Category: Arrays & Hashing
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given an unsorted array of integers nums, return the length of the longest
 * consecutive elements sequence. The algorithm must run in O(n) time.
 *
 * CONSTRAINTS
 * -----------
 * - 0 <= nums.length <= 10^5
 * - -10^9 <= nums[i] <= 10^9
 *
 * EXAMPLES
 * --------
 * Input: nums = [100,4,200,1,3,2]        → Output: 4  (sequence: 1,2,3,4)
 * Input: nums = [0,3,7,2,5,8,4,6,0,1]   → Output: 9  (sequence: 0-8)
 *
 * INTUITION & APPROACH
 * --------------------
 * Sorting works in O(n log n) but the problem demands O(n). Add all numbers
 * to a HashSet for O(1) lookups. Then iterate through nums: for each number,
 * only begin counting a sequence if (num - 1) is NOT in the set — this means
 * the number is the start of a new sequence. Count forward (num+1, num+2, ...)
 * while the next value exists in the set. Track the maximum length seen.
 * Each element is visited at most twice (once as a start check, once in a count),
 * giving O(n) amortized time.
 *
 * KEY CONCEPTS
 * ------------
 * - HashSet for O(1) membership testing
 * - Only count from sequence starts (num-1 not in set) to avoid re-counting
 * - Amortized O(n): each element participates in at most one sequence count
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n) — HashSet build O(n) + amortized O(n) traversal
 * Space: O(n) — HashSet stores all distinct elements
 * ============================================================
 */
public class P128LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {
        // TODO: implement
        return 0;
    }

    public static void main(String[] args) {
        P128LongestConsecutiveSequence sol = new P128LongestConsecutiveSequence();
        // Example 1: expected 4
        // System.out.println(sol.longestConsecutive(new int[]{100,4,200,1,3,2}));
        // Example 2: expected 9
        // System.out.println(sol.longestConsecutive(new int[]{0,3,7,2,5,8,4,6,0,1}));
        System.out.println("P128LongestConsecutiveSequence — uncomment examples above to test.");
    }
}
