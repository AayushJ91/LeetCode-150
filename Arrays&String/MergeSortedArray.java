//Problem: merge the 2 sorted arrays num1 and num2 into num1 in a sorted manner;
//link: https://leetcode.com/problems/merge-sorted-array/?envType=study-plan-v2&envId=top-interview-150
//Source: LeetCode (88)
//Topics: Arrays
//Diff: Easy

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[m+n];
        int i=0,j=0,k=0;
        while (i<m && j<n){
            if (nums1[i] <= nums2[j]) {
                arr[k] = nums1[i];
                i++;
            }if (nums1[i] > nums2[j]) {
                arr[k] = nums2[j];
                j++;
            }
            k++;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] num1 = {1,2,3,0,0,0};
        int[] num2 = {2,5,6};
        merge(num1, 3, num2, 3);
    }
}
