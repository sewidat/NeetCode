package org.example.trees;
import org.example.common.TreeNode;

/**
 * ============================================================
 * LeetCode #572 - Subtree of Another Tree
 * Difficulty: Easy
 * Category: Trees
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given the roots of two binary trees root and subRoot, return true if there
 * is a subtree of root with the same structure and node values as subRoot
 * and false otherwise. A subtree of a binary tree is a tree consisting of a
 * node and all of its descendants. The tree root itself is also a subtree.
 *
 * CONSTRAINTS
 * -----------
 * - Number of nodes in root: 1 to 2000
 * - Number of nodes in subRoot: 1 to 1000
 * - -10^4 <= Node.val <= 10^4
 *
 * EXAMPLES
 * --------
 * Input:  root = [3,4,5,1,2], subRoot = [4,1,2]
 * Output: true
 *
 * Input:  root = [3,4,5,1,2,null,null,null,null,0], subRoot = [4,1,2]
 * Output: false
 *
 * INTUITION & APPROACH
 * --------------------
 * At each node of root, check if isSameTree(root, subRoot). If yes, found it.
 * Otherwise recurse on left and right subtrees. The isSameTree helper does a
 * full structural comparison. O(n * m) time where n = nodes in root, m = nodes
 * in subRoot. Alternative: serialize both trees and use string matching for O(n+m).
 *
 * KEY CONCEPTS
 * ------------
 * - isSameTree helper for structural equality check
 * - Recursive subtree matching: try each node as potential subtree root
 * - DFS traversal of root combined with full tree comparison at each node
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n*m) — at each of n nodes, potentially compare m nodes
 * Space: O(h) — recursion stack where h = height of root
 * ============================================================
 */
public class P572SubtreeOfAnotherTree {

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        // TODO: implement
        return false;
    }

    private boolean isSameTree(TreeNode p, TreeNode q) {
        // TODO: implement
        return false;
    }

    public static void main(String[] args) {
        P572SubtreeOfAnotherTree sol = new P572SubtreeOfAnotherTree();
        TreeNode root1 = TreeNode.of(3, 4, 5, 1, 2);
        TreeNode sub1 = TreeNode.of(4, 1, 2);
        System.out.println("P572SubtreeOfAnotherTree — isSubtree([3,4,5,1,2],[4,1,2]) expected true:  "
                + sol.isSubtree(root1, sub1));
        TreeNode root2 = TreeNode.of(3, 4, 5, 1, 2, null, null, null, null, 0);
        TreeNode sub2 = TreeNode.of(4, 1, 2);
        System.out.println("P572SubtreeOfAnotherTree — isSubtree([3,4,5,1,2,null,null,null,null,0],[4,1,2]) expected false: "
                + sol.isSubtree(root2, sub2));
    }
}
