package org.example.trees;
import org.example.common.TreeNode;

/**
 * ============================================================
 * LeetCode #104 - Maximum Depth of Binary Tree
 * Difficulty: Easy
 * Category: Trees
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given the root of a binary tree, return its maximum depth.
 * The maximum depth is the number of nodes along the longest path
 * from the root node down to the farthest leaf node.
 *
 * CONSTRAINTS
 * -----------
 * - Number of nodes: 0 to 10^4
 * - -100 <= Node.val <= 100
 *
 * EXAMPLES
 * --------
 * Input:  [3,9,20,null,null,15,7]
 * Output: 3
 *
 * Input:  [1,null,2]
 * Output: 2
 *
 * INTUITION & APPROACH
 * --------------------
 * Recursive DFS: maxDepth(root) = 1 + max(maxDepth(left), maxDepth(right)).
 * Base case: null returns 0. BFS iterative also works by counting levels —
 * each time you finish processing a level, increment the depth counter.
 *
 * KEY CONCEPTS
 * ------------
 * - DFS postorder recursion: compute children depths before combining
 * - BFS level-count: track number of levels traversed
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n) — every node visited once
 * Space: O(h) — recursion stack where h = tree height
 * ============================================================
 */
public class P104MaxDepthOfBinaryTree {

    public int maxDepth(TreeNode root) {
        // TODO: implement
        return 0;
    }

    public static void main(String[] args) {
        P104MaxDepthOfBinaryTree sol = new P104MaxDepthOfBinaryTree();
        TreeNode root = TreeNode.of(3, 9, 20, null, null, 15, 7);
        System.out.println("P104MaxDepthOfBinaryTree — maxDepth([3,9,20,null,null,15,7]) expected 3: "
                + sol.maxDepth(root));
    }
}
