package ArraysAndStrings;

import java.util.Arrays;

public class RotateMatrix {
    public static int[][] rotate(int[][] a) {
        int len = a.length;
        for(int i = 0; i<len/2; i++) {
            for(int j = 0; j< len-1; j++) {
                int temp = a[i+j][i];
                a[i+j][i] = a[len-i-1][i+j];
                a[len-i-1][i+j] = a[len-i-1-j][len-i-1];
                a[len-i-1-j][len-i-1] = a[i][len-i-1-j];
                a[i][len-i-1-j] = temp;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int[][] a = {{1,2,3}, {4,5,6}, {7,8,9}};
        a = rotate(a);
        for(int[] i : a) {
            for(int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
