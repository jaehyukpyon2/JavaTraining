package _20231018;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("신용권", 85);
        map.put("홍길동", 90);
        map.put("동장군", 80);
        map.put("홍길동", 95);
        // 홍길동이라는 hashcode / equals가 같은 객체를 key 값으로 중복저장하면 나중에 저장한 값으로 덮어 씌워진다.

        System.out.println("총 Entry 수: " + map.size());
        System.out.println();

        String key = "홍길동";
        int value = map.get(key);
        System.out.println(key + ": " + value);
        System.out.println();

        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();

        while (keyIterator.hasNext()) {
            String k = keyIterator.next();
            Integer v = map.get(k);
            System.out.println(k + ": " + v);
        }
        System.out.println();

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()) { // 다음 요소가 있는지 체크
            Map.Entry<String, Integer> entry = entryIterator.next(); // 요소 받아와서
            String k = entry.getKey(); // 키값 가져오고
            Integer v = entry.getValue(); // value값 가져오고
            System.out.println(k + " : " + v);
        }
        System.out.println();

        map.remove("홍길동"); // 키값으로 홍길동을 map에서 삭제.
        System.out.println("총 entry 수: " + map.size());
        System.out.println();
    }
}
