package org.example.graphs;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/**
 * ============================================================
 * LeetCode #127 - Word Ladder
 * Difficulty: Hard
 * Category: Graphs
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given two words, beginWord and endWord, and a dictionary wordList, return
 * the number of words in the shortest transformation sequence from beginWord
 * to endWord. Each word in the sequence must differ from the previous by
 * exactly one letter, and each intermediate word must exist in wordList.
 * Return 0 if no such sequence exists.
 *
 * CONSTRAINTS
 * -----------
 * - 1 <= beginWord.length <= 10
 * - endWord.length == beginWord.length
 * - 1 <= wordList.length <= 5000
 * - All words consist of lowercase English letters
 * - beginWord != endWord
 * - endWord is in wordList
 *
 * EXAMPLES
 * --------
 * Example 1:
 *   beginWord = "hit", endWord = "cog"
 *   wordList  = ["hot","dot","dog","lot","log","cog"]
 *   Output: 5  ("hit" → "hot" → "dot" → "dog" → "cog")
 *
 * Example 2:
 *   beginWord = "hit", endWord = "cog"
 *   wordList  = ["hot","dot","dog","lot","log"]
 *   Output: 0  (endWord not in list → impossible)
 *
 * INTUITION & APPROACH
 * --------------------
 * BFS level by level where each level represents one transformation step.
 * The first time we reach endWord, the current level count is the answer.
 *
 * For each word in the queue, try changing every character position to
 * each of the 26 lowercase letters. If the resulting word is in the word
 * set, enqueue it and remove it from the set (prevents revisiting).
 * Removing from the set is equivalent to using a visited set but cheaper.
 *
 * KEY CONCEPTS
 * ------------
 * - BFS shortest path in unweighted graph
 * - Word mutation: try all 26 letters at each position (O(m * 26) per word)
 * - HashSet for O(1) lookup; remove visited words to avoid cycles
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(m^2 * n) — m = word length, n = number of words
 * Space: O(m * n)   — queue and set storage
 * ============================================================
 */
public class P127WordLadder {

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        // TODO: implement
        return 0;
    }

    public static void main(String[] args) {
        P127WordLadder sol = new P127WordLadder();

        System.out.println("Example 1 (expect 5): " +
            sol.ladderLength("hit", "cog", List.of("hot","dot","dog","lot","log","cog")));

        System.out.println("Example 2 (expect 0): " +
            sol.ladderLength("hit", "cog", List.of("hot","dot","dog","lot","log")));
    }
}
