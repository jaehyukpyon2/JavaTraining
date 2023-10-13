package _20231012;

import java.util.*;

public class programmers_17680 {

    public boolean isCached(List<String> list, String target, int limit) {
        if (limit == 0) {
            return false;
        }

        int currentIndex = -1;

        if ((currentIndex = list.indexOf(target)) < 0) {
            if (list.size() >= limit) {
                list.remove(0);
                list.add(target);
            } else {
                list.add(target);
            }
            return false;
        } else {
            list.remove(currentIndex);
            list.add(target);
            return true;
        }
    }

    public int solution(int cacheSize, String[] cities) {
        int answer = 0;

        List<String> list = new ArrayList<>();

        for (int i = 0; i < cities.length; i++) {
            if (isCached(list, cities[i], cacheSize)) {
                answer += 1;
            } else {
                answer += 5;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        programmers_17680 p = new programmers_17680();
    }
}
