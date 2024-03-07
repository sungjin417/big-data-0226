package 학점구하기;

import java.util.Scanner;

//- 시험 성적을 입력 받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지는 F를 출력하는 프로그램
//- 0 ~ 100 사이가 아니면 성적이 잘못 입력 되었다고 출력
//[선택사항] 성적이 잘못 입력된 경우 다시 입력 받도록 수정
public class GradeEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 입력을 받기 위해 한번만 생성
        int score = 0;
        while (true) { // 성적이 잘못 입력 된 경우 재 입력 처리를 하기 위해서
            System.out.print("성적을 입력 하세요 : ");
            score = sc.nextInt();
            if (score < 0 || score > 100) continue; // 아래코드를 수행하지 않고 반복문의 조건으로 돌아감
            if (score >= 90) System.out.println("A");
            else if (score >= 80) System.out.println("B");
            else if (score >= 70) System.out.println("C");
            else if (score >= 60) System.out.println("D");
            else System.out.println("F");
            break; // 반복문과 switch~case에서 탈출조건으로 사용
        }
    }
}