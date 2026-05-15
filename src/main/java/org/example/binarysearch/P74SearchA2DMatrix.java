package org.example.binarysearch;

/**
 * ============================================================
 * LeetCode #74 - Search a 2D Matrix
 * Difficulty: Medium
 * Category: Binary Search
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given an m x n matrix where each row is sorted in ascending order
 * and the first integer of each row is greater than the last integer
 * of the previous row, search for a target value. Return true if found.
 *
 * CONSTRAINTS
 * -----------
 * m, n >= 1
 * -10^4 <= matrix[i][j] <= 10^4
 * Matrix is fully sorted if all rows are concatenated
 *
 * EXAMPLES
 * --------
 * matrix=[[1,3,5,7],[10,11,16,20],[23,30,34,60]], target=3   → true
 * matrix=[[1,3,5,7],[10,11,16,20],[23,30,34,60]], target=13  → false
 *
 * INTUITION & APPROACH
 * --------------------
 * Treat the matrix as a single sorted array of length m*n. Binary search
 * with lo=0, hi=m*n-1. Map the midpoint index to 2D coordinates using
 * row = mid / n and col = mid % n for matrix access. O(log(m*n)) time.
 *
 * KEY CONCEPTS
 * ------------
 * Flatten 2D index: row = mid / n, col = mid % n
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(log(m*n))
 * Space: O(1)
 * ============================================================
 */
public class P74SearchA2DMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        // TODO: implement
        return false;
    }

    public static void main(String[] args) {
        P74SearchA2DMatrix sol = new P74SearchA2DMatrix();
        System.out.println(sol.searchMatrix(
            new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 3
        )); // expected true
    }
}
