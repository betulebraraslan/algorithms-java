/**
 * Problem:
 * Given an unsorted integer array, return the length
 * of the longest consecutive sequence of integers.
 *
 * A consecutive sequence consists of numbers that follow
 * each other without gaps.
 *
 * The algorithm must run in O(n) time.
 *
 * Return the length of the longest consecutive sequence.
 *
 * Example:
 *
 * Input:
 * [100, 4, 200, 1, 3, 2]
 * Output:
 * 4
 *
 * Explanation:
 * The longest consecutive sequence is [1, 2, 3, 4].
 *
 * Input:
 * [0, 3, 7, 2, 5, 8, 4, 6, 0, 1]
 * Output:
 * 9
 *
 * Explanation:
 * The longest consecutive sequence is
 * [0, 1, 2, 3, 4, 5, 6, 7, 8].
 *
 * Data Structure:
 * - HashSet<Integer>
 *
 * Time Complexity:
 * O(n)
 *
 * Space Complexity:
 * O(n)
 */

import java.util.*;

public class LongestConsecutiveSequence{
    
    public static int longestSequence(int[] nums){
        HashSet<Integer> numbers = new HashSet<>();
        for(int num : nums){
            numbers.add(num);
        }

        int max = 0;
        for(int current : numbers){
            if(!numbers.contains(current-1)){
                
                int count = 1;
                int currentNumber = current;

                while(numbers.contains(currentNumber+1)){
                    count++;
                    currentNumber++;
                }

                if(count > max){
                max = count;
                }
            } 
        }
        return max;
    }

    public static void main(String[] args){
        int[] nums1 = {100, 4, 200, 1, 3, 2};
        System.out.println(longestSequence(nums1)); 
        // 4
        
        int[] nums2 = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        System.out.println(longestSequence(nums2));
        // 9


        int[] nums3 = {10};
        System.out.println(longestSequence(nums3));
        // 1
    }
    
}