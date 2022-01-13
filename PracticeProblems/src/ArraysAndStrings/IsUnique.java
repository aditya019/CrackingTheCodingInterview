package ArraysAndStrings;

import java.util.*;

public class IsUnique {
    public static boolean isUnique(String s) {
        HashSet<Character> set = new HashSet<>();
        for(char c : s.toCharArray()) {
            if(set.contains(c)) return false;
            else set.add(c);
        }
        return true;
    }
    public static boolean isUniqueWDS(String s) {
        for(int i = 0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(s.indexOf(c) != i) return false;
        }
        return true;
    }
    //can be used if and only if the string consists of lowercase alphabets
    public static boolean isUniqueBitVector(String s) {
        if(s.length() > 26) return false;
        int bitVector = 0;
        for(char c : s.toCharArray()) {
            int curr = c - 'a';
            int cvalue = 1<<curr;
            if((bitVector & cvalue) > 0) return false;
            bitVector = bitVector | cvalue;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isUniqueBitVector("adity"));
        System.out.println(isUniqueBitVector("asdfghjsl"));
    }
}
