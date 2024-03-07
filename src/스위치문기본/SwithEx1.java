package 스위치문기본;

import java.util.Scanner;

// 스위치문은 if문과 마찬가지로 제어문 입니다.
// if문은 조건식이 사용될 수 있지만, 스위치문은 조건식은 사용할 수 없고 변수값으로 조건 분기를 해야 함
// if문에 비해서 가독성이 좋음
public class SwithEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("성별을 입력 하세요 : (M/n, F/f)");
            char ch = sc.next().charAt(0);
            switch (ch) {
                case 'M':
                case 'm':
                    System.out.println("남성 입니다.");
                    break;
                case 'F':
                case 'f':
                    System.out.println("여성 입니다.");
                    break;
                default:
                    System.out.println("성별을 잘 못 입력 했습니다. 다시 입력 하세요");
                    continue;
            }
            break;
        }



    }


}

