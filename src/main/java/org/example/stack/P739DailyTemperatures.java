package org.example.stack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * ============================================================
 * LeetCode #739 - Daily Temperatures
 * Difficulty: Medium
 * Category: Stack
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given array of daily temperatures, return array where answer[i] is
 * the number of days to wait for a warmer temperature. If no warmer
 * day exists, answer[i] = 0.
 *
 * CONSTRAINTS
 * -----------
 * 1 <= temperatures.length <= 10^5
 * 30 <= temperatures[i] <= 100
 *
 * EXAMPLES
 * --------
 * [73,74,75,71,69,72,76,73] → [1,1,4,2,1,1,0,0]
 *
 * INTUITION & APPROACH
 * --------------------
 * Monotonic decreasing stack stores indices of unresolved days. For
 * each day, while stack not empty and current temp > temp at stack top
 * index: pop, compute days difference, record answer. Push current
 * index. Remaining indices on stack have no warmer future day (answer=0).
 *
 * KEY CONCEPTS
 * ------------
 * Monotonic decreasing stack, "next greater element" pattern
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n)
 * Space: O(n)
 * ============================================================
 */
public class P739DailyTemperatures {

    public int[] dailyTemperatures(int[] temperatures) {
        // TODO: implement
        return new int[0];
    }

    public static void main(String[] args) {
        P739DailyTemperatures sol = new P739DailyTemperatures();
        System.out.println(Arrays.toString(
            sol.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73})
        )); // expected [1, 1, 4, 2, 1, 1, 0, 0]
    }
}
