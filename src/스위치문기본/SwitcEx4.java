package 스위치문기본;

import java.util.Scanner;

public class SwitcEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("성적을 입력하세요 : ");
            int num = sc.nextInt();
            if (num < 0 || num > 100) continue;
            if (num >= 90) System.out.println("A 입니다.");
            else if (num >= 80) System.out.println("B");
            else if (num >= 70) System.out.println("C");
            else if (num >= 60) System.out.println("D");
            else System.out.println("F");
            break;
        }
    }
}
