package org.example.slidingwindow;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * ============================================================
 * LeetCode #239 - Sliding Window Maximum
 * Difficulty: Hard
 * Category: Sliding Window
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given an integer array nums and a sliding window of size k that moves from left
 * to right, return an array of the maximum value in each window position. There are
 * n - k + 1 windows total.
 *
 * CONSTRAINTS
 * -----------
 * - 1 <= nums.length <= 10^5
 * - -10^4 <= nums[i] <= 10^4
 * - 1 <= k <= nums.length
 *
 * EXAMPLES
 * --------
 * Input: nums = [1,3,-1,-3,5,3,6,7], k = 3  → Output: [3,3,5,5,6,7]
 * Input: nums = [1],                  k = 1  → Output: [1]
 *
 * INTUITION & APPROACH
 * --------------------
 * Brute force: O(nk) by scanning each window. Optimal: use a monotonic decreasing
 * deque of indices. For each new element at index i: (1) remove from the front any
 * index that is out of the current window (index <= i - k). (2) Remove from the back
 * any indices whose corresponding values are less than or equal to nums[i] — those
 * elements can never be the window maximum while nums[i] is in the window. (3) Add i
 * to the back. The front of the deque always holds the index of the current window
 * maximum. Record it once the first full window is formed (i >= k - 1).
 *
 * KEY CONCEPTS
 * ------------
 * - Monotonic decreasing deque stores indices (not values) for range checks
 * - Remove stale indices from front (out of window); remove smaller values from back
 * - Deque front = current window maximum at every step
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n) — each index is added and removed from the deque at most once
 * Space: O(k) — deque holds at most k indices at any time
 * ============================================================
 */
public class P239SlidingWindowMaximum {

    public int[] maxSlidingWindow(int[] nums, int k) {
        // TODO: implement
        return new int[]{};
    }

    public static void main(String[] args) {
        P239SlidingWindowMaximum sol = new P239SlidingWindowMaximum();
        // Example 1: expected [3, 3, 5, 5, 6, 7]
        // System.out.println(Arrays.toString(sol.maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7}, 3)));
        // Example 2: expected [1]
        // System.out.println(Arrays.toString(sol.maxSlidingWindow(new int[]{1}, 1)));
        System.out.println("P239SlidingWindowMaximum — uncomment examples above to test.");
    }
}
