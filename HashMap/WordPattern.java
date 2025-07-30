//Problem: Given a pattern and a string s, find if s follows the same pattern.
//link: https://leetcode.com/problems/word-pattern/
//Source: LeetCode(290)
//Topics: HashMap
//Diff: Easy done

import java.util.*;

public class WordPattern {
    //1ms; 80;
    //41.36 MB; 83;
    static boolean naive(String pattern, String s) {
        String[] mySplit = s.split(" ");
        if (mySplit.length != pattern.length()) {
            return false;
        }
        HashMap<Character, String> guide = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            if (guide.containsKey(pattern.charAt(i)) && (!Objects.equals(guide.get(pattern.charAt(i)), mySplit[i]))) {
                return false;
            }
            guide.put(pattern.charAt(i), mySplit[i]);
        }
        HashSet<String> set = new HashSet<>();
        for (Map.Entry<Character, String> entry : guide.entrySet()) {
            if (set.contains(entry.getValue())) {
                return false;
            }
            set.add(entry.getValue());
        }
        System.out.println(guide);
        return true;
    }

    public static void main(String[] args) {
        System.out.println(naive("abba", "dog cat cat fish"));
    }
}
