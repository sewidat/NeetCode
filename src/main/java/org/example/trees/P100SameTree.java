package org.example.trees;
import org.example.common.TreeNode;

/**
 * ============================================================
 * LeetCode #100 - Same Tree
 * Difficulty: Easy
 * Category: Trees
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given the roots of two binary trees p and q, write a function to check
 * if they are the same or not. Two binary trees are considered the same
 * if they are structurally identical and the nodes have the same value.
 *
 * CONSTRAINTS
 * -----------
 * - Number of nodes in both trees: 0 to 100
 * - -10^4 <= Node.val <= 10^4
 *
 * EXAMPLES
 * --------
 * Input:  p = [1,2,3], q = [1,2,3]
 * Output: true
 *
 * Input:  p = [1,2], q = [1,null,2]
 * Output: false
 *
 * Input:  p = [1,2,1], q = [1,1,2]
 * Output: false
 *
 * INTUITION & APPROACH
 * --------------------
 * Recursive simultaneous DFS on both trees. Base cases:
 *   1. Both null → true (structural match at leaf)
 *   2. One null, other not → false (structural mismatch)
 *   3. Values differ → false
 * Recurse on both left and right subtrees; return true only if both match.
 *
 * KEY CONCEPTS
 * ------------
 * - Simultaneous DFS traversal of two trees
 * - Three base cases handling null combinations and value mismatch
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n) — visit each node once (n = min nodes in both trees)
 * Space: O(h) — recursion stack where h = tree height
 * ============================================================
 */
public class P100SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        // TODO: implement
        return false;
    }

    public static void main(String[] args) {
        P100SameTree sol = new P100SameTree();
        System.out.println("P100SameTree — isSameTree([1,2,3],[1,2,3]) expected true:  "
                + sol.isSameTree(TreeNode.of(1, 2, 3), TreeNode.of(1, 2, 3)));
        System.out.println("P100SameTree — isSameTree([1,2],[1,null,2]) expected false: "
                + sol.isSameTree(TreeNode.of(1, 2), TreeNode.of(1, null, 2)));
    }
}
