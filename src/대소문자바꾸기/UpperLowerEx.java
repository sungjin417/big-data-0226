package 대소문자바꾸기;

import java.util.Scanner;

public class UpperLowerEx {
    public static void main(String[] args) {
        //문자열 입력 받기
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String input = sc.next();
        for(int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i); // 해당 인덱스의 문자를 추출
            if(ch < 'a') System.out.print((char)(ch + ('a' - 'A')));
            else System.out.print((char)(ch - ('a' - 'A')));
        }
    }
}
