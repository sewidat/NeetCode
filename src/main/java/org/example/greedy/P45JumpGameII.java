package org.example.greedy;

/**
 * ============================================================
 * LeetCode #45 - Jump Game II
 * Difficulty: Medium
 * Category: Greedy
 * ============================================================
 *
 * PROBLEM
 * -------
 * Same setup as Jump Game I. Given an integer array nums where nums[i] is
 * the maximum jump length from position i, return the minimum number of
 * jumps required to reach the last index. It is guaranteed you can always
 * reach the last index.
 *
 * CONSTRAINTS
 * -----------
 * - 1 <= nums.length <= 10^4
 * - 0 <= nums[i] <= 1000
 * - It is guaranteed that you can reach the last index
 *
 * EXAMPLES
 * --------
 * Input: nums = [2,3,1,1,4]  Output: 2  (jump to index 1, then to last)
 * Input: nums = [2,3,0,1,4]  Output: 2
 *
 * INTUITION & APPROACH
 * --------------------
 * BFS-level greedy. Think of each "jump" as a BFS level expansion.
 * Track:
 *   - currentEnd: the boundary of the current jump's reach
 *   - farthest:   the farthest index reachable from any position in the
 *                 current jump range
 * When i reaches currentEnd, we must take another jump — increment jumps
 * and set currentEnd = farthest. Stop once currentEnd >= last index.
 *
 * KEY CONCEPTS
 * ------------
 * - Implicit BFS levels (each level = one jump)
 * - currentEnd marks the boundary of the current jump
 * - Extend farthest greedily within each level
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n)
 * Space: O(1)
 * ============================================================
 */
public class P45JumpGameII {

    public int jump(int[] nums) {
        // TODO: implement
        return 0;
    }

    public static void main(String[] args) {
        // P45JumpGameII sol = new P45JumpGameII();
        // System.out.println(sol.jump(new int[]{2,3,1,1,4})); // 2
        // System.out.println(sol.jump(new int[]{2,3,0,1,4})); // 2
        System.out.println("P45JumpGameII — uncomment examples above to test.");
    }
}
