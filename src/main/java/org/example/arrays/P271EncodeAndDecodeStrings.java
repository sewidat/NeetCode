package org.example.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * ============================================================
 * LeetCode #271 - Encode and Decode Strings
 * Difficulty: Medium
 * Category: Arrays & Hashing
 * ============================================================
 *
 * PROBLEM
 * -------
 * Design an algorithm to encode a list of strings to a single string, and
 * decode that single string back to the original list. The encoded string
 * is sent over the network and must be decoded on the other side without
 * any prior knowledge of the original string lengths or contents.
 *
 * CONSTRAINTS
 * -----------
 * - 0 <= strs.length <= 200
 * - 0 <= strs[i].length <= 200
 * - strs[i] may contain any possible character, including '#' and special chars
 *
 * EXAMPLES
 * --------
 * Input: ["lint","code","love","you"]
 *   → encode → some string → decode → ["lint","code","love","you"]
 * Input: [""]  → encode → decode → [""]
 *
 * INTUITION & APPROACH
 * --------------------
 * A naive delimiter (e.g. "#") fails if strings themselves contain that character.
 * The robust solution is length-prefix encoding: for each string, prepend its
 * length followed by a separator character '#', then the string itself. For example,
 * ["lint","code"] encodes to "4#lint4#code". During decoding, read the number up to
 * '#', then read exactly that many characters as the next string. This is unambiguous
 * regardless of what characters appear inside the strings.
 *
 * KEY CONCEPTS
 * ------------
 * - Length-prefix encoding: "{len}#{string}" format prevents delimiter collisions
 * - Integer.parseInt to extract the length prefix during decoding
 * - Pointer-based parsing: advance index by length after each decode step
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n) — where n is total characters across all strings
 * Space: O(n) — encoded string and decoded list both proportional to total input
 * ============================================================
 */
public class P271EncodeAndDecodeStrings {

    public String encode(List<String> strs) {
        // TODO: implement length-prefix encoding
        return "";
    }

    public List<String> decode(String s) {
        // TODO: implement length-prefix decoding
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        P271EncodeAndDecodeStrings sol = new P271EncodeAndDecodeStrings();
        // List<String> strs = List.of("lint","code","love","you");
        // System.out.println(sol.decode(sol.encode(strs)).equals(strs));  // expected true
        System.out.println("P271EncodeAndDecodeStrings — uncomment examples above to test.");
    }
}
