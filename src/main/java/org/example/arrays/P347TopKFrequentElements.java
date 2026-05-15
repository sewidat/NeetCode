package org.example.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * ============================================================
 * LeetCode #347 - Top K Frequent Elements
 * Difficulty: Medium
 * Category: Arrays & Hashing
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given an integer array nums and an integer k, return the k most frequent
 * elements. You may return the answer in any order. It is guaranteed that
 * the answer is unique.
 *
 * CONSTRAINTS
 * -----------
 * - 1 <= nums.length <= 10^5
 * - -10^4 <= nums[i] <= 10^4
 * - k is in the range [1, number of unique elements in nums]
 * - The answer is guaranteed to be unique
 *
 * EXAMPLES
 * --------
 * Input: nums = [1,1,1,2,2,3], k = 2  → Output: [1,2]
 * Input: nums = [1],           k = 1  → Output: [1]
 *
 * INTUITION & APPROACH
 * --------------------
 * First, count frequencies using a HashMap in O(n). Then select the top-k
 * elements: a max-heap approach gives O(n log k) time. The optimal O(n)
 * approach uses bucket sort — create an array of lists indexed by frequency
 * (index i holds all numbers that appear exactly i times). The max frequency
 * is at most n, so the bucket array has size n+1. Iterate from high to low
 * frequency collecting elements until k are gathered.
 *
 * KEY CONCEPTS
 * ------------
 * - HashMap for frequency counting
 * - Bucket sort where bucket index = frequency (avoids comparison-based sort)
 * - Min-heap of size k as an alternative O(n log k) approach
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n) — with bucket sort (HashMap build + bucket fill + result collect)
 * Space: O(n) — HashMap and bucket array both proportional to input size
 * ============================================================
 */
public class P347TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {
        // TODO: implement
        return new int[]{};
    }

    public static void main(String[] args) {
        P347TopKFrequentElements sol = new P347TopKFrequentElements();
        // Example 1: expected [1, 2]
        // System.out.println(Arrays.toString(sol.topKFrequent(new int[]{1,1,1,2,2,3}, 2)));
        // Example 2: expected [1]
        // System.out.println(Arrays.toString(sol.topKFrequent(new int[]{1}, 1)));
        System.out.println("P347TopKFrequentElements — uncomment examples above to test.");
    }
}
