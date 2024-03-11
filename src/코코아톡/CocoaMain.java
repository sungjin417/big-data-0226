package 코코아톡;

import java.util.Scanner;

public class CocoaMain {
    public static void main(String[] args) {
        CocoaTok cocoaTok = new CocoaTok("장원영");
        cocoaTok.writeMsg("오늘은 날씨가 따뜻해요. 봄이 오나봐요~~");
        NetworkAdapter adapter; // 인터페이스 상속을 준 부모의 참조변수
        Scanner sc = new Scanner(System.in);
        System.out.print("네트워크 : [1]WiFi, [2]5G : ");
        int sel = sc.nextInt();
        if (sel == 1) adapter = new WiFi();
        else adapter = new FiveG();
        cocoaTok.send(adapter);

    }
}
