package com.company;
//Given an array nums of size n, return the majority element.
//The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] nums = new int[] {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }


    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> numMap = new HashMap<>();
        for (Integer number : nums) {
            if (numMap.containsKey(number)) {
                int count = numMap.get(number);
                count++;
                numMap.put(number, count);
            } else {
                numMap.put(number, 1);
            }

            for (Integer key : numMap.keySet()) {
                int value = numMap.get(key);

                int size = nums.length / 2;
                if (value > size) {
                    return key;
                }


            }

        }

        return 0;
    }


}
