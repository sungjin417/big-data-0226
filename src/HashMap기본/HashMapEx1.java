package HashMap기본;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// HashMap : 순서를 보장하지 않음, 키와 값으로 구성
public class HashMapEx1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("우영우", 99 );
        map.put("동그라미", 55);
        map.put("최수연", 95);
        map.put("이준호", 80);
        map.put("동그라미", 70); // 키 값이 같기 때문에 나중에 저장된 값으로 대치(값이 하나만 저장됨)
        System.out.println("총 Entry 수 : " + map.size());
        System.out.println(map.get("동그라미")); // 객체 찾기
        // 반복자 사용 (iterator)
        Set<String> keySet = map.keySet(); // 모든 키를 Set 객체에 담음
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            Integer value = map.get(key);
            System.out.println(key + " " + value);
        }
        for(String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }

    }
}
