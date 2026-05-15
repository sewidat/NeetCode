package org.example;

/**
 * NeetCode 150 — Problem Index
 *
 * Run this class to see all 150 problems organized by category.
 * To run any individual problem, open its class in IntelliJ and press
 * the green arrow next to its main() method, or from the terminal:
 *
 *   mvn exec:java -Dexec.mainClass=org.example.arrays.P1TwoSum
 *   mvn compile   (validates all 150 skeletons compile cleanly)
 */
public class Main {

    public static void main(String[] args) {
        cat("Arrays & Hashing (9)", new String[]{
            "#217 ContainsDuplicate            org.example.arrays.P217ContainsDuplicate",
            "#242 ValidAnagram                 org.example.arrays.P242ValidAnagram",
            "#1   TwoSum                       org.example.arrays.P1TwoSum",
            "#49  GroupAnagrams                org.example.arrays.P49GroupAnagrams",
            "#347 TopKFrequentElements         org.example.arrays.P347TopKFrequentElements",
            "#271 EncodeAndDecodeStrings       org.example.arrays.P271EncodeAndDecodeStrings",
            "#238 ProductOfArrayExceptSelf     org.example.arrays.P238ProductOfArrayExceptSelf",
            "#36  ValidSudoku                  org.example.arrays.P36ValidSudoku",
            "#128 LongestConsecutiveSequence   org.example.arrays.P128LongestConsecutiveSequence",
        });
        cat("Two Pointers (5)", new String[]{
            "#125 ValidPalindrome              org.example.twopointers.P125ValidPalindrome",
            "#167 TwoSumII                     org.example.twopointers.P167TwoSumII",
            "#15  ThreeSum                     org.example.twopointers.P15ThreeSum",
            "#11  ContainerWithMostWater       org.example.twopointers.P11ContainerWithMostWater",
            "#42  TrappingRainWater            org.example.twopointers.P42TrappingRainWater",
        });
        cat("Sliding Window (6)", new String[]{
            "#121 BestTimeToBuyAndSellStock    org.example.slidingwindow.P121BestTimeToBuyAndSellStock",
            "#3   LongestSubstringNoRepeat     org.example.slidingwindow.P3LongestSubstringWithoutRepeatingCharacters",
            "#424 LongestRepeatingCharReplace  org.example.slidingwindow.P424LongestRepeatingCharacterReplacement",
            "#567 PermutationInString          org.example.slidingwindow.P567PermutationInString",
            "#76  MinimumWindowSubstring       org.example.slidingwindow.P76MinimumWindowSubstring",
            "#239 SlidingWindowMaximum         org.example.slidingwindow.P239SlidingWindowMaximum",
        });
        cat("Stack (6)", new String[]{
            "#20  ValidParentheses             org.example.stack.P20ValidParentheses",
            "#155 MinStack                     org.example.stack.P155MinStack",
            "#150 EvaluateReversePolishNotation org.example.stack.P150EvaluateReversePolishNotation",
            "#739 DailyTemperatures            org.example.stack.P739DailyTemperatures",
            "#853 CarFleet                     org.example.stack.P853CarFleet",
            "#84  LargestRectangleInHistogram  org.example.stack.P84LargestRectangleInHistogram",
        });
        cat("Binary Search (7)", new String[]{
            "#704 BinarySearch                 org.example.binarysearch.P704BinarySearch",
            "#74  SearchA2DMatrix              org.example.binarysearch.P74SearchA2DMatrix",
            "#875 KokoEatingBananas            org.example.binarysearch.P875KokoEatingBananas",
            "#153 FindMinRotatedSortedArray    org.example.binarysearch.P153FindMinInRotatedSortedArray",
            "#33  SearchInRotatedSortedArray   org.example.binarysearch.P33SearchInRotatedSortedArray",
            "#981 TimeBasedKeyValueStore       org.example.binarysearch.P981TimeBasedKeyValueStore",
            "#4   MedianOfTwoSortedArrays      org.example.binarysearch.P4MedianOfTwoSortedArrays",
        });
        cat("Linked List (11)", new String[]{
            "#206 ReverseLinkedList            org.example.linkedlist.P206ReverseLinkedList",
            "#21  MergeTwoSortedLists          org.example.linkedlist.P21MergeTwoSortedLists",
            "#141 LinkedListCycle              org.example.linkedlist.P141LinkedListCycle",
            "#143 ReorderList                  org.example.linkedlist.P143ReorderList",
            "#19  RemoveNthNodeFromEnd         org.example.linkedlist.P19RemoveNthNodeFromEnd",
            "#138 CopyListWithRandomPointer    org.example.linkedlist.P138CopyListWithRandomPointer",
            "#2   AddTwoNumbers                org.example.linkedlist.P2AddTwoNumbers",
            "#287 FindTheDuplicateNumber       org.example.linkedlist.P287FindTheDuplicateNumber",
            "#146 LRUCache                     org.example.linkedlist.P146LRUCache",
            "#23  MergeKSortedLists            org.example.linkedlist.P23MergeKSortedLists",
            "#25  ReverseNodesInKGroup         org.example.linkedlist.P25ReverseNodesInKGroup",
        });
        cat("Trees (15)", new String[]{
            "#226 InvertBinaryTree             org.example.trees.P226InvertBinaryTree",
            "#104 MaxDepthOfBinaryTree         org.example.trees.P104MaxDepthOfBinaryTree",
            "#543 DiameterOfBinaryTree         org.example.trees.P543DiameterOfBinaryTree",
            "#110 BalancedBinaryTree           org.example.trees.P110BalancedBinaryTree",
            "#100 SameTree                     org.example.trees.P100SameTree",
            "#572 SubtreeOfAnotherTree         org.example.trees.P572SubtreeOfAnotherTree",
            "#235 LowestCommonAncestorOfBST    org.example.trees.P235LowestCommonAncestorOfBST",
            "#102 LevelOrderTraversal          org.example.trees.P102BinaryTreeLevelOrderTraversal",
            "#199 RightSideView                org.example.trees.P199BinaryTreeRightSideView",
            "#1448 CountGoodNodes              org.example.trees.P1448CountGoodNodesInBinaryTree",
            "#98  ValidateBST                  org.example.trees.P98ValidateBinarySearchTree",
            "#230 KthSmallestInBST             org.example.trees.P230KthSmallestElementInBST",
            "#105 ConstructFromPreorderInorder org.example.trees.P105ConstructBinaryTreeFromPreorderAndInorder",
            "#124 MaxPathSum                   org.example.trees.P124BinaryTreeMaximumPathSum",
            "#297 SerializeDeserialize         org.example.trees.P297SerializeAndDeserializeBinaryTree",
        });
        cat("Tries (3)", new String[]{
            "#208 ImplementTrie                org.example.tries.P208ImplementTrie",
            "#211 AddAndSearchWords            org.example.tries.P211DesignAddAndSearchWordsDataStructure",
            "#212 WordSearchII                 org.example.tries.P212WordSearchII",
        });
        cat("Heap / Priority Queue (7)", new String[]{
            "#703 KthLargestInStream           org.example.heap.P703KthLargestElementInAStream",
            "#1046 LastStoneWeight             org.example.heap.P1046LastStoneWeight",
            "#973 KClosestPointsToOrigin       org.example.heap.P973KClosestPointsToOrigin",
            "#215 KthLargestInArray            org.example.heap.P215KthLargestElementInArray",
            "#621 TaskScheduler                org.example.heap.P621TaskScheduler",
            "#355 DesignTwitter                org.example.heap.P355DesignTwitter",
            "#295 FindMedianFromDataStream     org.example.heap.P295FindMedianFromDataStream",
        });
        cat("Backtracking (10)", new String[]{
            "#78  Subsets                      org.example.backtracking.P78Subsets",
            "#39  CombinationSum               org.example.backtracking.P39CombinationSum",
            "#40  CombinationSumII             org.example.backtracking.P40CombinationSumII",
            "#46  Permutations                 org.example.backtracking.P46Permutations",
            "#90  SubsetsII                    org.example.backtracking.P90SubsetsII",
            "#22  GenerateParentheses          org.example.backtracking.P22GenerateParentheses",
            "#79  WordSearch                   org.example.backtracking.P79WordSearch",
            "#131 PalindromePartitioning       org.example.backtracking.P131PalindromePartitioning",
            "#17  LetterCombinationsPhone      org.example.backtracking.P17LetterCombinationsOfAPhoneNumber",
            "#51  NQueens                      org.example.backtracking.P51NQueens",
        });
        cat("Graphs (13)", new String[]{
            "#200 NumberOfIslands              org.example.graphs.P200NumberOfIslands",
            "#695 MaxAreaOfIsland              org.example.graphs.P695MaxAreaOfIsland",
            "#133 CloneGraph                   org.example.graphs.P133CloneGraph",
            "#286 WallsAndGates                org.example.graphs.P286WallsAndGates",
            "#994 RottenOranges                org.example.graphs.P994RottenOranges",
            "#417 PacificAtlanticWaterFlow     org.example.graphs.P417PacificAtlanticWaterFlow",
            "#130 SurroundedRegions            org.example.graphs.P130SurroundedRegions",
            "#207 CourseSchedule               org.example.graphs.P207CourseSchedule",
            "#210 CourseScheduleII             org.example.graphs.P210CourseScheduleII",
            "#261 GraphValidTree               org.example.graphs.P261GraphValidTree",
            "#323 NumConnectedComponents       org.example.graphs.P323NumberOfConnectedComponents",
            "#684 RedundantConnection          org.example.graphs.P684RedundantConnection",
            "#127 WordLadder                   org.example.graphs.P127WordLadder",
        });
        cat("Advanced Graphs (6)", new String[]{
            "#743 NetworkDelayTime             org.example.advancedgraphs.P743NetworkDelayTime",
            "#332 ReconstructItinerary         org.example.advancedgraphs.P332ReconstructItinerary",
            "#1584 MinCostConnectAllPoints     org.example.advancedgraphs.P1584MinCostToConnectAllPoints",
            "#778 SwimInRisingWater            org.example.advancedgraphs.P778SwimInRisingWater",
            "#269 AlienDictionary              org.example.advancedgraphs.P269AlienDictionary",
            "#787 CheapestFlightsKStops        org.example.advancedgraphs.P787CheapestFlightsWithinKStops",
        });
        cat("1-D Dynamic Programming (12)", new String[]{
            "#70  ClimbingStairs               org.example.dp1d.P70ClimbingStairs",
            "#746 MinCostClimbingStairs        org.example.dp1d.P746MinCostClimbingStairs",
            "#198 HouseRobber                  org.example.dp1d.P198HouseRobber",
            "#213 HouseRobberII                org.example.dp1d.P213HouseRobberII",
            "#5   LongestPalindromicSubstring  org.example.dp1d.P5LongestPalindromicSubstring",
            "#647 PalindromicSubstrings        org.example.dp1d.P647PalindromicSubstrings",
            "#91  DecodeWays                   org.example.dp1d.P91DecodeWays",
            "#322 CoinChange                   org.example.dp1d.P322CoinChange",
            "#152 MaximumProductSubarray       org.example.dp1d.P152MaximumProductSubarray",
            "#139 WordBreak                    org.example.dp1d.P139WordBreak",
            "#300 LongestIncreasingSubsequence org.example.dp1d.P300LongestIncreasingSubsequence",
            "#416 PartitionEqualSubsetSum      org.example.dp1d.P416PartitionEqualSubsetSum",
        });
        cat("2-D Dynamic Programming (11)", new String[]{
            "#62  UniquePaths                  org.example.dp2d.P62UniquePaths",
            "#1143 LongestCommonSubsequence    org.example.dp2d.P1143LongestCommonSubsequence",
            "#309 BuyStockWithCooldown         org.example.dp2d.P309BestTimeToBuyStockWithCooldown",
            "#518 CoinChangeII                 org.example.dp2d.P518CoinChangeII",
            "#494 TargetSum                    org.example.dp2d.P494TargetSum",
            "#97  InterleavingString           org.example.dp2d.P97InterleavingString",
            "#329 LongestIncreasingPathMatrix  org.example.dp2d.P329LongestIncreasingPathInMatrix",
            "#115 DistinctSubsequences         org.example.dp2d.P115DistinctSubsequences",
            "#72  EditDistance                 org.example.dp2d.P72EditDistance",
            "#312 BurstBalloons                org.example.dp2d.P312BurstBalloons",
            "#10  RegularExpressionMatching    org.example.dp2d.P10RegularExpressionMatching",
        });
        cat("Greedy (8)", new String[]{
            "#53  MaximumSubarray              org.example.greedy.P53MaximumSubarray",
            "#55  JumpGame                     org.example.greedy.P55JumpGame",
            "#45  JumpGameII                   org.example.greedy.P45JumpGameII",
            "#134 GasStation                   org.example.greedy.P134GasStation",
            "#846 HandOfStraights              org.example.greedy.P846HandOfStraights",
            "#1899 MergeTripletsToFormTarget   org.example.greedy.P1899MergeTripletsToFormTargetTriplet",
            "#763 PartitionLabels              org.example.greedy.P763PartitionLabels",
            "#678 ValidParenthesisString       org.example.greedy.P678ValidParenthesisString",
        });
        cat("Intervals (6)", new String[]{
            "#57  InsertInterval               org.example.intervals.P57InsertInterval",
            "#56  MergeIntervals               org.example.intervals.P56MergeIntervals",
            "#435 NonOverlappingIntervals      org.example.intervals.P435NonOverlappingIntervals",
            "#252 MeetingRooms                 org.example.intervals.P252MeetingRooms",
            "#253 MeetingRoomsII               org.example.intervals.P253MeetingRoomsII",
            "#1851 MinIntervalIncludeQuery     org.example.intervals.P1851MinimumIntervalToIncludeEachQuery",
        });
        cat("Math & Geometry (8)", new String[]{
            "#48  RotateImage                  org.example.mathgeometry.P48RotateImage",
            "#54  SpiralMatrix                 org.example.mathgeometry.P54SpiralMatrix",
            "#73  SetMatrixZeroes              org.example.mathgeometry.P73SetMatrixZeroes",
            "#202 HappyNumber                  org.example.mathgeometry.P202HappyNumber",
            "#66  PlusOne                      org.example.mathgeometry.P66PlusOne",
            "#50  PowXN                        org.example.mathgeometry.P50PowXN",
            "#43  MultiplyStrings              org.example.mathgeometry.P43MultiplyStrings",
            "#2013 DetectSquares               org.example.mathgeometry.P2013DetectSquares",
        });
        cat("Bit Manipulation (7)", new String[]{
            "#136 SingleNumber                 org.example.bitmanipulation.P136SingleNumber",
            "#191 NumberOf1Bits               org.example.bitmanipulation.P191NumberOf1Bits",
            "#338 CountingBits                 org.example.bitmanipulation.P338CountingBits",
            "#190 ReverseBits                  org.example.bitmanipulation.P190ReverseBits",
            "#268 MissingNumber                org.example.bitmanipulation.P268MissingNumber",
            "#371 SumOfTwoIntegers             org.example.bitmanipulation.P371SumOfTwoIntegers",
            "#7   ReverseInteger               org.example.bitmanipulation.P7ReverseInteger",
        });

        System.out.println("\n--- Total: 150 problems across 17 categories ---");
        System.out.println("Run any problem: mvn exec:java -Dexec.mainClass=<class.path.above>");
    }

    private static void cat(String name, String[] problems) {
        System.out.println("\n== " + name + " ==");
        for (String p : problems) System.out.println("  " + p);
    }
}
