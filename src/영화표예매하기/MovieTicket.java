package 영화표예매하기;
// 예매하기는 먼저 좌석 상태를 보여주고 예약을 받음, 예약을 하게 되면 예약된 상태를 보여줌
// 종료하기시 총 판매금액 구하기

import java.util.Scanner;

public class MovieTicket {
    // 좌석 배열 만들기
    int[] seat = new int[10]; // 배열의 10개 정의(초기화 하지 않아도 전부 0으로 초기화 됨)
    int ticketPrice;

    MovieTicket(int price) { // 객체 생성시
        ticketPrice = price;
    }

    void printSeat() { // 현재 좌석 목록 보여 주기
        for (int i = 0; i < seat.length; i++) {
            if (seat[i] == 0) System.out.print("[ ]");
            else System.out.print("[V]");
        }
        System.out.println(); // 줄바꿈
    }

    void selectSeat() { // 좌석 예매하기
        printSeat(); // 좌석
        Scanner sc = new Scanner(System.in);
        System.out.print("좌석 번호를 입력 하세요 : ");
        int seatNum = sc.nextInt();
        if (seat[seatNum - 1] == 0) { // 예약가능함을 의미
            seat[seatNum - 1] = 1; // 좌석 예약
            printSeat();
        } else System.out.println("이미 예약된 좌석 입니다.");
    }

    // 종료시 좌석 판매에 대한 총 매출액 구하기
    int totalAmount() {
        int cnt = 0;
        for (int e : seat) if (e == 1) cnt++;
        return cnt * ticketPrice;
    }
}
