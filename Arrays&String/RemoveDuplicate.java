//Problem: remove the specified element from the arrays;
//link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/?envType=study-plan-v2&envId=top-interview-150
//Source: LeetCode (26)
//Topics: Arrays
//Diff: Easy

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicate {
    public static int removeDuplicate1(int[] nums) {
        //Time: 24ms worst;
        //Space: 45.21 MB worst;
        ArrayList<Integer> check = new ArrayList<>();
        check.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if (!check.contains(nums[i])) {
                check.add(nums[i]);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (i < check.size()) {
                nums[i] = check.get(i);
            }else {
                nums[i] = -998;
            }
        }
        System.out.println(Arrays.toString(nums));
        return check.size();
    }

    public static int removeDuplicate2(int[] nums){
        //Time: 11ms worst;
        //Space: 44.83 MB appreciatable;
        int pos = 0, ptr = 1, k = 0;
        while (pos < nums.length && ptr < nums.length) {
            if (nums[ptr] <= nums[pos]) {
                ptr++;
            }else {
                pos++;
                nums[pos] = nums[ptr];
                ptr = pos + 1;
                k++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return k+1;
    }

    public static int removeDuplicate3(int[] nums){
        //Time: 0ms best;
        //Space: 40 MB appreciatable;
        int numPos = 1;
        int pos = 1;
        int k = 1;
        int[] clone = nums;
        nums[0] = clone[0];
        while (numPos < nums.length ) {
            if (clone[numPos] != nums[pos - 1]) {
                nums[pos] = clone[numPos];
                pos++;
                k++;
            }
            numPos++;
        }
        System.out.println(Arrays.toString(nums));
        return k;
    }

    public static int removeDuplicate4(int[] nums){
        int i = 1, j = 1;
        int k = 1;
        while (j < nums.length) {
            if (nums[i - 1] != nums[j]) {
                nums[i] = nums[j];
                i++;
            }
            j++;
        }
        System.out.println(Arrays.toString(nums));
        return i;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicate4(nums));
    }
}
