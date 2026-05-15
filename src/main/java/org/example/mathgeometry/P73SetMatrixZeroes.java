package org.example.mathgeometry;

/**
 * ============================================================
 * LeetCode #73 - Set Matrix Zeroes
 * Difficulty: Medium
 * Category: Math & Geometry
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given an m x n integer matrix, if any element is 0, set its entire row
 * and column to 0s. Perform the modification in place.
 *
 * CONSTRAINTS
 * -----------
 * - 1 <= m, n <= 200
 * - -2^31 <= matrix[i][j] <= 2^31 - 1
 *
 * EXAMPLES
 * --------
 * Input:  [[1,1,1],[1,0,1],[1,1,1]]
 * Output: [[1,0,1],[0,0,0],[1,0,1]]
 *
 * Input:  [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
 * Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
 *
 * INTUITION & APPROACH
 * --------------------
 * O(1) extra space using the first row and first column as markers:
 *   1. Check whether the first row itself contains a zero (firstRowZero).
 *      Check whether the first column itself contains a zero (firstColZero).
 *   2. For all cells (i, j) with i >= 1 and j >= 1: if matrix[i][j] == 0,
 *      mark matrix[i][0] = 0 and matrix[0][j] = 0.
 *   3. Use those markers to zero out cells: for i >= 1, j >= 1, if
 *      matrix[i][0] == 0 or matrix[0][j] == 0, set matrix[i][j] = 0.
 *   4. Apply firstRowZero and firstColZero to the first row / col.
 *
 * KEY CONCEPTS
 * ------------
 * - Use first row and first column as marker arrays (O(1) extra space)
 * - Handle first row and first column separately before marking
 * - Process interior cells before applying markers to borders
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(m * n)
 * Space: O(1)
 * ============================================================
 */
public class P73SetMatrixZeroes {

    public void setZeroes(int[][] matrix) {
        // TODO: implement
    }

    public static void main(String[] args) {
        // P73SetMatrixZeroes sol = new P73SetMatrixZeroes();
        // int[][] m = {{1,1,1},{1,0,1},{1,1,1}};
        // sol.setZeroes(m);
        // for (int[] row : m) System.out.println(java.util.Arrays.toString(row));
        // expected: [1,0,1] / [0,0,0] / [1,0,1]
        System.out.println("P73SetMatrixZeroes — uncomment examples above to test.");
    }
}
