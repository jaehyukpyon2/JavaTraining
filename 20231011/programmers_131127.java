package _20231011;

import java.util.HashMap;
import java.util.Map;

public class programmers_131127 {

    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        HashMap<String, Integer> originalMap = new HashMap<>();

        int index = 0;
        int totalNum = 0;

        for (String product : want) {
            int num = number[index++];
            originalMap.put(product, num);
            totalNum += num;
        }

        int lastIndex = discount.length - 1;
        outerFor: for (int i = 0; (lastIndex - i) >= 9; i++) {
            Map<String, Integer> cloned = (HashMap<String, Integer>) originalMap.clone();
            int startIndex = i;
            int currentTotal = 0;
            for (int j = i; j <= startIndex + 9; j++) {
                int minus = cloned.getOrDefault(discount[j], -1);
                if (minus == -1 || minus <= 0) {
                    continue outerFor;
                }
                cloned.put(discount[j], cloned.get(discount[j]) - 1);
                currentTotal += 1;
            }
            if (currentTotal == totalNum) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        programmers_131127 p = new programmers_131127();

        String[] want1 = {"banana", "apple", "rice", "pork", "pot"};
        int[] number1 = {3, 2, 2, 2, 1};
        String[] discount1 = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};

        System.out.println(p.solution(want1, number1, discount1));

        /*HashMap<String, Integer> map = new HashMap<>();
        map.put("test1", 10);

        HashMap<String, Integer> cloned = (HashMap<String, Integer>) map.clone();

        map.put("test1", 20);
        System.out.println(cloned.get("test1"));*/


    }
}
