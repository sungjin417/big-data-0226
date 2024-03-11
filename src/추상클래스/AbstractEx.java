package 추상클래스;
// 추상클래스는 객체를 생성할 수 없는 클래스를 의미
// 추상클래스에서는 추상 메소드와 일반 메소드가 혼용 되어 있음
// 다중 상속을 지원 하지 않음
// 추상메소드는 반드시 자식클래스에서 오버라이딩(구현 해야 함)해서 사용해야함 (왜냐하면 부모가 해당 메소드를 구현 하지 않았기 때문에)

import java.util.ArrayList;
import java.util.List;

public class AbstractEx {
    public static void main(String[] args) {
        Phone phone = new SmartPhone("Galaxy S23");
        phone.setPower(true);
        phone.call();

//        List list = new ArrayList();
//        ArrayList arrayList = new ArrayList();
    }
}
