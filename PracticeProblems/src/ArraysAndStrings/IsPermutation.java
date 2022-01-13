package ArraysAndStrings;

import java.util.HashMap;

public class IsPermutation {
    public static boolean isAnagram(String a, String b) {
        if(a.length() != b.length()) return false;
        HashMap<Character, Integer> ma = hash(a);
        HashMap<Character, Integer> mb = hash(b);
        return equal(ma, mb);
    }
    public static boolean equal(HashMap<Character,Integer> a, HashMap<Character, Integer> b) {
        for(char c : a.keySet()) {
            if(!b.containsKey(c) || a.get(c) != b.get(c)) return false;
        }
        return true;
    }
    public static HashMap<Character, Integer> hash(String s) {
        HashMap<Character, Integer> res = new HashMap<>();
        for(char c : s.toCharArray()) {
            res.put(c, res.getOrDefault(c,0) + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("wolf", "flow"));
        System.out.println(isAnagram("hello", "helll"));
    }
}
