package _20231016;

import java.util.StringTokenizer;

public class StringTokenizerExample {

    public static void main(String[] args) {
        String str1 = "a b c d e ";
        String[] split1 = str1.split(" "); // 5개: a, b, c, d, e
        System.out.println();

        String str2 = " a b c d e ";
        String[] split2 = str2.split(" "); // 6: "", a, b, c, d, e
        System.out.println();

        StringTokenizer stk = new StringTokenizer(str2, " ");
        while (stk.hasMoreTokens()) {
            System.out.println(stk.nextToken());
            System.out.println("-----");
        }
        System.out.println("=====");
    }
}
