package ArraysAndStrings;

public class URLify {
    public static String url(String s) {
        StringBuilder sb = new StringBuilder();
        s = s.trim();
        for (char c : s.toCharArray()) {
            if(c != ' ') sb.append(c);
            else sb.append("%20");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(url("hey this is aditya"));
    }
}
