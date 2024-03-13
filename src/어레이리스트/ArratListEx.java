package 어레이리스트;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// List 인터페이스 : ArrayList, Vector, LinkedList 의 부모 인터페이스
// List의 특징은 배열과 유사하지만, 동적으로 크기가 변화한다.
// - 요소의 저장 순서 유지
// - 중복 저장 허용
// - 여러가지 메소드 제공
public class ArratListEx {
    public static void main(String[] args) {
        // asList() 배열을 List로 변환하기 위해 사용
        String[] data = {"138", "129", "142"};
        List<String> pitches = new ArrayList<>(Arrays.asList(data));
        pitches.add(3,"123"); // 중간에 추가할 경우 index로 위치정해 삽입
        System.out.println(pitches);
//        pitches.add("138"); // 리스트에 값 추가
//        pitches.add("129");
//        pitches.add("142");
//        System.out.println(pitches);
//        String one = pitches.get(0); // 해당 인덱스의 값을 가져 옴
//        String two = pitches.get(1);
//        System.out.println(one + " , " + two);
    }
}
