package org.example.backtracking;
import java.util.ArrayList;
import java.util.List;

/**
 * ============================================================
 * LeetCode #46 - Permutations
 * Difficulty: Medium
 * Category: Backtracking
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given an array nums of distinct integers, return all the possible
 * permutations. You can return the answer in any order.
 *
 * CONSTRAINTS
 * -----------
 * 1 <= nums.length <= 6
 * -10 <= nums[i] <= 10
 * All the integers of nums are unique.
 *
 * EXAMPLES
 * --------
 * Input:  nums = [1,2,3]
 * Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 *
 * Input:  nums = [0,1]
 * Output: [[0,1],[1,0]]
 *
 * Input:  nums = [1]
 * Output: [[1]]
 *
 * INTUITION & APPROACH
 * --------------------
 * Backtracking with a visited boolean array:
 * At each recursive step, iterate all indices. If nums[i] is not
 * visited, mark it visited, add it to the current permutation,
 * recurse, then unmark and remove (backtrack). When the current
 * permutation has length equal to nums.length, add a copy to results.
 *
 * Alternative — swap-based in-place:
 * Swap the element at the current position with each subsequent
 * element, recurse to fill the next position, then swap back.
 * Avoids the visited array overhead.
 *
 * KEY CONCEPTS
 * ------------
 * - Backtracking with boolean visited[] array
 * - Or in-place swap approach: swap(nums, start, i), recurse(start+1), swap back
 * - Add to result only at leaf nodes (permutation length == n)
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n * n!)
 * Space: O(n) recursion stack (excluding output)
 * ============================================================
 */
public class P46Permutations {

    public List<List<Integer>> permute(int[] nums) {
        // TODO: implement
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        P46Permutations sol = new P46Permutations();
        // System.out.println(sol.permute(new int[]{1, 2, 3}));
        // expected [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
        System.out.println("P46Permutations — uncomment examples above to test.");
    }
}
