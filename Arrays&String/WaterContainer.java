//Problem: give the maximum area of the given array
//link: https://leetcode.com/problems/container-with-most-water/?envType=study-plan-v2&envId=top-interview-150
//Source: LeetCode(11)
//Topics: Arrays
//Diff: Med - done with soln

public class WaterContainer {
    public static int maxArea(int[] height) {
        //Time Limit exceeded
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < height.length; i++) {
                for (int j = i; j < height.length; j++) {
                    int prod = (j-i)*Math.min(height[i],height[j]);
                    res = Math.max(prod, res);
            }
        }
        return res;
    }

    static int optimized(int[] height) {
        //4ms, 91   
        int left = 0, right = height.length - 1;
        int MaxArea = Integer.MIN_VALUE;
        while (left < right) {
            int width = right - left;
            int prod = width*(Math.min(height[left], height[right]));
            MaxArea = Math.max(prod, MaxArea);
            if (height[left] > height[right]) {
                right--;
            }else {
                left++;
            }
        }
        return MaxArea;
    }
    public static void main(String[] args) {
        int[] h = {1,1};
        System.out.println(optimized(h));
    }
}
