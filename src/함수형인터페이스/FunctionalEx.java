package 함수형인터페이스;
// 함수형 인터페이스 : 자바는 함수가 독립적으로 만들어 질 수 없으므로 사용하는 문법
@FunctionalInterface
interface Calculator {
    int sum(int a, int b); // 추상메소드
    //int div(int a, int b); // @FunctionalInterface이 함수가 2개일 경우 잡아 줌
}
//class MyCalculator implements Calculator {
//    @Override
//    public int sum(int a, int b) {
//        return a + b;
//    }
//}


public class FunctionalEx {
    public static void main(String[] args) {
        Calculator mc = (a, b) -> a + b; // 추상 메소드를 람다식으로 구현 (위의 Override 구현식을 대신 구현)
        int result = mc.sum(100, 200);
        System.out.println(result);
//        MyCalculator mc = new MyCalculator();
//        int result = mc.sum(100, 200);
//        System.out.println(result);

    }
}
