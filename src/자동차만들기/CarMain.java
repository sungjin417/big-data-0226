package 자동차만들기;

import java.util.Scanner;
//이 코드는 자동차를 상속받아 승용차,스포츠카,버스를 만들고 설정 정보에 따라 기능을 구현하고 결과를 출력하는 프로그램입니다.
public class CarMain {// CarMain Class 프로그램 진입점.
    public static void main(String[] args ) {
        Scanner sc = new Scanner(System.in); // 입력 스트림 생성

        while (true) { // 여러 번 실행하기 위한 반복문 처리.

            System.out.print("이동 지역 선택 [1]부산 [2]대전 [3]강릉 [4] 광주 : ");
            int destination = sc.nextInt();// 이동 지역 입력.

            System.out.print("이동할 승객 수 입력 : ");
            int passengers = sc.nextInt(); // 승객 수 입력

            System.out.print("이동할 차량 선택 [1]스포츠카 [2]승용차 [3]버스 : ");
            int carType = sc.nextInt();  // 이동 차량 입력

            System.out.print("부가 기능 선택 [1]ON [2]OFF : ");
            int Option =  sc.nextInt(); // 부가 기능 선택

            switch (carType) {
                case 1:
                    Car sportsCar = new SportsCar(Option);
                    sportsCar.move(destination, passengers);
                    break;
                case 2:
                    Car sedan = new Sedan(Option);
                    sedan.move(destination, passengers);
                    break;
                case 3:
                    Car bus = new Bus(Option);
                    bus.move(destination, passengers);
                    break;
                default:
                    System.out.println("잘못된 선택입니다.");
            }

            System.out.println("계속 이동하시겠습니까? [Y/N]");
            String continueOption = sc.next();
            if (!continueOption.equalsIgnoreCase("Y")) {
                break;
            }
        }

        sc.close(); // Scanner 객체 닫기
    }
}

class Car {
    protected final double GAS_PRICE_PER_LITER = 2000;
    protected final int[] DESTINATIONS = {0, 400, 200, 150, 300};

    protected String name;
    protected double speed;
    protected int mileage;
    protected int tank;
    protected int seat;

    public Car(String name,double speed, int mileage, int tank, int seat) {
        this.name = name;
        this.speed = speed;
        this.mileage = mileage;
        this.tank = tank;
        this.seat = seat;
    }

        public void move(int destination, int passengers) {


        double distance = DESTINATIONS[destination]; // 목적지까지 거리
        double fuelConsumption = distance / mileage;// 연비소비 : 거리 / 연비
        double count = Math.ceil((double)passengers/seat); //편도 횟수 : 승객 수/자리 수 올림.
        double totalFuelCost = fuelConsumption * count; // 총 연료 비용 : 연료소비 * 편도횟수
        double totalCost = totalFuelCost * GAS_PRICE_PER_LITER; // 총 비용 : 총 연료 비용 * 2000(리터당 연비).
        double totalRefuel =  Math.ceil( totalFuelCost / tank); // 총 주유 횟수 : 총 연료 비용 / 탱크용량
        double Hour = (( distance * count) / speed);//총 시간 : 총 거리 / 속도
        double Minute = Math.ceil((Hour-(int)Hour) * 60);



        System.out.println("=====" + name + "=====");
        System.out.println("총 비용 : " + (int) totalCost + "원");
        System.out.println("총 주유 횟수 : " + (int)totalRefuel + "회");
        System.out.println("총 이동 시간 : " + (int)Hour + "시간 " +  (int)Minute + "분");
    }
}
// 이동 메서드

// 자식 클래스
    class SportsCar extends Car { // 부모 클래스(car) 상속

        public SportsCar(int Option) { // 자식 클래스의 생성자
            super("Ferrari",250, 8, 30, 2); // 부모 클래스의 생성자를 상속 (값 초기화)

            if (Option == 1) { // option이 ON(1)인 경우
                speed *= 1.2; // 터보 기능

            }
        }
    }

    class Sedan extends Car {
        public Sedan(int Option) {
            super("GV80",200, 12, 45, 4);
            if (Option == 1) {
                seat += 1; // 탑승 승객 1명 추가
            }
        }
    }


    class Bus extends Car {
        public Bus(int Option) {
            super("관광버스",150, 5, 100, 20);
            if (Option == 1) {
                tank += 30; // 보조연료탱크 증가
            }
        }
    }