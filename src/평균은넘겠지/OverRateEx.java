package 평균은넘겠지;

import java.util.Scanner;

public class OverRateEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCnt = sc.nextInt(); // 총 테스트 케이스 수
        double[] result = new double[testCnt]; // 테스트에 대한 결과를 담기위해
        for(int i = 0; i < result.length; i++) {
            result[i] = overRate();
        }
        for(double val : result) {
            System.out.printf("%.3f%%\n", val); // %는 서식 지정자 / %-> %%
        }
    }
    static double overRate() {
        int total = 0; // 평균을 구하기 위해서는 총점이 필요
        int overCnt = 0; // 평균이 넘는 사람의 수
        Scanner sc = new Scanner(System.in);
        int studentCnt = sc.nextInt();
        int[] score = new int[studentCnt];
        for(int i = 0; i < score.length; i++) {
            score[i] = sc.nextInt();
            total += score[i]; // 총점을 누적
        }
        double average = (double) total / studentCnt; // 명시적 형변환, 묵시적 형변환이 일어남
        for(int val : score) {
            if (val > average) overCnt++; // 평균을 넘는 사람의 수
        }
        return (double) overCnt/studentCnt * 100;
    }
}
