package org.example.backtracking;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * ============================================================
 * LeetCode #51 - N-Queens
 * Difficulty: Hard
 * Category: Backtracking
 * ============================================================
 *
 * PROBLEM
 * -------
 * The n-queens puzzle is the problem of placing n queens on an
 * n x n chessboard such that no two queens attack each other.
 * Given an integer n, return all distinct solutions to the
 * n-queens puzzle. Each solution contains a distinct board
 * configuration where 'Q' indicates a queen and '.' indicates
 * an empty cell.
 *
 * CONSTRAINTS
 * -----------
 * 1 <= n <= 9
 *
 * EXAMPLES
 * --------
 * Input:  n = 4
 * Output: [[".Q..","...Q","Q...","..Q."],
 *           ["..Q.","Q...","...Q",".Q.."]]
 *
 * Input:  n = 1
 * Output: [["Q"]]
 *
 * INTUITION & APPROACH
 * --------------------
 * Backtrack row by row. For each row, try placing a queen in
 * every column. A placement is valid if no other queen occupies:
 *   - The same column (track with a Set<Integer> cols)
 *   - The same diagonal (track with a Set<Integer> diag, where
 *     diag value = row - col, constant along top-left to bottom-right)
 *   - The same anti-diagonal (track with a Set<Integer> antiDiag,
 *     where anti-diag value = row + col, constant along top-right
 *     to bottom-left)
 *
 * Using three HashSets allows O(1) conflict checks. When all n rows
 * have been filled, convert the current board configuration to a
 * List<String> and add to results. Backtrack by removing the queen
 * and clearing the three set entries.
 *
 * KEY CONCEPTS
 * ------------
 * - Backtracking row by row (one queen per row by design)
 * - Three HashSets for column, diagonal (row-col), anti-diagonal (row+col)
 * - Convert char[][] board snapshot to List<String> for each solution
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n!)
 * Space: O(n^2) for the board; O(n) recursion stack
 * ============================================================
 */
public class P51NQueens {

    public List<List<String>> solveNQueens(int n) {
        // TODO: implement
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        P51NQueens sol = new P51NQueens();
        // List<List<String>> solutions = sol.solveNQueens(4);
        // System.out.println(solutions.size()); // expected 2
        // solutions.forEach(System.out::println);
        System.out.println("P51NQueens — uncomment examples above to test.");
    }
}
