//Problem: return true if n is a happy number else return false;
//link: https://leetcode.com/problems/happy-number/
//Source: LeetCode(202)
//Topics: HashSet;
//Diff: Easy done

import java.util.HashSet;

public class HappyNumber {
    //2ms, 18.38;
    //40.84 MB, 51.11;
    static boolean isHappy(int n) {
        int sum = 0;
        int temp = n;
        HashSet<Integer> set = new HashSet<Integer>();
        while (true) {
            int x = digits(temp, set, sum);
            if (x == 1) return true;
            if (set.contains(x)) return false;
            set.add(x);
            temp = x;
        }
    }
    private static int digits(int n, HashSet<Integer> set, int sum) {
        while (n > 0) {
            int rem = n % 10;
            int sq = rem*rem;
            sum += sq;
            n = (n-rem) / 10;
        }
        return sum;
    }
}
