package _20231010;

import java.util.*;

public class programmers_138476 {

    public int solution(int k, int[] tangerine) {
        int answer = 0;

        Map<Integer, Integer> map = new HashMap<>();
        // type, count

        for (int type : tangerine) {
            map.put(type, map.getOrDefault(type, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((t1, t2) ->
            -1 * (t1.getValue() - t2.getValue())
        );

        int index = 0;

        while (k > 0) {
            answer++;

            Map.Entry<Integer, Integer> entry = list.get(index);
            int howMany = entry.getValue();

            if (howMany > k) {
                break;
            } else {
                k = k - howMany;
            }
            index++;
        }

        return answer;
    }

    public static void main(String[] args) {
        programmers_138476 p = new programmers_138476();
        System.out.println(p.solution(6, new int[] {1, 3, 2, 5, 4, 5, 2, 3}));
    }
}
