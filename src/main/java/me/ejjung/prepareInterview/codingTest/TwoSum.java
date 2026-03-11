package me.ejjung.prepareInterview.codingTest;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5};
        int target = 7;

        int[] answer = twoSum(nums, target);
        for (int ele: answer) {
            System.out.println(ele);
        }

    }

    public static int[] twoSum(int[] nums, int target) {
        // key: number, value: index
        Map<Integer, Integer> map = new HashMap();

        for (int i=0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }

        // No solution found (problem guarantees one solution)
        return new int[]{-1, -1};
    }

}
