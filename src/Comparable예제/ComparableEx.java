package Comparable예제;

import java.util.TreeSet;

// Comparable / Comparator 인터페이스는 객체들을 정렬하는 데 사용되는 인터페이스
// Comparable : 자기 자신과 외부로 부터 전달된 객체르 비교
// Comparator : 두개의 객체를 전달 받아 비교해 줌
public class ComparableEx {
    public static void main(String[] args) {
        TreeSet<CarCompare> list = new TreeSet<>();
        list.add(new CarCompare("Santafe", 2016, "흰색"));
        list.add(new CarCompare("Sorento", 2012, "은색"));
        list.add(new CarCompare("Grandeur", 2018, "블랙"));
        list.add(new CarCompare("Morning", 2012, "오렌지")); // 비교조건이 같으면 중복제거(2012)
        for(CarCompare e : list) {
            System.out.println(e.modelName + " : " + e.modelYear);
        }
    }
}
