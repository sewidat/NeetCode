package org.example.backtracking;
import java.util.ArrayList;
import java.util.List;

/**
 * ============================================================
 * LeetCode #39 - Combination Sum
 * Difficulty: Medium
 * Category: Backtracking
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given an array of distinct integers candidates and a target
 * integer target, return all unique combinations of candidates
 * where the chosen numbers sum to target. You may return the
 * combinations in any order. The same number may be chosen from
 * candidates an unlimited number of times. Two combinations are
 * unique if the frequency of at least one chosen number is different.
 *
 * CONSTRAINTS
 * -----------
 * 1 <= candidates.length <= 30
 * 2 <= candidates[i] <= 40
 * All elements of candidates are distinct.
 * 1 <= target <= 40
 *
 * EXAMPLES
 * --------
 * Input:  candidates = [2,3,6,7], target = 7
 * Output: [[2,2,3],[7]]
 *
 * Input:  candidates = [2,3], target = 6
 * Output: [[2,2,2],[3,3]]
 *
 * INTUITION & APPROACH
 * --------------------
 * Backtracking with a start index to avoid generating duplicate
 * combinations. At each recursive call, iterate from start to the
 * end of the candidates array. For each candidate, subtract it
 * from the remaining target and recurse from the same index
 * (allowing reuse of the same element). If remaining == 0, add
 * the current combination to results. If remaining < 0, prune
 * (backtrack). Undo the choice before trying the next candidate.
 *
 * KEY CONCEPTS
 * ------------
 * - Backtracking with start index to enforce non-decreasing order
 * - Same element allowed: recurse with the same index (not start+1)
 * - Prune when remaining target goes negative
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n^(t/m)) where t = target, m = minimum candidate value
 * Space: O(t/m) recursion stack depth
 * ============================================================
 */
public class P39CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        // TODO: implement
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        P39CombinationSum sol = new P39CombinationSum();
        // System.out.println(sol.combinationSum(new int[]{2, 3, 6, 7}, 7));
        // expected [[2,2,3],[7]]
        System.out.println("P39CombinationSum — uncomment examples above to test.");
    }
}
