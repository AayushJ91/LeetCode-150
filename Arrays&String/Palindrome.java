//Problem: check whether the string is a palindrome or not. it should contain AlphaNumeric key;
//link: https://leetcode.com/problems/valid-palindrome/?envType=study-plan-v2&envId=top-interview-150
//Source: LeetCode (26)
//Topics: Arrays
//Diff: Easy

public class Palindrome {
    public static boolean isPalindrome(String s) {
        //Time: 13 ms, beats 42.09;
        //Space: 44.78 MB, beats 44.12;
        String clean = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(clean);
        for (int i = 0; i < clean.length(); i++) {
            if (clean.charAt(i) != clean.charAt(clean.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("1A man, a plan, a canal: Panama1"));
    }
}
