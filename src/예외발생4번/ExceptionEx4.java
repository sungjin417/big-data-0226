package 예외발생4번;

import java.util.Scanner;

public class ExceptionEx4 {
    public static void main(String[] args) {
        int rst = 0;
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("나눗셈 입력 : ");
            int a = sc.nextInt();
            int c = sc.nextInt();
            try {
                rst = a / c;
            } catch (ArithmeticException e) {
                  // 3번 경우
//                System.out.println("0으로 나눌 수 없습니다. 다시 입력 하세요.");
//                continue;
                rst = -1;
            } finally {
                System.out.println("프로그램 정상 종료 합니다.");
                System.out.println("결과 : " + rst);
                break;
                // 2번 경우
            /*} finally {
                System.out.println("프로그램을 종료 합니다."); // 정상이든 비정상이든 무조건 실행하는 명령어 (finally)*/
            }
            // 1번 경우
//            System.out.println("결과 : " + rst);
//            break;
        }
    }
}
