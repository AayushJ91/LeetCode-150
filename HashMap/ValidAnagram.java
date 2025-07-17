import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    static boolean isAnagram(String s, String t) {
        //20 ms; 11.24;
        //44.66 MB, 43.04;
        if (s.length() != t.length()) return false;
        Map<Character, Integer> freq = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            freq.put(s.charAt(i), freq.getOrDefault(s.charAt(i), 0)+1);
        }
        for (int i = 0; i < t.length(); i++){
            if (freq.containsKey(t.charAt(i))) {
                if (freq.get(t.charAt(i)) == 1){
                    freq.remove(t.charAt(i));
                }else {
                    freq.put(t.charAt(i), freq.get(t.charAt(i)) - 1);
                }
            }
        }
        return freq.isEmpty();
    }

    static boolean optimized(String s, String t) {
        char[] S = s.toCharArray();
        char[] T = t.toCharArray();
        Arrays.sort(S);
        Arrays.sort(T);
        return Arrays.equals(S,T);
    }
    public static void main(String[] args) {
        System.out.println(optimized("anagram", "nagaram"));
    }
}
