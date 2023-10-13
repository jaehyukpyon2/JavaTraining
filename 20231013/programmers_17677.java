package _20231013;

import java.util.ArrayList;
import java.util.List;

public class programmers_17677 {

    public int solution(String str1, String str2) {
        List<String> s1List = new ArrayList<>();
        List<String> s2List = new ArrayList<>();

        List<String> intersection = new ArrayList<>();
        List<String> union = new ArrayList<>();

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        for (int i = 0; i < str1.length() - 1; i++) {
            char c1 = str1.charAt(i);
            char c2 = str1.charAt(i + 1);
            if ((c1 >= 'a' && c1 <= 'z') && (c2 >= 'a' && c2 <= 'z')) {
                s1List.add("" + c1 + c2);
            }
        }
        for (int i = 0; i < str2.length() - 1; i++) {
            char c1 = str2.charAt(i);
            char c2 = str2.charAt(i + 1);
            if ((c1 >= 'a' && c1 <= 'z') && (c2 >= 'a' && c2 <= 'z')) {
                s2List.add("" + c1 + c2);
            }
        }
        if (s1List.size() == 0 && s2List.size() == 0) {
            return 1 * 65536;
        }

        for (String temp : s1List) {
            if (s2List.contains(temp)) {
                intersection.add(temp);
                s2List.remove(temp);
            }
            union.add(temp);
        }
        for (String s2Temp : s2List) {
            union.add(s2Temp);
        }

        double denominator = union.size();
        double numerator = intersection.size();
        if (denominator == 0) {
            return 1 * 65536;
        }

        return (int)((numerator / denominator) * 65536);
    }

    public static void main(String[] args) {
        /*String str1 = "AB  C#$B #  BS ";
        System.out.println(str1.replaceAll("[^A-Z^a-z]+", ""));*/

        programmers_17677 p = new programmers_17677();

        //System.out.println(p.solution("FRANCE", "french"));
        //System.out.println(p.solution("handshake", "shake hands"));
        System.out.println(p.solution("aa1+aa2", "AAAA12"));
        //System.out.println(p.solution("E=M*C^2", "e=m*c^2"));
    }
}
