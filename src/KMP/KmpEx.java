package KMP;

import java.util.Scanner;

public class KmpEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름 입력 : ");
        String name = sc.next();
        //첫번째 방법 : CharAt() 사용 (대문자만 골라 냄)
//        for (int i = 0; i < name.length(); i++) {
//            if(name.charAt(i) > 'A' && name.charAt(i) <= 'Z') {
//                System.out.print(name.charAt(i));
//            }
//        }
        // 두번째 방법 : 0번째 문자열을 출력하고 -(하이픈) 다음의 문자를 출력
//        for(int i = 0; i < name.length(); i++) {
//            if (i == 0) System.out.print(name.charAt(i));
//            else {
//                if (name.charAt(i) == '-') System.out.print(name.charAt(i+1));
//            }
//        }
        // 세번째 방법 : split() 메소드 사용
//        String[] splitName = name.split("-");
//        for (String e : splitName) {
//            System.out.print(e.charAt(0));
//        }
        // 네번째 방법 : 배열로 변경 후 'A' ~ 'Z' 사이 문자만 출력
        char[] chName = name.toCharArray();
        for(char e : chName) {
            if (e >= 'A' && e <= 'Z') System.out.print(e);

        }
    }
}
