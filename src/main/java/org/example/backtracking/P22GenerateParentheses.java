package org.example.backtracking;
import java.util.ArrayList;
import java.util.List;

/**
 * ============================================================
 * LeetCode #22 - Generate Parentheses
 * Difficulty: Medium
 * Category: Backtracking
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given n pairs of parentheses, write a function to generate all
 * combinations of well-formed parentheses.
 *
 * CONSTRAINTS
 * -----------
 * 1 <= n <= 8
 *
 * EXAMPLES
 * --------
 * Input:  n = 3
 * Output: ["((()))","(()())","(())()","()(())","()()()"]
 *
 * Input:  n = 1
 * Output: ["()"]
 *
 * INTUITION & APPROACH
 * --------------------
 * Backtracking with two counters: open (number of '(' added so far)
 * and close (number of ')' added so far).
 * - Add '(' if open < n  (there are still unpaired opens available).
 * - Add ')' if close < open  (we can only close what has been opened).
 * - Base case: when the string length equals 2*n it is complete and
 *   well-formed by construction; add to results.
 *
 * This naturally generates only valid strings without needing any
 * post-validation step. The constraints open <= n and close <= open
 * are sufficient to guarantee well-formedness.
 *
 * KEY CONCEPTS
 * ------------
 * - Backtracking with open/close counters
 * - Constraint: open <= n, close <= open (ensures validity)
 * - Number of results = Catalan(n)
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(4^n / sqrt(n)) — the nth Catalan number
 * Space: O(n) recursion stack depth
 * ============================================================
 */
public class P22GenerateParentheses {

    public List<String> generateParenthesis(int n) {
        // TODO: implement
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        P22GenerateParentheses sol = new P22GenerateParentheses();
        // System.out.println(sol.generateParenthesis(3));
        // expected ["((()))","(()())","(())()","()(())","()()()"]
        System.out.println("P22GenerateParentheses — uncomment examples above to test.");
    }
}
