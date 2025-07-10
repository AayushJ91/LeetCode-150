//Problem: return the element (majority element) that appears more than n / 2 times. where n is total elements in array;
//link: https://leetcode.com/problems/majority-element/?envType=study-plan-v2&envId=top-interview-150
//Source: LeetCode(169)
//Topics: HashMap
//Diff: Easy

import java.util.HashMap;
import java.util.Map;

public class MajorityEle {
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if (freq.containsKey(nums[i])) {
                freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
            }else {
                freq.put(nums[i], 1);
            }
        }
        System.out.println(freq);
        int n = 0;
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > nums.length / 2) {
                n = entry.getKey();
            }
        }
        return n;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,1,1};
        System.out.println(majorityElement(arr));
    }
}
