package org.example.greedy;

/**
 * ============================================================
 * LeetCode #55 - Jump Game
 * Difficulty: Medium
 * Category: Greedy
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given an integer array where nums[i] is the maximum jump length from
 * position i, return true if you can reach the last index starting from
 * index 0, otherwise return false.
 *
 * CONSTRAINTS
 * -----------
 * - 1 <= nums.length <= 10^4
 * - 0 <= nums[i] <= 10^5
 *
 * EXAMPLES
 * --------
 * Input: nums = [2,3,1,1,4]  Output: true  (jump 1 step to index 1, then 3 steps to last)
 * Input: nums = [3,2,1,0,4]  Output: false (always reach index 3 with value 0, stuck)
 *
 * INTUITION & APPROACH
 * --------------------
 * Track the farthest index reachable so far (maxReach). For each index i:
 *   - If i > maxReach, we cannot reach index i — return false.
 *   - Otherwise, update maxReach = max(maxReach, i + nums[i]).
 *   - If maxReach >= last index at any point, return true.
 * Greedy: always extend the horizon as far as possible.
 *
 * KEY CONCEPTS
 * ------------
 * - Greedy with max reachable index
 * - If current index > maxReach, we are stuck — return false
 * - Update maxReach at each reachable position
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n)
 * Space: O(1)
 * ============================================================
 */
public class P55JumpGame {

    public boolean canJump(int[] nums) {
        // TODO: implement
        return false;
    }

    public static void main(String[] args) {
        // P55JumpGame sol = new P55JumpGame();
        // System.out.println(sol.canJump(new int[]{2,3,1,1,4})); // true
        // System.out.println(sol.canJump(new int[]{3,2,1,0,4})); // false
        System.out.println("P55JumpGame — uncomment examples above to test.");
    }
}
