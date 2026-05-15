package org.example.mathgeometry;

/**
 * ============================================================
 * LeetCode #48 - Rotate Image
 * Difficulty: Medium
 * Category: Math & Geometry
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given an n x n 2D matrix representing an image, rotate the image
 * 90 degrees clockwise IN PLACE. You must modify the input matrix directly
 * without allocating another 2D matrix.
 *
 * CONSTRAINTS
 * -----------
 * - n == matrix.length == matrix[i].length
 * - 1 <= n <= 20
 * - -1000 <= matrix[i][j] <= 1000
 *
 * EXAMPLES
 * --------
 * Input:  [[1,2,3],[4,5,6],[7,8,9]]
 * Output: [[7,4,1],[8,5,2],[9,6,3]]
 *
 * Input:  [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
 * Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
 *
 * INTUITION & APPROACH
 * --------------------
 * Two-step in-place transformation:
 *   Step 1 — Transpose: swap matrix[i][j] with matrix[j][i] for all j > i.
 *             This mirrors the matrix along the main diagonal.
 *   Step 2 — Reverse each row: reverse every row element-by-element.
 * The composition of transpose + row-reversal is equivalent to a
 * 90-degree clockwise rotation.
 *
 * Alternative: 4-way cycle swap on each cell — also O(n²) time, O(1) space.
 *
 * KEY CONCEPTS
 * ------------
 * - Transpose (swap matrix[i][j] and matrix[j][i] for j > i)
 * - Reverse each row
 * - Composition of the two steps = 90° clockwise rotation
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n²)
 * Space: O(1)
 * ============================================================
 */
public class P48RotateImage {

    public void rotate(int[][] matrix) {
        // TODO: implement
    }

    public static void main(String[] args) {
        // P48RotateImage sol = new P48RotateImage();
        // int[][] m = {{1,2,3},{4,5,6},{7,8,9}};
        // sol.rotate(m);
        // for (int[] row : m) System.out.println(java.util.Arrays.toString(row));
        // expected: [7,4,1] / [8,5,2] / [9,6,3]
        System.out.println("P48RotateImage — uncomment examples above to test.");
    }
}
