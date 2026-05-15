package org.example.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * ============================================================
 * LeetCode #84 - Largest Rectangle in Histogram
 * Difficulty: Hard
 * Category: Stack
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given array of integers representing histogram bar heights (each bar
 * has width 1), find the area of the largest rectangle in the histogram.
 *
 * CONSTRAINTS
 * -----------
 * 1 <= heights.length <= 10^5
 * 0 <= heights[i] <= 10^4
 *
 * EXAMPLES
 * --------
 * [2,1,5,6,2,3] → 10
 * [2,4]         → 4
 *
 * INTUITION & APPROACH
 * --------------------
 * Monotonic increasing stack stores indices. For each bar: while stack
 * not empty and current height < height at stack top index, pop and
 * compute area using the popped height and the width determined by
 * the current index and the new stack top index. Push current index.
 * After iterating, process remaining bars in the stack similarly.
 *
 * KEY CONCEPTS
 * ------------
 * Monotonic increasing stack, width computed from stack positions
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n)
 * Space: O(n)
 * ============================================================
 */
public class P84LargestRectangleInHistogram {

    public int largestRectangleArea(int[] heights) {
        // TODO: implement
        return 0;
    }

    public static void main(String[] args) {
        P84LargestRectangleInHistogram sol = new P84LargestRectangleInHistogram();
        System.out.println(sol.largestRectangleArea(new int[]{2, 1, 5, 6, 2, 3})); // expected 10
    }
}
