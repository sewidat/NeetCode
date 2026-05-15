package org.example.dp2d;

/**
 * ============================================================
 * LeetCode #72 - Edit Distance
 * Difficulty: Medium
 * Category: 2-D Dynamic Programming
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given two strings word1 and word2, return the minimum number of
 * operations required to convert word1 into word2. The allowed
 * operations are:
 *   - Insert a character
 *   - Delete a character
 *   - Replace a character
 *
 * CONSTRAINTS
 * -----------
 * 0 <= word1.length, word2.length <= 500
 * word1 and word2 consist of lowercase English letters.
 *
 * EXAMPLES
 * --------
 * word1 = "horse", word2 = "ros"       → 3
 *   horse → rorse (replace 'h' with 'r')
 *   rorse → rose  (delete 'r')
 *   rose  → ros   (delete 'e')
 * word1 = "intention", word2 = "execution" → 5
 *
 * INTUITION & APPROACH
 * --------------------
 * Define dp[i][j] = minimum edits to convert word1[0..i-1] to word2[0..j-1].
 *
 * Recurrence:
 *   If word1[i-1] == word2[j-1]:
 *     dp[i][j] = dp[i-1][j-1]          // characters match — no operation needed
 *   Else:
 *     dp[i][j] = 1 + min(
 *       dp[i-1][j-1],                   // replace: fix word1[i-1] to match word2[j-1]
 *       dp[i-1][j],                     // delete: remove word1[i-1], solve (i-1, j)
 *       dp[i][j-1]                      // insert: add word2[j-1] after position i, solve (i, j-1)
 *     )
 *
 * Base cases:
 *   dp[i][0] = i   (delete i chars from word1 to reach empty word2)
 *   dp[0][j] = j   (insert j chars to produce word2 from empty word1)
 *
 * Space optimization: only two rows needed at a time → O(n) space.
 *
 * KEY CONCEPTS
 * ------------
 * - dp[i][j] = min edits to convert word1[0..i-1] to word2[0..j-1]
 * - Match costs 0 (take diagonal); mismatch: 1 + min(diagonal, top, left)
 * - Diagonal = replace, top = delete from word1, left = insert into word1
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(m * n)
 * Space: O(m * n) — optimizable to O(n)
 * ============================================================
 */
public class P72EditDistance {
    public int minDistance(String word1, String word2) {
        // TODO: implement
        return 0;
    }

    public static void main(String[] args) {
        P72EditDistance sol = new P72EditDistance();
        System.out.println(sol.minDistance("horse", "ros"));          // 3
        System.out.println(sol.minDistance("intention", "execution")); // 5
    }
}
