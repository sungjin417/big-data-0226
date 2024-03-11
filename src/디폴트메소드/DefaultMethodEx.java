package 디폴트메소드;

import java.util.Scanner;

// 디폴트 메소드란 ? 인터페이스에 있는 구현 메서드를 의미
// 메서드 앞에 default 예약어 사용
// { } 구현부가 존재해야 함.
public class DefaultMethodEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RemoteControl remoteControl;
        System.out.print("제품 선택 : [1]TV, [2]Audio : ");
        int sel = sc.nextInt();
        if (sel == 1) {
          remoteControl = new Tv();
          remoteControl.turnON();
          remoteControl.setVolume(20);
          remoteControl.setMute(true);
          RemoteControl.changeBattery(); // 인터페이스에 있는 메소드 접근
        } else {
            remoteControl = new Audio();
            remoteControl.turnON();


        }
    }
}

