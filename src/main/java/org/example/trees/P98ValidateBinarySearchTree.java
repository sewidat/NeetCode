package org.example.trees;
import org.example.common.TreeNode;

/**
 * ============================================================
 * LeetCode #98 - Validate Binary Search Tree
 * Difficulty: Medium
 * Category: Trees
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given the root of a binary tree, determine if it is a valid binary
 * search tree (BST). A valid BST is defined as:
 *   - The left subtree of a node contains only nodes with keys strictly
 *     less than the node's key.
 *   - The right subtree of a node contains only nodes with keys strictly
 *     greater than the node's key.
 *   - Both the left and right subtrees must also be binary search trees.
 *
 * CONSTRAINTS
 * -----------
 * - Number of nodes: 1 to 10^4
 * - -2^31 <= Node.val <= 2^31 - 1
 *
 * EXAMPLES
 * --------
 * Input:  [2,1,3]
 * Output: true
 *
 * Input:  [5,1,4,null,null,3,6]
 * Output: false  (right child 4 violates BST: 4 < 5)
 *
 * INTUITION & APPROACH
 * --------------------
 * DFS passing min/max bounds down the tree. Each node's value must be strictly
 * within (min, max). The root starts with (Long.MIN_VALUE, Long.MAX_VALUE).
 * When recursing left: upper bound becomes current node's value.
 * When recursing right: lower bound becomes current node's value.
 * Use Long bounds to handle nodes with Integer.MIN_VALUE or Integer.MAX_VALUE.
 *
 * KEY CONCEPTS
 * ------------
 * - DFS with (min, max) bounds propagated downward
 * - Strict inequalities: node.val must be > min and < max
 * - Use Long.MIN_VALUE / Long.MAX_VALUE to avoid integer overflow edge cases
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n) — every node visited once
 * Space: O(h) — recursion stack where h = tree height
 * ============================================================
 */
public class P98ValidateBinarySearchTree {

    public boolean isValidBST(TreeNode root) {
        // TODO: implement
        return false;
    }

    public static void main(String[] args) {
        P98ValidateBinarySearchTree sol = new P98ValidateBinarySearchTree();
        System.out.println("P98ValidateBinarySearchTree — isValidBST([2,1,3]) expected true:  "
                + sol.isValidBST(TreeNode.of(2, 1, 3)));
        System.out.println("P98ValidateBinarySearchTree — isValidBST([5,1,4,null,null,3,6]) expected false: "
                + sol.isValidBST(TreeNode.of(5, 1, 4, null, null, 3, 6)));
    }
}
