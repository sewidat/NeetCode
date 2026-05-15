package org.example.backtracking;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ============================================================
 * LeetCode #40 - Combination Sum II
 * Difficulty: Medium
 * Category: Backtracking
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given a collection of candidate numbers (candidates, may contain
 * duplicates) and a target number target, find all unique combinations
 * in candidates where the candidate numbers sum to target. Each
 * number in candidates may only be used once in the combination.
 * The solution set must not contain duplicate combinations.
 *
 * CONSTRAINTS
 * -----------
 * 1 <= candidates.length <= 100
 * 1 <= candidates[i] <= 50
 * 1 <= target <= 30
 *
 * EXAMPLES
 * --------
 * Input:  candidates = [10,1,2,7,6,1,5], target = 8
 * Output: [[1,1,6],[1,2,5],[1,7],[2,6]]
 *
 * Input:  candidates = [2,5,2,1,2], target = 5
 * Output: [[1,2,2],[5]]
 *
 * INTUITION & APPROACH
 * --------------------
 * Sort candidates first. Backtrack with a start index. At each
 * level of recursion, iterate from start to end. To skip duplicate
 * combinations, if a candidate is the same as the previous one at
 * the same recursion depth (i > start and candidates[i] == candidates[i-1]),
 * skip it. This eliminates duplicate branches at the same tree level
 * without skipping children (which would eliminate valid deeper picks).
 * Unlike CombinationSum, advance start to i+1 (each element used once).
 *
 * KEY CONCEPTS
 * ------------
 * - Sort to group duplicates together
 * - Skip duplicate siblings: if i > start && candidates[i] == candidates[i-1], continue
 * - Each element used at most once: recurse with start = i + 1
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(2^n) in the worst case
 * Space: O(n) recursion stack
 * ============================================================
 */
public class P40CombinationSumII {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        // TODO: implement
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        P40CombinationSumII sol = new P40CombinationSumII();
        // System.out.println(sol.combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8));
        // expected [[1,1,6],[1,2,5],[1,7],[2,6]]
        System.out.println("P40CombinationSumII — uncomment examples above to test.");
    }
}
