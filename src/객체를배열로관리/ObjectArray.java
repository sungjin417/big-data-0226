package 객체를배열로관리;

import java.util.Scanner;

// 객체를 배열로 관리는 배열의 각 요소가 기본타입이 아니고 객체임을 의미
public class ObjectArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 인원 : ");
        int cnt = sc.nextInt();
        NameCard[] nameCards = new NameCard[cnt]; // NameCard클래스 타입의 배열 선언(객체를 저장 할 배열 생성)

        System.out.println("정보 입력");
        System.out.println("----------------------");
        for(int i = 0; i < nameCards.length; i++) {
            nameCards[i] = new NameCard();
            System.out.print("이름 : ");
            nameCards[i].setName(sc.next());
            System.out.print("나이 : ");
            nameCards[i].setAge(sc.nextInt());
            System.out.print("이메일 : ");
            nameCards[i].setMail(sc.next());
            System.out.print("연락처 : ");
            nameCards[i].setPhoneNumber(sc.next());
        }
        for(NameCard i : nameCards) i.printInfo();
    }
}
