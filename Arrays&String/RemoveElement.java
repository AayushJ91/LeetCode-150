//Problem: remove the specified element from the arrays;
//link: https://leetcode.com/problems/remove-element/?envType=study-plan-v2&envId=top-interview-150
//Source: LeetCode (27)
//Topics: Arrays
//Diff: Easy

import java.io.FilterOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        //Time: 0ms best;
        //Space: 42.18 MB, beats 30;
        int k = nums.length;
        ArrayList<Integer> extra = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                k--;
            }else {
                extra.add(nums[i]);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (i < k) {
                nums[i] = extra.get(i);
            }else {
                nums[i] = val;
            }
        }
        return k;
    }

    public static void swap(int[] arr, int n, int m) {
        int temp = arr[n];
        arr[n] = arr[m];
        arr[m] = temp;
    }
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        System.out.println(removeElement(nums, 2));
    }
}
