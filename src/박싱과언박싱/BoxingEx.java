package 박싱과언박싱;
//Wrapper 클래스 : 기본타입을 객체타입으로 취급해야 하는 경우사용(제네릭, 컬랙션프레임워크)
public class BoxingEx {
    public static void main(String[] args) {
//        Integer num = new Integer(17);
//        int n = num.intValue(); // 옛날 버전
        Integer num = 7; // 오토박싱 /null 가능
        int n = num;    // 오토언박싱 / null 불가능


    }
}
