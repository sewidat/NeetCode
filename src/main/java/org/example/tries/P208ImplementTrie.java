package org.example.tries;

/**
 * ============================================================
 * LeetCode #208 - Implement Trie (Prefix Tree)
 * Difficulty: Medium
 * Category: Tries
 * ============================================================
 *
 * PROBLEM
 * -------
 * A trie (pronounced as "try") or prefix tree is a tree data structure used
 * to efficiently store and retrieve keys in a dataset of strings. Implement
 * the Trie class:
 *   - Trie()           Initialize the trie object.
 *   - insert(word)     Insert word into the trie.
 *   - search(word)     Return true if word is in the trie (exact match).
 *   - startsWith(prefix) Return true if any word in the trie starts with prefix.
 *
 * CONSTRAINTS
 * -----------
 * - 1 to 2000 calls in total
 * - 1 <= word.length, prefix.length <= 2000
 * - word and prefix consist of lowercase English letters only
 *
 * EXAMPLES
 * --------
 * Trie trie = new Trie();
 * trie.insert("apple");
 * trie.search("apple")    → true
 * trie.search("app")      → false
 * trie.startsWith("app")  → true
 * trie.insert("app");
 * trie.search("app")      → true
 *
 * INTUITION & APPROACH
 * --------------------
 * Each TrieNode holds an array of 26 children (one per lowercase letter) and
 * an isEndOfWord boolean flag. Insert: for each character in word, compute
 * index (c - 'a'), create child node if absent, then advance. Mark final node
 * as end. Search: walk nodes character by character; return true only if all
 * chars found AND final node has isEndOfWord = true. StartsWith: same walk but
 * return true as soon as all prefix chars are matched (no isEnd check needed).
 *
 * KEY CONCEPTS
 * ------------
 * - TrieNode: children[26] array + isEnd boolean flag
 * - Prefix-based character routing via (c - 'a') indexing
 * - search requires isEnd check; startsWith does not
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(m) per operation where m = length of word/prefix
 * Space: O(m * n) total where n = number of inserted words
 * ============================================================
 */
public class P208ImplementTrie {

    static class Trie {

        public Trie() {
            // TODO: initialize
        }

        public void insert(String word) {
            // TODO: implement
        }

        public boolean search(String word) {
            // TODO: implement
            return false;
        }

        public boolean startsWith(String prefix) {
            // TODO: implement
            return false;
        }
    }

    public static void main(String[] args) {
        // Trie trie = new Trie();
        // trie.insert("apple");
        // System.out.println(trie.search("apple"));   // expected true
        // System.out.println(trie.search("app"));     // expected false
        // System.out.println(trie.startsWith("app")); // expected true
        // trie.insert("app");
        // System.out.println(trie.search("app"));     // expected true
        System.out.println("P208ImplementTrie — uncomment examples above to test.");
    }
}
