package 스트림기본;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 스트림의 동작은 생성 -> 중간 연산 -> 최종 연산
public class StreamEx1 {
    public static void main(String[] args) {
        Integer [] arr = {1,2,3,4,5,6,7,8,9,10};
        List<Integer> aList = new ArrayList<>(Arrays.asList(arr));
        // 스트림 생성->중간연산(함수의 매개변수->구현부)-> 최종연산
        //aList.stream().filter(s -> s >= 5).forEach(System.out::println);
        int sum = aList.stream().mapToInt(e->e).sum();
        //int sum = aList.stream().reduce(0, Integer::sum);
        int count = aList.size();
        System.out.println("합계 : " + sum);
        System.out.println("횟수 : " + count);
    }
}
