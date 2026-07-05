/**
 * Problem:
 * Given an array of integers and a target value,
 * return the indices of the two numbers whose sum equals the target.
 *
 * Example:
 * Input:
 * nums = [2, 7, 11, 15]
 * target = 9
 *
 * Output:
 * [0, 1]
 *
 * Data Structure:
 * - HashMap
 *
 * Time Complexity:
 * O(n)
 *
 * Space Complexity:
 * O(n)
 */

import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        System.out.println(result[0] + " " + result[1]);
    }
}