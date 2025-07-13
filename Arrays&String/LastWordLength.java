//Problem: return the length of the last word;
//link: https://leetcode.com/problems/length-of-last-word/description/?envType=study-plan-v2&envId=top-interview-150
//Source: LeetCode(58)
//Topics: String
//Diff: Easy-done

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LastWordLength {
    public static int lengthOfLastWord(String s) {
        s = s.trim();
        if (!s.contains(" ")) {
            return s.length();
        }
        List<String> list = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            System.out.println("i:"+i);
            if (s.charAt(i) == ' ') {
                list.add(str.toString());
                str.setLength(0);
            }
            str.append(s.charAt(i));
            System.out.println(list);
            System.out.println(str);
        }
        list.add(str.toString());
        System.out.println("list ou loop:"+list);
        return list.getLast().length();
    }

    public static int length(String s) {
        s = s.trim();
        int len = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' '){
                break;
            }
            len++;
        }
        return len;
    }

    public static void main(String[] args) {
        String s = "abchd";
        System.out.println(length(s));
    }
}
