package org.example.trees;
import org.example.common.TreeNode;

/**
 * ============================================================
 * LeetCode #1448 - Count Good Nodes in Binary Tree
 * Difficulty: Medium
 * Category: Trees
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given a binary tree root, a node X in the tree is named "good" if in the
 * path from root to X there are no nodes with a value greater than X.val.
 * Return the number of good nodes in the binary tree.
 *
 * CONSTRAINTS
 * -----------
 * - Number of nodes: 1 to 10^5
 * - -10^4 <= Node.val <= 10^4
 *
 * EXAMPLES
 * --------
 * Input:  [3,1,4,3,null,1,5]
 * Output: 4  (nodes with values 3, 3, 4, 5 are good)
 *
 * Input:  [3,3,null,4,2]
 * Output: 3  (nodes with values 3, 3, 4 are good)
 *
 * Input:  [1]
 * Output: 1
 *
 * INTUITION & APPROACH
 * --------------------
 * DFS passing down the maximum value seen so far on the current root-to-node
 * path. If current node's value >= maxSoFar, it is "good" — increment count.
 * Update maxSoFar = max(maxSoFar, current.val) before recursing into children.
 * The root is always good (no preceding nodes on its path).
 *
 * KEY CONCEPTS
 * ------------
 * - DFS preorder traversal with path maximum propagated downward
 * - A node is good iff node.val >= max value seen on path from root to parent
 * - Root is always counted as good (Integer.MIN_VALUE as initial max)
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n) — every node visited once
 * Space: O(h) — recursion stack where h = tree height
 * ============================================================
 */
public class P1448CountGoodNodesInBinaryTree {

    public int goodNodes(TreeNode root) {
        // TODO: implement
        return 0;
    }

    public static void main(String[] args) {
        P1448CountGoodNodesInBinaryTree sol = new P1448CountGoodNodesInBinaryTree();
        TreeNode root1 = TreeNode.of(3, 1, 4, 3, null, 1, 5);
        System.out.println("P1448CountGoodNodesInBinaryTree — goodNodes([3,1,4,3,null,1,5]) expected 4: "
                + sol.goodNodes(root1));
        TreeNode root2 = TreeNode.of(3, 3, null, 4, 2);
        System.out.println("P1448CountGoodNodesInBinaryTree — goodNodes([3,3,null,4,2]) expected 3: "
                + sol.goodNodes(root2));
    }
}
