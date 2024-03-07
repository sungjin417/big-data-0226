package 에어컨만들기;
// 전원 ON/OFF 기능
// 온도 설정 기능 (1도 단위 설정)
// 현재 온도 표시 기능
// 냉방기 ON/OFF 기능
// 난방기 ON/OFF 기능
// 바람세기 설정 (1단계 / 2단계 / 3단계)

// 설정된 온도에 따라 온도 조정 기능 (60초/30초/20초) 주기로 온도 변함
// 에어컨 ON/OFF 동작을 위해 Scanner 입력에 대한 문자열 체크
// 현재 온도 표시를 위한 캘린더 API 활용(현재 날짜에 대한 적절한 온도 설정)
import java.util.Calendar;
import java.util.Scanner;

public class AirConditioner {
    boolean isPower; // 전원
    int setTemp; // 온도 설정
    int currTemp; // 현재 온도
    boolean isCooler; // 에어컨
    boolean isHeater; // 히터
    int windStep; // 1단, 2단, 3단
    AirConditioner() {
        final int[] monthTemp = {-5, 3, 10, 15, 22, 28, 32, 30, 24, 16, 8, 4};
        Calendar now = Calendar.getInstance();
        int month = now.get(Calendar.MONTH);
        currTemp = monthTemp[month];
        isPower = false;
        setTemp = 18;
        isCooler = false;
        isHeater = false;
        windStep = 1;
    }
    void airconInfo() {
        String onOffStr = (isPower) ? "ON" : "OFF";
        String heaterStr = (isHeater) ? "ON" : "OFF";
        String coolerStr = (isCooler) ? "ON" : "OFF";
        final String[] windStr = {"", "1단계", "2단계", "3단계"};
        System.out.println("=========== 에어컨 정보 ===========");
        System.out.println("전원 : " + onOffStr);
        System.out.println("현재 온도 : " + currTemp);
        System.out.println("설정 온도 : " + setTemp);
        System.out.println("히터 : " + heaterStr);
        System.out.println("쿨러 : " + coolerStr);
        System.out.println("바람세기 : " + windStr[windStep]);
    }
    public void setAirconState() {
        Scanner sc = new Scanner(System.in);
        System.out.println("현재 온도가 " + currTemp + " 입니다.");
        System.out.print("온도를 설정 하세요 : ");
        setTemp = sc.nextInt();
        System.out.println("설정 온도는 " + setTemp + " 입니다.");
        System.out.print("바람 세기를 설정 하세요(1단/2단/3단) : ");
        windStep = sc.nextInt();
        if (currTemp > setTemp) { // 현재가 더운 상태
            System.out.println("Cooler 가 동작 합니다.");
            isCooler = true;
            isHeater = false;
        } else if (currTemp < setTemp) { // 현재가 추운 상태
            System.out.println("Heater 가 동작 합니다.");
            isCooler = false;
            isHeater = true;
        } else {
            isCooler = false;
            isHeater = false;
        }
    }
        public void setPower(boolean power) {
            isPower = power;
        }
        public int getWindStep() {
            return windStep;
        }

        public boolean isHeater() {
            return isHeater;
        }

        public boolean isCooler() {
            return isCooler;
        }
        public void setCurrTemp(int n) {
            currTemp += n;
        }
        public int getCurrTemp() {
            return currTemp;
        }
        public int getSetTemp() {
            return setTemp;
    }

}
