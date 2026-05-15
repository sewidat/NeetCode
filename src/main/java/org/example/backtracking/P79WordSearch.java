package org.example.backtracking;

/**
 * ============================================================
 * LeetCode #79 - Word Search
 * Difficulty: Medium
 * Category: Backtracking
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given an m x n grid of characters board and a string word,
 * return true if word exists in the grid. The word can be
 * constructed from letters of sequentially adjacent cells, where
 * adjacent cells are horizontally or vertically neighboring.
 * The same letter cell may not be used more than once.
 *
 * CONSTRAINTS
 * -----------
 * 1 <= m, n <= 6
 * 1 <= word.length <= 15
 * board and word consist of only lowercase and uppercase English letters.
 *
 * EXAMPLES
 * --------
 * Input:  board = [["A","B","C","E"],
 *                  ["S","F","C","S"],
 *                  ["A","D","E","E"]], word = "ABCCED"
 * Output: true
 *
 * Input:  board = [["A","B","C","E"],
 *                  ["S","F","C","S"],
 *                  ["A","D","E","E"]], word = "SEE"
 * Output: true
 *
 * Input:  board = [["A","B","C","E"],
 *                  ["S","F","C","S"],
 *                  ["A","D","E","E"]], word = "ABCB"
 * Output: false
 *
 * INTUITION & APPROACH
 * --------------------
 * Try starting a DFS from every cell that matches word.charAt(0).
 * In the DFS helper, check bounds, whether the current character
 * matches the expected word character, and whether the cell has
 * already been visited on the current path. Mark the cell as
 * visited by temporarily replacing its character (e.g., with '#'),
 * recurse in all four directions for the next character index,
 * then restore the cell (backtrack). If the character index
 * reaches word.length(), the entire word has been matched.
 *
 * KEY CONCEPTS
 * ------------
 * - DFS backtracking from each starting cell
 * - In-place visited marking: board[r][c] = '#', restore after recursion
 * - Four-directional exploration: up, down, left, right
 * - Early exit as soon as the word is found
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(m * n * 4^L) where L = word.length()
 * Space: O(L) recursion stack depth
 * ============================================================
 */
public class P79WordSearch {

    public boolean exist(char[][] board, String word) {
        // TODO: implement
        return false;
    }

    public static void main(String[] args) {
        P79WordSearch sol = new P79WordSearch();
        // char[][] board = {
        //     {'A','B','C','E'},
        //     {'S','F','C','S'},
        //     {'A','D','E','E'}
        // };
        // System.out.println(sol.exist(board, "ABCCED")); // expected true
        // System.out.println(sol.exist(board, "SEE"));    // expected true
        // System.out.println(sol.exist(board, "ABCB"));   // expected false
        System.out.println("P79WordSearch — uncomment examples above to test.");
    }
}
