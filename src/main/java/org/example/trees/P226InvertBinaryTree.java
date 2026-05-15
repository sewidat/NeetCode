package org.example.trees;
import org.example.common.TreeNode;

/**
 * ============================================================
 * LeetCode #226 - Invert Binary Tree
 * Difficulty: Easy
 * Category: Trees
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given the root of a binary tree, invert the tree (mirror it),
 * and return its root.
 *
 * CONSTRAINTS
 * -----------
 * - Number of nodes: 0 to 100
 * - -100 <= Node.val <= 100
 *
 * EXAMPLES
 * --------
 * Input:  [4,2,7,1,3,6,9]
 * Output: [4,7,2,9,6,3,1]
 *
 * Input:  [2,1,3]
 * Output: [2,3,1]
 *
 * Input:  []
 * Output: []
 *
 * INTUITION & APPROACH
 * --------------------
 * Recursive DFS: for each node, swap its left and right children,
 * then recursively invert both subtrees. Base case: if root is null,
 * return null. This works in either preorder (swap then recurse) or
 * postorder (recurse then swap). Also doable with BFS level-order swap.
 *
 * KEY CONCEPTS
 * ------------
 * - DFS postorder or preorder traversal
 * - Swap left and right children at each node
 * - Every node is visited exactly once
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n) — every node visited once
 * Space: O(h) — recursion stack where h = tree height
 * ============================================================
 */
public class P226InvertBinaryTree {

    public TreeNode invertTree(TreeNode root) {
        // TODO: implement
        return null;
    }

    public static void main(String[] args) {
        P226InvertBinaryTree sol = new P226InvertBinaryTree();
        TreeNode root = TreeNode.of(4, 2, 7, 1, 3, 6, 9);
        TreeNode result = sol.invertTree(root);
        System.out.println("P226InvertBinaryTree — invertTree([4,2,7,1,3,6,9]) expected [4,7,2,9,6,3,1]: " + result);
    }
}
