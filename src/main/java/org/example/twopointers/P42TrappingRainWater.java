package org.example.twopointers;

/**
 * ============================================================
 * LeetCode #42 - Trapping Rain Water
 * Difficulty: Hard
 * Category: Two Pointers
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given n non-negative integers representing an elevation map where each bar has
 * width 1, compute how much water it can trap after raining. Water accumulates
 * above each bar up to the minimum of the tallest bar to its left and right.
 *
 * CONSTRAINTS
 * -----------
 * - n == height.length
 * - 1 <= n <= 2 * 10^4
 * - 0 <= height[i] <= 10^5
 *
 * EXAMPLES
 * --------
 * Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]  → Output: 6
 * Input: height = [4,2,0,3,2,5]               → Output: 9
 *
 * INTUITION & APPROACH
 * --------------------
 * Water at index i = max(0, min(maxLeft[i], maxRight[i]) - height[i]). A naive
 * approach precomputes prefix and suffix max arrays — O(n) time but O(n) space.
 * Optimal two-pointer approach: maintain maxLeft and maxRight running values and
 * two pointers l and r. Process the side with the smaller max — that side's water
 * level is determined solely by its own max (not the other side), making the
 * calculation safe. This avoids the auxiliary arrays entirely.
 *
 * KEY CONCEPTS
 * ------------
 * - Water at i = min(maxLeft, maxRight) - height[i]
 * - Two pointers with running max: process the smaller-max side first
 * - Prefix/suffix max arrays: simpler O(n) space alternative to understand first
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n) — single pass with two pointers converging
 * Space: O(1) — only pointer and running max variables (no auxiliary arrays)
 * ============================================================
 */
public class P42TrappingRainWater {

    public int trap(int[] height) {
        // TODO: implement
        return 0;
    }

    public static void main(String[] args) {
        P42TrappingRainWater sol = new P42TrappingRainWater();
        // Example 1: expected 6
        // System.out.println(sol.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
        // Example 2: expected 9
        // System.out.println(sol.trap(new int[]{4,2,0,3,2,5}));
        System.out.println("P42TrappingRainWater — uncomment examples above to test.");
    }
}
