package org.example.greedy;

/**
 * ============================================================
 * LeetCode #134 - Gas Station
 * Difficulty: Medium
 * Category: Greedy
 * ============================================================
 *
 * PROBLEM
 * -------
 * There are n gas stations along a circular route. gas[i] is the amount
 * of gas available at station i, and cost[i] is the amount of gas needed
 * to travel from station i to station i+1.
 * Starting with an empty tank at one of the stations, find the index of
 * the starting station if you can travel the full circuit, or return -1
 * if it is impossible. The solution is guaranteed to be unique if it exists.
 *
 * CONSTRAINTS
 * -----------
 * - n == gas.length == cost.length
 * - 1 <= n <= 10^5
 * - 0 <= gas[i], cost[i] <= 10^4
 *
 * EXAMPLES
 * --------
 * Input: gas=[1,2,3,4,5], cost=[3,4,5,1,2]  Output: 3
 * Input: gas=[2,3,4],     cost=[3,4,3]       Output: -1
 *
 * INTUITION & APPROACH
 * --------------------
 * Two observations:
 *   1. If total gas >= total cost, a valid starting station must exist.
 *   2. Greedy restart: accumulate surplus (gas[i] - cost[i]) starting from
 *      a candidate station. If the running surplus drops below 0, the current
 *      candidate (and every station up to i) cannot be the start — reset
 *      the candidate to i+1 and reset surplus to 0.
 * If the total sum >= 0, the last candidate set is the answer.
 *
 * KEY CONCEPTS
 * ------------
 * - Greedy restart: when tank goes negative, try next station as start
 * - Total sum >= 0 guarantees a solution exists
 * - Single pass simultaneously checks feasibility and finds start
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n)
 * Space: O(1)
 * ============================================================
 */
public class P134GasStation {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        // TODO: implement
        return -1;
    }

    public static void main(String[] args) {
        // P134GasStation sol = new P134GasStation();
        // System.out.println(sol.canCompleteCircuit(new int[]{1,2,3,4,5}, new int[]{3,4,5,1,2})); // 3
        // System.out.println(sol.canCompleteCircuit(new int[]{2,3,4},     new int[]{3,4,3}));      // -1
        System.out.println("P134GasStation — uncomment examples above to test.");
    }
}
