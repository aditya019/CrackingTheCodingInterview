package ArraysAndStrings;

public class StringCompression {
    public static String stringCompression(String s) {
        StringBuilder sb = new StringBuilder();
        int i = 0, len = s.length();
        while(i < len) {
            char ch = s.charAt(i);
            int j = i+1, c = 1;
            while(j < len && s.charAt(j) == ch) {
                c++;
                j++;
            }
            i = j;
            sb.append(ch).append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(stringCompression("aaabbccccaa"));
        System.out.println(stringCompression("aaaabb"));
    }
}
