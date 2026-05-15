package org.example.linkedlist;
import java.util.HashMap;
import java.util.Map;

/**
 * ============================================================
 * LeetCode #146 - LRU Cache
 * Difficulty: Medium
 * Category: Linked List
 * ============================================================
 *
 * PROBLEM
 * -------
 * Design a data structure that follows the constraints of a Least Recently
 * Used (LRU) cache. Implement the LRUCache class:
 *   - LRUCache(int capacity) initializes the LRU cache with positive size capacity.
 *   - int get(int key) returns the value of the key if it exists, otherwise -1.
 *   - void put(int key, int value) updates or inserts the key-value pair.
 *     If the number of keys exceeds capacity, evict the least recently used key.
 * Both get and put must run in O(1) average time.
 *
 * CONSTRAINTS
 * -----------
 * - 1 <= capacity <= 3000
 * - 0 <= key <= 10^4
 * - 0 <= value <= 10^5
 * - At most 2 * 10^5 calls will be made to get and put
 *
 * EXAMPLES
 * --------
 * LRUCache(2)
 * put(1, 1)   → cache: {1=1}
 * put(2, 2)   → cache: {1=1, 2=2}
 * get(1)      → returns 1 (key 1 is now most recently used)
 * put(3, 3)   → evicts key 2 (LRU), cache: {1=1, 3=3}
 * get(2)      → returns -1 (not found)
 * put(4, 4)   → evicts key 1 (LRU), cache: {3=3, 4=4}
 * get(1)      → returns -1 (not found)
 * get(3)      → returns 3
 * get(4)      → returns 4
 *
 * INTUITION & APPROACH
 * --------------------
 * Combine a doubly linked list with a HashMap for O(1) access and O(1)
 * ordering updates. The list maintains recency order: most recently used nodes
 * live near the head, least recently used near the tail. Sentinel (dummy) head
 * and tail nodes eliminate null pointer checks on boundary operations. On get,
 * look up the node in the map, move it to front (head side), and return its
 * value. On put, if key exists update and move to front; if new, insert at
 * front and add to map; if over capacity, remove the node just before the tail
 * sentinel (the LRU entry) and delete its key from the map.
 *
 * KEY CONCEPTS
 * ------------
 * - Doubly linked list provides O(1) node removal and insertion at front
 * - HashMap provides O(1) key-to-node lookup
 * - Sentinel head and tail nodes simplify insert/remove edge cases
 * - "Move to front" on every access maintains recency order
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(1) per get and put
 * Space: O(capacity)
 * ============================================================
 */
public class P146LRUCache {

    static class LRUCache {

        public LRUCache(int capacity) {
            // TODO: implement
        }

        public int get(int key) {
            // TODO: implement
            return -1;
        }

        public void put(int key, int value) {
            // TODO: implement
        }
    }

    public static void main(String[] args) {
        // LRUCache cache = new LRUCache(2);
        // cache.put(1, 1);
        // cache.put(2, 2);
        // System.out.println(cache.get(1));  // expected: 1
        // cache.put(3, 3);                   // evicts key 2
        // System.out.println(cache.get(2));  // expected: -1 (evicted)
        // cache.put(4, 4);                   // evicts key 1
        // System.out.println(cache.get(1));  // expected: -1 (evicted)
        // System.out.println(cache.get(3));  // expected: 3
        // System.out.println(cache.get(4));  // expected: 4

        System.out.println("P146LRUCache — uncomment examples above to test.");
    }
}
