package Set인터페이스;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
// Set 인터페이스 : 중복을 허용하지 않음
// HashSet 클래스 : 순서 유지를 하지 않음, 중복 허용하지 않음, 집합의 개념
public class HashSetBasicEx {
    public static void main(String[] args) {
//        String[] data = {"H", "e", "l", "l", "o"}; // 중복허용하지 않기 때문에 "l"이 하나 빠짐
//        HashSet<String> set = new HashSet<>(Arrays.asList(data));
//        System.out.println(set);
        HashSet<String> set = new HashSet<>();
        set.add("Java");
        set.add("C");
        set.add("C++");
        set.add("Python");
        set.add("Java"); // 중복 허용 X

        for (String e : set) System.out.println(e + " ");

    }
}
