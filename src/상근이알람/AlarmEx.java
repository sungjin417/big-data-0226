package 상근이알람;

import java.util.Scanner;

public class AlarmEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("시간 입력 : ");
        int hour = sc.nextInt();
        int min = sc.nextInt();
        int calc = (hour * 60) + min; // 계산의 편의를 위해서 모두 분으로 환산
        if(calc < 45) { //
            calc = (24 * 60) + min;
        }
        calc -= 45;
        System.out.println((calc / 60) + ":" + (calc % 60));
    }
}
