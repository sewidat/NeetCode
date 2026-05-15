package org.example.backtracking;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ============================================================
 * LeetCode #90 - Subsets II
 * Difficulty: Medium
 * Category: Backtracking
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given an integer array nums that may contain duplicates, return
 * all possible subsets (the power set). The solution set must not
 * contain duplicate subsets. Return the solution in any order.
 *
 * CONSTRAINTS
 * -----------
 * 1 <= nums.length <= 10
 * -10 <= nums[i] <= 10
 *
 * EXAMPLES
 * --------
 * Input:  nums = [1,2,2]
 * Output: [[],[1],[1,2],[1,2,2],[2],[2,2]]
 *
 * Input:  nums = [0]
 * Output: [[],[0]]
 *
 * INTUITION & APPROACH
 * --------------------
 * Sort the array first to group duplicates together. Use the same
 * backtracking template as Subsets (#78), but add a skip condition
 * to avoid generating duplicate subsets:
 * - When iterating at a given recursion depth (start index), if
 *   nums[i] == nums[i-1] and i > start, skip index i.
 * - This prevents choosing the same value more than once at the
 *   same tree level (sibling branches), while still allowing it
 *   deeper in the tree (child branches from a chosen duplicate).
 *
 * This is the same duplicate-skip trick used in CombinationSumII.
 *
 * KEY CONCEPTS
 * ------------
 * - Sort to bring duplicates adjacent
 * - Backtracking with start index, add path to result at every node
 * - Skip duplicates at same depth: if i > start && nums[i] == nums[i-1], continue
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n * 2^n)
 * Space: O(n) recursion stack (excluding output)
 * ============================================================
 */
public class P90SubsetsII {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        // TODO: implement
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        P90SubsetsII sol = new P90SubsetsII();
        // System.out.println(sol.subsetsWithDup(new int[]{1, 2, 2}));
        // expected [[], [1], [1,2], [1,2,2], [2], [2,2]]
        System.out.println("P90SubsetsII — uncomment examples above to test.");
    }
}
