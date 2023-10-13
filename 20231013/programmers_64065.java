package _20231013;

import java.util.*;

public class programmers_64065 {

    // 튜플 tuple...

    public int[] solution(String s) {
        s = s.substring(1, s.length() - 1);
        s = s.replace("},{", "-");
        s = s.replaceAll("[\\{\\}]", "");
        String[] split = s.split("-");
        // System.out.println(s);

        List<List<Integer>> list = new ArrayList<>();

        for (String temp : split) {
            String[] split2 = temp.split(",");
            List<Integer> tempList = new ArrayList<>();
            for (String temp2 : split2) {
                tempList.add(Integer.parseInt(temp2));
            }
            list.add(tempList);
        }

        Collections.sort(list, (a, b) -> {
            return a.size() - b.size();
        });

        List<Integer> answerList = new ArrayList<>();

        for (List<Integer> temp : list) {
            for (int i : temp) {
                if (!answerList.contains(i)) {
                    answerList.add(i);
                }
            }
        }

        int[] answer = new int[answerList.size()];
        int index = 0;
        for (int i : answerList) {
            answer[index++] = i;
        }

        return answer;
    }

    public static void main(String[] args) {
        programmers_64065 p = new programmers_64065();
        System.out.println(Arrays.toString(p.solution("{{2},{2,1},{2,1,3},{2,1,3,4}}")));
        System.out.println(Arrays.toString(p.solution("{{1,2,3},{2,1},{1,2,4,3},{2}}")));
        System.out.println(Arrays.toString(p.solution("{{20,111},{111}}")));
        System.out.println(Arrays.toString(p.solution("{{123}}")));
        System.out.println(Arrays.toString(p.solution("{{4,2,3},{3},{2,3,4,1},{2,3}}")));
    }
}
