package org.example.trees;
import org.example.common.TreeNode;

/**
 * ============================================================
 * LeetCode #110 - Balanced Binary Tree
 * Difficulty: Easy
 * Category: Trees
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given a binary tree, determine if it is height-balanced. A height-balanced
 * binary tree is one in which the left and right subtrees of every node
 * differ in height by no more than one.
 *
 * CONSTRAINTS
 * -----------
 * - Number of nodes: 0 to 5000
 * - -10^4 <= Node.val <= 10^4
 *
 * EXAMPLES
 * --------
 * Input:  [3,9,20,null,null,15,7]
 * Output: true
 *
 * Input:  [1,2,2,3,3,null,null,4,4]
 * Output: false
 *
 * INTUITION & APPROACH
 * --------------------
 * DFS height function that returns -1 as a sentinel if the subtree is
 * unbalanced. At each node: compute left and right heights. If either is -1
 * (already unbalanced) or |leftH - rightH| > 1, return -1. Otherwise return
 * 1 + max(leftH, rightH). The tree is balanced iff the final result != -1.
 *
 * KEY CONCEPTS
 * ------------
 * - Bottom-up DFS with sentinel value -1 for unbalanced state
 * - Early termination: once -1 is returned, it propagates up immediately
 * - Single O(n) pass instead of naive O(n^2) recomputation of heights
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n) — single DFS pass
 * Space: O(h) — recursion stack where h = tree height
 * ============================================================
 */
public class P110BalancedBinaryTree {

    public boolean isBalanced(TreeNode root) {
        // TODO: implement
        return false;
    }

    public static void main(String[] args) {
        P110BalancedBinaryTree sol = new P110BalancedBinaryTree();
        TreeNode balanced = TreeNode.of(3, 9, 20, null, null, 15, 7);
        TreeNode unbalanced = TreeNode.of(1, 2, 2, 3, 3, null, null, 4, 4);
        System.out.println("P110BalancedBinaryTree — isBalanced([3,9,20,null,null,15,7]) expected true:  "
                + sol.isBalanced(balanced));
        System.out.println("P110BalancedBinaryTree — isBalanced([1,2,2,3,3,null,null,4,4]) expected false: "
                + sol.isBalanced(unbalanced));
    }
}
