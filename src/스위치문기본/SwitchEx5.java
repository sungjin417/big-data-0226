package 스위치문기본;

import java.util.Scanner;

public class SwitchEx5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("세자리 정수를 입력 : ");
        int num;
        int a, b, c;
        num = sc.nextInt();
        a = num / 100;
        b = (num % 100) / 10;
        c = num % 10;
//        if (a > b) {
//            System.out.println(Math.max(a,c));
//        } else {
//            System.out.println(Math.max(b,c));
//        }
        if (a >b && a > c) System.out.println(a);
        else if (a > c && b > a) System.out.println(b);
        else System.out.println(c);
    }
}
