package _20231012;

import java.util.Arrays;

public class programmers_42747_wrong {

    public static int solution(int[] citations) {
        Integer[] intArr = Arrays.stream(citations)
                .boxed()
                .toArray(Integer[]::new);

        Arrays.sort(intArr, (a, b) -> -1 * (a - b));
        int totalCount = intArr.length;

        outerFor: for (int i = totalCount; i >= 0; i--) {
            int j = 0;
            for (j = 0; j < totalCount; j++) {
                if (!(intArr[j] >= i)) {
                    int indexMinusOne = j - 1;
                    int leftCount = indexMinusOne + 1 - 0;

                    if (leftCount >= i) {
                        return i;
                    } else {
                        continue outerFor;
                    }
                }
            }
            if (j == totalCount) {
                return i;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[] {3, 0, 6, 1, 5}));
        System.out.println(solution(new int[] {77, 6, 5, 5, 4, 2, 1, 0, 0, 0}));
        System.out.println(solution(new int[] {0, 1, 2, 2, 2}));
        System.out.println(solution(new int[] {3, 4}));
    }
}
