package ArraysAndStrings;


public class OneEditAway {
    public static boolean oneAway(String a , String b) {
        if(Math.abs(a.length()-b.length()) > 1) return false;
        return a.length() >= b.length() ? help(a,b) : help(b,a);
    }
    //a.len >= b.len
    public static boolean help(String a, String b) {
        int i = 0, j = 0, c = 0;
        while(j < b.length()) {
            if(c > 1) return false;
            if(a.charAt(i) == b.charAt(j)) {
                i++;j++;
                continue;
            } else {
                c++;
                if(a.length() == b.length()) {
                    i++;j++;
                } else {
                    i++;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(oneAway("pale","ple"));
        System.out.println(oneAway("pale","bake"));
    }
}
