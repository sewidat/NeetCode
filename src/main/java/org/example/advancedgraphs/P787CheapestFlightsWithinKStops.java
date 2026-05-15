package org.example.advancedgraphs;

import java.util.Arrays;

/**
 * ============================================================
 * LeetCode #787 - Cheapest Flights Within K Stops
 * Difficulty: Medium
 * Category: Advanced Graphs
 * ============================================================
 *
 * PROBLEM
 * -------
 * There are n cities connected by some flights. You are given an array
 * flights where flights[i] = [fromi, toi, pricei] indicates a directed
 * flight from city fromi to city toi with cost pricei.
 *
 * Given src, dst, and k, return the cheapest price from src to dst with
 * at most k stops. If there is no such route, return -1.
 *
 * CONSTRAINTS
 * -----------
 * - 1 <= n <= 100
 * - 0 <= flights.length <= 6000
 * - 0 <= fromi, toi, src, dst < n
 * - fromi != toi
 * - 1 <= pricei <= 10^4
 * - src != dst
 * - 0 <= k < n
 *
 * EXAMPLES
 * --------
 * Example 1:
 *   n = 4
 *   flights = [[0,1,100],[1,2,100],[2,0,100],[1,3,600],[2,3,200]]
 *   src = 0, dst = 3, k = 1
 *   Output: 700  (0→1→3 costs 700; only 1 stop)
 *
 * Example 2:
 *   n = 3, flights = [[0,1,100],[1,2,100],[0,2,500]], src=0, dst=2, k=1 → 200
 *
 * Example 3:
 *   n = 3, flights = [[0,1,100],[1,2,100],[0,2,500]], src=0, dst=2, k=0 → 500
 *
 * INTUITION & APPROACH
 * --------------------
 * Bellman-Ford with a limited number of relaxation rounds.
 *
 * Standard Bellman-Ford finds shortest paths in V-1 rounds. Here we run
 * exactly k+1 rounds (because k stops means k+1 edges/hops).
 *
 * Key implementation detail: use a copy of the prices array (temp[]) for
 * each round to prevent using an edge twice in the same round (simulates
 * adding one hop at a time).
 *
 *   prices[] = current best prices from src to each city
 *   For each round i from 1 to k+1:
 *     temp = copy of prices
 *     For each flight (u, v, w):
 *       if prices[u] != INF:
 *         temp[v] = min(temp[v], prices[u] + w)
 *     prices = temp
 *
 * Return prices[dst], or -1 if still infinity.
 *
 * Alternative: Dijkstra with state (totalCost, node, stopsUsed).
 *   Use a min-heap; stop expanding a node if stopsUsed > k.
 *   First time dst is reached = cheapest (Dijkstra's greedy guarantee
 *   holds when stops are bounded too).
 *
 * KEY CONCEPTS
 * ------------
 * - Bellman-Ford limited to k+1 relaxation rounds
 * - Temp copy of prices[] prevents same-round edge reuse
 * - Dijkstra with (cost, node, stops) state as alternative
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(k * E)
 * Space: O(V)     — two price arrays
 * ============================================================
 */
public class P787CheapestFlightsWithinKStops {

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        // TODO: implement
        return 0;
    }

    public static void main(String[] args) {
        P787CheapestFlightsWithinKStops sol = new P787CheapestFlightsWithinKStops();

        System.out.println("Example 1 (expect 700): " +
            sol.findCheapestPrice(4,
                new int[][]{{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}},
                0, 3, 1));

        System.out.println("Example 2 (expect 200): " +
            sol.findCheapestPrice(3,
                new int[][]{{0,1,100},{1,2,100},{0,2,500}},
                0, 2, 1));

        System.out.println("Example 3 (expect 500): " +
            sol.findCheapestPrice(3,
                new int[][]{{0,1,100},{1,2,100},{0,2,500}},
                0, 2, 0));
    }
}
