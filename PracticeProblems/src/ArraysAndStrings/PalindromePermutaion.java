package ArraysAndStrings;

import java.util.HashMap;
import java.util.Map;

public class PalindromePermutaion {
    public static boolean isPermutationPalindrome(String s) {
        Map<Character, Integer> map = mapper(s);
        int c = 0;
        for(char ch : map.keySet()) {
            if(map.get(ch) % 2 == 1) {
                c++;
            }
            if(c > 1) return false;
        }
        return true;
    }
    private static Map<Character, Integer> mapper(String s) {
        Map<Character, Integer> res = new HashMap<>();
        for(char c : s.toCharArray()) {
            if(c == ' ') continue;
            res.put(c, res.getOrDefault(c,0)+1);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(isPermutationPalindrome("tact coa"));
        System.out.println(isPermutationPalindrome("tact coa aditya"));
        System.out.println(isPermutationPalindrome("malayalam"));
    }
}
