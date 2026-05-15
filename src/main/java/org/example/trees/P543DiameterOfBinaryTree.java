package org.example.trees;
import org.example.common.TreeNode;

/**
 * ============================================================
 * LeetCode #543 - Diameter of Binary Tree
 * Difficulty: Easy
 * Category: Trees
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given the root of a binary tree, return the length of the diameter of
 * the tree. The diameter is the length of the longest path between any
 * two nodes in the tree. The path does not need to pass through the root.
 * Length is measured in number of edges.
 *
 * CONSTRAINTS
 * -----------
 * - Number of nodes: 1 to 10^4
 * - -100 <= Node.val <= 100
 *
 * EXAMPLES
 * --------
 * Input:  [1,2,3,4,5]
 * Output: 3  (path: 4-2-1-3 or 5-2-1-3)
 *
 * Input:  [1,2]
 * Output: 1
 *
 * INTUITION & APPROACH
 * --------------------
 * DFS height function. At each node, the diameter passing through this node
 * equals leftHeight + rightHeight (in edges). Track a global max diameter
 * updated at every node. The DFS function returns 1 + max(leftHeight, rightHeight)
 * as the height contribution to the parent. Single DFS pass: O(n).
 *
 * KEY CONCEPTS
 * ------------
 * - DFS returning height from each subtree
 * - Global max variable updated at each node: diameter = leftH + rightH
 * - Height returned upward = 1 + max(leftH, rightH)
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n) — single DFS pass
 * Space: O(h) — recursion stack where h = tree height
 * ============================================================
 */
public class P543DiameterOfBinaryTree {

    public int diameterOfBinaryTree(TreeNode root) {
        // TODO: implement
        return 0;
    }

    public static void main(String[] args) {
        P543DiameterOfBinaryTree sol = new P543DiameterOfBinaryTree();
        TreeNode root = TreeNode.of(1, 2, 3, 4, 5);
        System.out.println("P543DiameterOfBinaryTree — diameterOfBinaryTree([1,2,3,4,5]) expected 3: "
                + sol.diameterOfBinaryTree(root));
    }
}
