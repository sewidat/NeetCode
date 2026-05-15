package org.example.backtracking;
import java.util.ArrayList;
import java.util.List;

/**
 * ============================================================
 * LeetCode #78 - Subsets
 * Difficulty: Medium
 * Category: Backtracking
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given an integer array nums of unique elements, return all
 * possible subsets (the power set). The solution set must not
 * contain duplicate subsets. Return the solution in any order.
 *
 * CONSTRAINTS
 * -----------
 * 1 <= nums.length <= 10
 * -10 <= nums[i] <= 10
 * All elements of nums are unique.
 *
 * EXAMPLES
 * --------
 * Input:  nums = [1,2,3]
 * Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
 *
 * Input:  nums = [0]
 * Output: [[],[0]]
 *
 * INTUITION & APPROACH
 * --------------------
 * Backtracking (include/exclude):
 * At each index we have two choices — include the element or skip
 * it. Perform a DFS from index 0. At each node of the recursion
 * tree, add the current subset to the result list (every prefix
 * is a valid subset). Then recurse forward from the next index.
 *
 * Alternative — bitmask enumeration:
 * For each integer mask from 0 to 2^n - 1, collect elements where
 * the corresponding bit is set. This avoids explicit recursion.
 *
 * KEY CONCEPTS
 * ------------
 * - Backtracking with start index to avoid revisiting earlier elements
 * - Add current path to result at every node (not just leaves)
 * - Alternatively iterate all 2^n bitmasks
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n * 2^n)
 * Space: O(n * 2^n) for output; O(n) recursion stack
 * ============================================================
 */
public class P78Subsets {

    public List<List<Integer>> subsets(int[] nums) {
        // TODO: implement
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        P78Subsets sol = new P78Subsets();
        // System.out.println(sol.subsets(new int[]{1, 2, 3}));
        // expected [[], [1], [1,2], [1,2,3], [1,3], [2], [2,3], [3]] (any order)
        System.out.println("P78Subsets — uncomment examples above to test.");
    }
}
