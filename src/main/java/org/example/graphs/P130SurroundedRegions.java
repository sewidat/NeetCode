package org.example.graphs;

/**
 * ============================================================
 * LeetCode #130 - Surrounded Regions
 * Difficulty: Medium
 * Category: Graphs
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given an m×n matrix board containing 'X' and 'O', capture all regions
 * that are 4-directionally surrounded by 'X'. A region is captured by
 * flipping all 'O's in that region to 'X'.
 *
 * A region is NOT captured if any 'O' in it is on the border of the board
 * or connected to a border 'O'.
 *
 * CONSTRAINTS
 * -----------
 * - 1 <= m, n <= 200
 * - board[i][j] is 'X' or 'O'
 *
 * EXAMPLES
 * --------
 * Example 1:
 *   Input:  [["X","X","X","X"],
 *             ["X","O","O","X"],
 *             ["X","X","O","X"],
 *             ["X","O","X","X"]]
 *   Output: [["X","X","X","X"],
 *             ["X","X","X","X"],
 *             ["X","X","X","X"],
 *             ["X","O","X","X"]]
 *
 * Example 2:
 *   Input:  [["X"]] → [["X"]]
 *
 * INTUITION & APPROACH
 * --------------------
 * Instead of finding enclosed regions directly (hard), find the safe ones
 * (easy) and flip everything else.
 *
 * Step 1: From every 'O' on the border, run DFS/BFS and mark all connected
 *         'O's as safe by changing them to a temporary marker 'T'.
 * Step 2: Scan the entire board:
 *           'O' → 'X'  (not connected to border, so it was enclosed)
 *           'T' → 'O'  (restore safe cells)
 *           'X' → 'X'  (unchanged)
 *
 * KEY CONCEPTS
 * ------------
 * - Border-connected DFS to identify non-capturable regions
 * - Temporary marker ('T') to distinguish safe 'O's during traversal
 * - Two-pass approach: mark safe, then flip remaining
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(m * n)
 * Space: O(m * n) — recursion stack
 * ============================================================
 */
public class P130SurroundedRegions {

    public void solve(char[][] board) {
        // TODO: implement
    }

    private void dfs(char[][] board, int r, int c) {
        // TODO: implement
    }

    public static void main(String[] args) {
        P130SurroundedRegions sol = new P130SurroundedRegions();

        char[][] board = {
            {'X','X','X','X'},
            {'X','O','O','X'},
            {'X','X','O','X'},
            {'X','O','X','X'}
        };
        sol.solve(board);
        System.out.println("Example 1 (expect X,X,X,X / X,X,X,X / X,X,X,X / X,O,X,X):");
        for (char[] row : board) System.out.println(new String(row));
    }
}
