package 변수연습;

public class VarEx {
    public static void main(String[] args) {
        int age; // 나이를 저장하기 위해 4Byte 공간을 확보 함.
        age = 100; // age라는 변수에 100이라는 값을 넣음
        double taxRate = 1.0; // 카멜표기법
        int jobs; // 변수이름은 소문자로 지어야 함(에러는 안나지만 관례임) 클래스이름은 대문자로 (설계도면)

        int year = 2024; // 선언과 동시에 값을 할당
        int day = 0; // 선언과 동시에 값을 0으로 초기화
        String name = ""; // 이름이라는 문자열을 담는 변수를 선언하고 초기화(null="" 의미는 다름)

        int n = 20;
        int m = 30;
        if(n > 10) {
            m = n - 10;
        }
        int k = n + m; // m은 이미 메모리에서 사라지고 없음

        String addr = "서울시 강남구 역삼동 KH정보교육원";
        // 실수형 : 지수와 가수로 표현되면 가수 부분이 정밀도 연관이 있음, 근사치 표기법
        float height = 170.55f; // float형은 표기시 F, f룰 붙여야 함
        double pi = 43.145992653589793;

        // 상수 (constant) : 고정된 값을 표기할 때 사용
        final double PI = 3.141592; // 한번 값이 대입되면 더이상 변경 되지 않음(final)
        final int YEAR = 365;
    }
}
