package 짝수홀수판단하기;

import java.util.Scanner;

//임의의 정수를 입력 받아 해당 값이 짝수 인지 홀수 인지 출력하는 문제
public class OddEvenEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("임의의 정수를 입력 하세요 : ");
        int num = sc.nextInt();
        String outString = (num % 2 == 0) ? "짝수 입니다." : "홀수 입니다";
        System.out.println(outString);
//        if (num % 2 == 0){
//            System.out.println("짝수 입니다");
//        }else{
//            System.out.println("홀수 입니다");


    }
}
