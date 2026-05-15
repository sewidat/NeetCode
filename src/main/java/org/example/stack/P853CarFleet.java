package org.example.stack;

import java.util.Arrays;

/**
 * ============================================================
 * LeetCode #853 - Car Fleet
 * Difficulty: Medium
 * Category: Stack
 * ============================================================
 *
 * PROBLEM
 * -------
 * n cars head to the same destination. Each has a position and speed.
 * A fleet is a group of cars driving at the same speed. Cars behind
 * catch up and join a fleet if they arrive at or before the car ahead.
 * Return the number of car fleets that will arrive at the destination.
 *
 * CONSTRAINTS
 * -----------
 * n == position.length == speed.length
 * 1 <= n <= 10^5
 * 0 < target <= 10^6
 * 0 <= position[i] < target; all positions distinct
 * 0 < speed[i] <= 10^6
 *
 * EXAMPLES
 * --------
 * target=12, position=[10,8,0,5,3], speed=[2,4,1,1,3] → 3
 *
 * INTUITION & APPROACH
 * --------------------
 * Sort cars by position descending (closest to target first). Compute
 * time for each car to reach target = (target - pos) / speed. Iterate:
 * if current car's time > previous fleet's time, it cannot catch up and
 * forms a new fleet (push to stack). Otherwise it catches up and joins
 * the existing fleet ahead. Number of fleets = stack size.
 *
 * KEY CONCEPTS
 * ------------
 * Sort by position descending, monotonic stack of arrival times
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n log n)
 * Space: O(n)
 * ============================================================
 */
public class P853CarFleet {

    public int carFleet(int target, int[] position, int[] speed) {
        // TODO: implement
        return 0;
    }

    public static void main(String[] args) {
        P853CarFleet sol = new P853CarFleet();
        System.out.println(sol.carFleet(12, new int[]{10, 8, 0, 5, 3}, new int[]{2, 4, 1, 1, 3})); // expected 3
    }
}
