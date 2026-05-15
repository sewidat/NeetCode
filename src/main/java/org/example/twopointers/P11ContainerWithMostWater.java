package org.example.twopointers;

/**
 * ============================================================
 * LeetCode #11 - Container With Most Water
 * Difficulty: Medium
 * Category: Two Pointers
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given n non-negative integers height[i] representing vertical lines drawn at
 * position i, find two lines that together with the x-axis form a container that
 * holds the most water. Return the maximum amount of water the container can store.
 *
 * CONSTRAINTS
 * -----------
 * - n == height.length
 * - 2 <= n <= 10^5
 * - 0 <= height[i] <= 10^4
 *
 * EXAMPLES
 * --------
 * Input: height = [1,8,6,2,5,4,8,3,7]  → Output: 49
 * Input: height = [1,1]                  → Output: 1
 *
 * INTUITION & APPROACH
 * --------------------
 * Brute force: O(n²) try every pair of lines — too slow. Key insight: water held
 * between lines l and r equals min(height[l], height[r]) * (r - l). Use two pointers
 * at opposite ends. The greedy choice: always move the pointer pointing to the shorter
 * line inward. Reasoning — keeping the taller line and moving the shorter one is the
 * only chance to find a taller shorter boundary that could increase the area; moving
 * the taller line can never increase the area (width decreases and height is still
 * bounded by the shorter line).
 *
 * KEY CONCEPTS
 * ------------
 * - Two pointers converging from both ends
 * - Greedy: move the pointer with the shorter height
 * - Area formula: min(h[l], h[r]) * (r - l)
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n) — each pointer moves at most n steps before they meet
 * Space: O(1) — only pointer variables and running max
 * ============================================================
 */
public class P11ContainerWithMostWater {

    public int maxArea(int[] height) {
        // TODO: implement
        return 0;
    }

    public static void main(String[] args) {
        P11ContainerWithMostWater sol = new P11ContainerWithMostWater();
        // Example 1: expected 49
        // System.out.println(sol.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
        // Example 2: expected 1
        // System.out.println(sol.maxArea(new int[]{1,1}));
        System.out.println("P11ContainerWithMostWater — uncomment examples above to test.");
    }
}
