//Problem: given a number array which is sorted. return the indices numbers whose sum is target;
//link: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
//Source: LeetCode(167)
//Topics: Two Pointers
//Diff: Med-done

public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        // best;
        //47.10 MB, 79.82;
        int small = 0;
        int lar = numbers.length - 1;
        while (small < lar) {
            if (numbers[lar] + numbers[small] > target) {
                lar--;
            }else if (numbers[lar] + numbers[small] < target) {
                small++;
            }else{
                return new int[] {small+1, lar+1};
            }
        }
        return null;
    }
}
