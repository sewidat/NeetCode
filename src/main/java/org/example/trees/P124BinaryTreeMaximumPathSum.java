package org.example.trees;
import org.example.common.TreeNode;

/**
 * ============================================================
 * LeetCode #124 - Binary Tree Maximum Path Sum
 * Difficulty: Hard
 * Category: Trees
 * ============================================================
 *
 * PROBLEM
 * -------
 * A path in a binary tree is a sequence of nodes where each pair of adjacent
 * nodes has an edge between them. A node can appear in the path at most once.
 * The path does not need to pass through the root. Given the root of a binary
 * tree, return the maximum path sum of any non-empty path.
 *
 * CONSTRAINTS
 * -----------
 * - Number of nodes: 1 to 3 * 10^4
 * - -1000 <= Node.val <= 1000
 *
 * EXAMPLES
 * --------
 * Input:  [1,2,3]
 * Output: 6  (path: 2 → 1 → 3)
 *
 * Input:  [-10,9,20,null,null,15,7]
 * Output: 42  (path: 15 → 20 → 7)
 *
 * INTUITION & APPROACH
 * --------------------
 * DFS that returns the best single-arm gain from each node upward to its parent.
 * At each node:
 *   - leftGain  = max(0, dfs(left))   // ignore negative gains
 *   - rightGain = max(0, dfs(right))
 *   - Update global max: node.val + leftGain + rightGain  (path through this node)
 *   - Return to parent: node.val + max(leftGain, rightGain)  (single-arm)
 * Global max is the answer. A node can be a path by itself (gains clamped to 0).
 *
 * KEY CONCEPTS
 * ------------
 * - DFS returning best one-sided path contribution
 * - Global max updated at each node for the two-armed (split) path case
 * - Negative contributions clamped to 0 (don't extend path with negative gain)
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n) — single DFS pass
 * Space: O(h) — recursion stack where h = tree height
 * ============================================================
 */
public class P124BinaryTreeMaximumPathSum {

    public int maxPathSum(TreeNode root) {
        // TODO: implement
        return 0;
    }

    public static void main(String[] args) {
        P124BinaryTreeMaximumPathSum sol = new P124BinaryTreeMaximumPathSum();
        TreeNode root1 = TreeNode.of(1, 2, 3);
        System.out.println("P124BinaryTreeMaximumPathSum — maxPathSum([1,2,3]) expected 6:  "
                + sol.maxPathSum(root1));
        TreeNode root2 = TreeNode.of(-10, 9, 20, null, null, 15, 7);
        System.out.println("P124BinaryTreeMaximumPathSum — maxPathSum([-10,9,20,null,null,15,7]) expected 42: "
                + sol.maxPathSum(root2));
    }
}
