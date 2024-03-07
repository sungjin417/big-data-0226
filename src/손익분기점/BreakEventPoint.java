package 손익분기점;

import java.util.Scanner;

public class BreakEventPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0; // 판매대수 누적
        int fixCost = sc.nextInt(); // 고정비용
        int varCost = sc.nextInt(); // 가변(생산)비용
        int sellPrice = sc.nextInt(); // 판매금액
        if (varCost >= sellPrice) { // 가변비용이 판매금액과 같거나 크면 절대 이익이 날 수 없다
            System.out.println("-1");
            return;
        }
////        while(true) {
////            if(fixCost + (varCost * cnt) < sellPrice * cnt) break;
////            cnt++;
//        }
//        System.out.println(cnt);
        System.out.println((fixCost / (sellPrice -varCost)) + 1);
    }
}
