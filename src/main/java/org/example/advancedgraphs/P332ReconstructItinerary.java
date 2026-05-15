package org.example.advancedgraphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * ============================================================
 * LeetCode #332 - Reconstruct Itinerary
 * Difficulty: Hard
 * Category: Advanced Graphs
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given a list of airline tickets represented by pairs of departure and
 * arrival airports [from, to], reconstruct the itinerary in order. All
 * tickets must be used exactly once. The journey must begin at "JFK". If
 * there are multiple valid itineraries, return the lexicographically
 * smallest one.
 *
 * CONSTRAINTS
 * -----------
 * - 1 <= tickets.length <= 300
 * - tickets[i].length == 2
 * - from[i].length == 3, to[i].length == 3
 * - All airport codes consist of uppercase English letters
 * - All tickets form at least one valid itinerary
 *
 * EXAMPLES
 * --------
 * Example 1:
 *   tickets = [["MUC","LHR"],["JFK","MUC"],["SFO","SJC"],["LHR","SFO"]]
 *   Output:   ["JFK","MUC","LHR","SFO","SJC"]
 *
 * Example 2:
 *   tickets = [["JFK","SFO"],["JFK","ATL"],["SFO","ATL"],["ATL","JFK"],["ATL","SFO"]]
 *   Output:   ["JFK","ATL","JFK","SFO","ATL","SFO"]
 *
 * INTUITION & APPROACH
 * --------------------
 * This is an Eulerian path problem (visit every edge exactly once).
 * Hierholzer's algorithm finds the Eulerian path efficiently.
 *
 * Build an adjacency list where each airport maps to a min-heap (priority
 * queue) of destinations. The min-heap ensures we always pick the
 * lexicographically smallest destination first.
 *
 * DFS from "JFK":
 *   - While the current airport has remaining destinations, pop the smallest
 *     destination and recurse.
 *   - When no more destinations remain, prepend the current airport to the
 *     result list (postorder insertion).
 *
 * Prepending (instead of appending) reverses the postorder to give the
 * correct forward itinerary.
 *
 * KEY CONCEPTS
 * ------------
 * - Hierholzer's algorithm for Eulerian path
 * - Min-heap (PriorityQueue) per airport for lexicographic order
 * - Postorder DFS with prepend to build correct itinerary
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(E log E) — due to sorting destinations
 * Space: O(E)       — adjacency lists and result
 * ============================================================
 */
public class P332ReconstructItinerary {

    private Map<String, PriorityQueue<String>> adj;
    private LinkedList<String> result;

    public List<String> findItinerary(List<List<String>> tickets) {
        // TODO: implement
        return new ArrayList<>();
    }

    private void dfs(String airport) {
        // TODO: implement
    }

    public static void main(String[] args) {
        P332ReconstructItinerary sol = new P332ReconstructItinerary();

        List<List<String>> tickets1 = List.of(
            List.of("MUC","LHR"),
            List.of("JFK","MUC"),
            List.of("SFO","SJC"),
            List.of("LHR","SFO")
        );
        System.out.println("Example 1 (expect [JFK,MUC,LHR,SFO,SJC]): " +
            sol.findItinerary(tickets1));

        List<List<String>> tickets2 = List.of(
            List.of("JFK","SFO"),
            List.of("JFK","ATL"),
            List.of("SFO","ATL"),
            List.of("ATL","JFK"),
            List.of("ATL","SFO")
        );
        System.out.println("Example 2 (expect [JFK,ATL,JFK,SFO,ATL,SFO]): " +
            sol.findItinerary(tickets2));
    }
}
