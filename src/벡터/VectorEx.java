package 벡터;

import java.util.List;
import java.util.Vector;

// Vector : List 인터페이스를 상속 받아 만든 리스트 타입의 자료 구조
// Vector는 동기화 기능을 제공하므로 멀티쓰레드 환경에서 안전
// 하지만 성능이 ArrayList에 비해서 떨어지므로 특별한 경우가 아니면 ArrayList를 사용
public class VectorEx {
    public static void main(String[] args) {
        List<NameCard> list = new Vector<>();
        list.add(new NameCard("카즈하", "kzh@gmail.com", "010-1234-5678", "르세라핌"));
        list.add(new NameCard("김채원", "kcw@gmail.com", "010-1111-2222", "르세라핌"));
        list.add(new NameCard("은채", "eun@gmail.com", "010-1111-2222", "르세라핌"));

        for (NameCard name : list) {
            System.out.println("이름 : " + name.name);
            System.out.println("메일 : " + name.eMail);
            System.out.println("전화 : " + name.phone);
            System.out.println("직업 : " + name.jobs);
            System.out.println();
        }
    }
}
class NameCard {
    String name;
    String eMail;
    String phone;
    String jobs;

    public NameCard(String name, String eMail, String phone, String jobs) {
        this.name = name;
        this.eMail = eMail;
        this.phone = phone;
        this.jobs = jobs;
    }
}
