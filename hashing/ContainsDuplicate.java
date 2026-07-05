/**
 * Problem:
 * Given an integer array, determine whether any value appears
 * at least twice in the array.
 *
 * Return true if any duplicate exists,
 * otherwise return false.
 *
 * Example:
 *
 * Input:
 * [1, 2, 3, 1]
 * Output:
 * true
 *
 * Input:
 * [1, 2, 3, 4]
 * Output:
 * false
 *
 * Input:
 * [5, 5, 5, 5]
 * Output:
 * true
 *
 * Data Structure:
 * - HashSet
 *
 * Time Complexity:
 * O(n)
 *
 * Space Complexity:
 * O(n)
 */

import java.util.*;

public class ContainsDuplicate{
    public boolean containsDuplicate(int[] nums){
        HashSet<Integer> seen = new HashSet<>();
        for(int num : nums){
            if(!seen.add(num)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate cd = new ContainsDuplicate();

        System.out.println(cd.containsDuplicate(new int[]{1,2,3,1})); // true
        System.out.println(cd.containsDuplicate(new int[]{1,2,3,4})); // false
    }
}
