package org.example.dp2d;

/**
 * ============================================================
 * LeetCode #62 - Unique Paths
 * Difficulty: Medium
 * Category: 2-D Dynamic Programming
 * ============================================================
 *
 * PROBLEM
 * -------
 * There is a robot on an m x n grid. The robot is initially located at
 * the top-left corner (row 0, col 0). The robot tries to move to the
 * bottom-right corner (row m-1, col n-1). The robot can only move either
 * down or right at any point in time. How many possible unique paths are there?
 *
 * CONSTRAINTS
 * -----------
 * 1 <= m, n <= 100
 *
 * EXAMPLES
 * --------
 * m = 3, n = 7 → 28
 * m = 3, n = 2 → 3
 *
 * INTUITION & APPROACH
 * --------------------
 * Define dp[i][j] = number of unique paths to reach cell (i, j).
 * The robot can arrive from the cell above (i-1, j) or from the left (i, j-1):
 *
 *   dp[i][j] = dp[i-1][j] + dp[i][j-1]
 *
 * Base cases:
 *   First row  (i = 0): dp[0][j] = 1 for all j (only one way: all right moves)
 *   First column (j = 0): dp[i][0] = 1 for all i (only one way: all down moves)
 *
 * Space optimization: Use a single 1D array of size n.
 * Iterate row by row; dp[j] += dp[j-1] within each row gives the same result
 * because dp[j] holds the value from the row above and dp[j-1] is already
 * updated for the current row (left cell).
 *
 * Alternative: combinatorics — C(m+n-2, m-1).
 *
 * KEY CONCEPTS
 * ------------
 * - Recurrence: dp[i][j] = dp[i-1][j] + dp[i][j-1]
 * - 1D space optimization: process row by row, dp[j] += dp[j-1]
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(m * n)
 * Space: O(n)
 * ============================================================
 */
public class P62UniquePaths {
    public int uniquePaths(int m, int n) {
        // TODO: implement
        return 0;
    }

    public static void main(String[] args) {
        P62UniquePaths sol = new P62UniquePaths();
        System.out.println(sol.uniquePaths(3, 7)); // 28
        System.out.println(sol.uniquePaths(3, 2)); // 3
    }
}
