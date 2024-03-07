package 재귀호출;

import java.util.Scanner;

// 재귀호출 : 메소드 내부에서 해당 메소드가 또 다시 호출되는 것
// 길찾기 알고리즘, 퀵정렬 등
public class RecursiveEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int num = sc.nextInt();
        //System.out.println(funcSumwhile(num));
        System.out.println(funcRecursive(num));
    }
    // while문으로 만들어진 합을 구하는 메소드
    static int funcSumwhile(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n;
            if (n == 1) break;
            n--;
        }
        return sum;
    }
    // 재귀 메소드 호출 : 정수의 합을 구함
    static int funcRecursive(int n) {
        if (n == 1) return 1;
        return n + funcRecursive(n -1);
    }
}
