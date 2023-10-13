package _20231012;

import java.util.*;
import java.util.stream.*;

public class programmers_42747 {

    public static int solution(int[] citations) {
        Integer[] intArr = Arrays.stream(citations)
                .boxed()
                .toArray(Integer[]::new);

        Arrays.sort(intArr, (a, b) -> -1 * (a - b));

        int totalCount = citations.length;

        for (int i = 0; i < citations.length; i++) {
            int num = intArr[i];
            boolean greaterThan = (i - 0 + 1) >= num;
            if (greaterThan) {
                return num;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[] {3, 0, 6, 1, 5}));
        System.out.println(solution(new int[] {77, 6, 5, 5, 4, 2, 1, 0, 0, 0}));
    }
}
