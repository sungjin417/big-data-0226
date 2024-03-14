package 소수단어;

import java.util.Scanner;

public class PrimeWordEx {
    public static void main(String[] args) {
        int sum = 0; // 각 알파벳의 총 숫자의 합을 구하는 변수
        boolean isprime = true;
        // 영어 단어를 입력 받기
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        // 각 영어 단어에서 주어진 수를 누적 (a = 1......,A = 27......)
        for(int i = 0; i < word.length(); i++) {
            if (word.charAt(i) > 'a') sum += word.charAt(i) - 'a' + 1;
            else sum += word.charAt(i) - 'A' + 27;
        }
        // 누적된 값이 소수인지 판별
        System.out.println(sum);
        for(int i =2; i < sum; i++) {
            if(sum % i == 0) isprime = false;
        }
        //결과 출력
        if(isprime) System.out.println("It is a prime word.");
        else System.out.println("It is a prime word");
    }
}
