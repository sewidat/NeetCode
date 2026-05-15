package org.example.intervals;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * ============================================================
 * LeetCode #1851 - Minimum Interval to Include Each Query
 * Difficulty: Hard
 * Category: Intervals
 * ============================================================
 *
 * PROBLEM
 * -------
 * You are given a 2D integer array intervals where intervals[i] = [l_i, r_i]
 * represents the interval [l_i, r_i] (inclusive), and an integer array queries.
 * The size of an interval is defined as r - l + 1.
 * For each query q, find the size of the smallest interval [l, r] such that
 * l <= q <= r. If no such interval exists, the answer for that query is -1.
 * Return an integer array containing the answers to the queries.
 *
 * CONSTRAINTS
 * -----------
 * - 1 <= intervals.length <= 10^5
 * - intervals[i].length == 2
 * - 1 <= l_i <= r_i <= 10^7
 * - 1 <= queries.length <= 10^5
 * - 1 <= queries[j] <= 10^7
 *
 * EXAMPLES
 * --------
 * Input: intervals=[[1,4],[2,4],[3,6],[4,4]], queries=[2,3,4,5]
 * Output: [3, 3, 1, 4]
 *
 * INTUITION & APPROACH
 * --------------------
 * Offline sweep-line approach:
 *   1. Sort intervals by start. Sort queries (keeping original indices) by value.
 *   2. Use a min-heap ordered by interval size (r - l + 1) to track active intervals.
 *   3. For each query (in sorted order):
 *        a. Add all intervals whose start <= query value to the heap.
 *        b. Remove from heap top any intervals whose end < query value (expired).
 *        c. The heap top (if non-empty) gives the smallest active interval
 *           containing this query — record its size at the original query index.
 *   4. Return the answers array.
 *
 * KEY CONCEPTS
 * ------------
 * - Offline processing: sort both queries and intervals
 * - Min-heap of (size, end) for active intervals ordered by size
 * - Lazy deletion: remove expired intervals (end < query) from heap top
 * - Sweep line: pointer advances through sorted intervals as queries grow
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O((n + q) log n)
 * Space: O(n + q)
 * ============================================================
 */
public class P1851MinimumIntervalToIncludeEachQuery {

    public int[] minInterval(int[][] intervals, int[] queries) {
        // TODO: implement
        return new int[0];
    }

    public static void main(String[] args) {
        // P1851MinimumIntervalToIncludeEachQuery sol = new P1851MinimumIntervalToIncludeEachQuery();
        // int[] result = sol.minInterval(
        //     new int[][]{{1,4},{2,4},{3,6},{4,4}},
        //     new int[]{2,3,4,5}
        // );
        // System.out.println(Arrays.toString(result)); // [3, 3, 1, 4]
        System.out.println("P1851MinimumIntervalToIncludeEachQuery — uncomment examples above to test.");
    }
}
