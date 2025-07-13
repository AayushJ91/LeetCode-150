//Problem: merge the 2 sorted arrays num1 and num2 into num1 in a sorted manner;
//link: https://leetcode.com/problems/merge-sorted-array/?envType=study-plan-v2&envId=top-interview-150
//Source: LeetCode (88)
//Topics: Arrays
//Diff: Easy - have to do in bettr way

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        //3ms; beats 4.11;
        //42.56 MB, beats 15;
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

    static void optimised(int[] nums1, int m, int[] nums2, int n) {
        int bigNum1 = m+n-1;
        int bigNum2 = n - 1;

        while (bigNum2 != -1) {
            if (nums2[bigNum2] > nums1[bigNum1]) {
                nums1[bigNum1] = nums2[bigNum2];
            }
            bigNum1--;bigNum2--;
        }
        System.out.println(Arrays.toString(nums1));
    }


    public static void main(String[] args) {
        int[] num1 = {1,2,3,0,0,0};
        int[] num2 = {2,5,6};
        optimised(num1, 3, num2, 3);
    }
}
