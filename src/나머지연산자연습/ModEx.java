package 나머지연산자연습;
// 100의 자리 정수를 입력 받아서 3개의 변수에 나눠 담기
// ex) 257 => a변수에 2, b 5, c 7

import java.util.Scanner;

// 몫과 나머지를 구해서 만들어야 함
public class ModEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("100의 자리 정수를 입력하세요 : ");
        int num = sc.nextInt();
        int a = num / 100; // 100으로 나눈 몫을 구함
        int b = (num % 100) / 10; // 100으로 나눈 나머지를 구하고, 다시 10으로 나눈 몫을 구함
        int c = num % 10;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
