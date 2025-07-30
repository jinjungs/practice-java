package org.example.interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Interview_250728 {
   /*
        Given an array of integers find a pair arr[i], arr[j] such arr[i]+arr[j] = target where i!=j

        input - [2,5,4,1,8,4,5,3]
        target = 9
        output = 1, 2

        input - [6,2,1,8,5,3]
        target = 5
        output = 1,5
    */
    public static List twoSum(List<Integer> nums, int target) {
        int n = nums.size();

        // brute force
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if (nums.get(i) + nums.get(j) == target) {
                    return Arrays.asList(i,j);
                }
            }
        }

        // using hashmap
        // key: value, value: index
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i=0; i<n; i++) {
            int val = nums.get(i);
            if (!h.containsKey(val)) {
                h.put(val, i);
            }
        }

        for(int i=0; i<n ; i++) {
            int rest = target - nums.get(i);
            if (h.containsKey(rest)) {
                return Arrays.asList(i, h.get(rest));
            }
        }

        return null;

    }

    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(2,5,4,1,8,4,5,3);
        int target = 9;
        List<Integer> res = twoSum(l,target);
        System.out.println(res);
    }
}
