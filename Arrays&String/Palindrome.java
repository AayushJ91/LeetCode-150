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
