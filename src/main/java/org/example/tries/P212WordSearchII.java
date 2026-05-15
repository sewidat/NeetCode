package org.example.tries;
import java.util.ArrayList;
import java.util.List;

/**
 * ============================================================
 * LeetCode #212 - Word Search II
 * Difficulty: Hard
 * Category: Tries
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given an m x n board of characters and a list of strings words, return all
 * words on the board. Each word must be constructed from letters of sequentially
 * adjacent cells (horizontally or vertically neighboring). The same cell may not
 * be used more than once in a word.
 *
 * CONSTRAINTS
 * -----------
 * - 1 <= m, n <= 12
 * - board[i][j] is a lowercase English letter
 * - 1 <= words.length <= 3 * 10^4
 * - 1 <= words[i].length <= 10
 * - words[i] consists of lowercase English letters
 * - All strings in words are unique
 *
 * EXAMPLES
 * --------
 * Input:  board = [["o","a","a","n"],["e","t","a","e"],["i","h","k","r"],["i","f","l","v"]],
 *         words = ["oath","pea","eat","rain"]
 * Output: ["eat","oath"]
 *
 * Input:  board = [["a","b"],["c","d"]], words = ["abcb"]
 * Output: []
 *
 * INTUITION & APPROACH
 * --------------------
 * Build a Trie from all words in the list. Then run DFS from every cell on the
 * board, simultaneously traversing the Trie. At each step, move to the Trie
 * child corresponding to the current board character. If that child is null,
 * prune and backtrack. If a Trie node has isEnd = true, a complete word has
 * been found — add it to results and clear isEnd to avoid duplicates. Mark
 * board cells visited during DFS with a sentinel (e.g., '#') and restore on
 * backtrack. Optionally prune leaf Trie nodes after finding words to speed up
 * subsequent searches.
 *
 * KEY CONCEPTS
 * ------------
 * - Trie built from all words enables simultaneous multi-word path matching
 * - DFS backtracking on the board with visited-cell marking (sentinel character)
 * - Pruning: clear isEnd after finding a word; remove empty Trie nodes to speed up
 * - Four-directional movement (up, down, left, right)
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(m * n * 4 * 3^(L-1)) where L = max word length
 * Space: O(total characters across all words) for Trie storage
 * ============================================================
 */
public class P212WordSearchII {

    public List<String> findWords(char[][] board, String[] words) {
        // TODO: implement
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        P212WordSearchII sol = new P212WordSearchII();
        char[][] board = {
            {'o','a','a','n'},
            {'e','t','a','e'},
            {'i','h','k','r'},
            {'i','f','l','v'}
        };
        String[] words = {"oath", "pea", "eat", "rain"};
        System.out.println("P212WordSearchII — findWords expected [eat, oath]: "
                + sol.findWords(board, words));
    }
}
