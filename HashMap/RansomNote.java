//Problem: return true if ransomNote can be constructed by using letters from magazine;
//link: https://leetcode.com/problems/ransom-note/?envType=study-plan-v2&envId=top-interview-150
//Source: LeetCode (383)
//Topics: HashMap
//Diff: Easy done by soln

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        //Time: 14 ms, beats 29;
        //Space: 45.35 MB, beats 27;
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        HashMap<Character, Integer> freq = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            if (freq.containsKey(magazine.charAt(i))) {
                freq.put(magazine.charAt(i), freq.getOrDefault(magazine.charAt(i), 0) + 1);
            }else {
                freq.put(magazine.charAt(i), 1);
            }
        }
        System.out.println(freq);
        for (int i = 0; i < ransomNote.length(); i++) {
            if (freq.containsKey(ransomNote.charAt(i))) {
                if (freq.get(ransomNote.charAt(i)) > 1) {
                    freq.put(ransomNote.charAt(i), freq.get(ransomNote.charAt(i)) - 1);
                }
                else {
                    freq.remove(ransomNote.charAt(i));
                }
            }else {
                return false;
            }
        }
        return true;
    }

    public static boolean canConstruct1(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        Map<Character, Integer> freq = new HashMap<>();

        for (char c : ransomNote.toCharArray()) {
            if (freq.containsKey(c)) {
                freq.put(c, freq.getOrDefault(c, 0) + 1);
            }else {
                freq.put(c, 1);
            }
        }
        System.out.println(freq);
        for (char c : magazine.toCharArray()) {
            if (freq.containsKey(c)) {
                if (freq.get(c) > 1) {
                    freq.put(c, freq.get(c) - 1);
                } else {
                    freq.remove(c);
                }
            }else {
                return true;
            }
        }
        return !freq.isEmpty();
    }

    public static boolean canConstruct2(String ransomNote, String magazine) {
        //done by soln
        int[] alpha = new int[26];
        for (char c : magazine.toCharArray()) {
            alpha[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            if (alpha[c - 'a'] == 0) return false;
            alpha[c - 'a']--;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(canConstruct2("aa", "aab"));
    }
}
