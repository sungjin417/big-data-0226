package 시스템입출력;
// 시스템 출력은 println(), print(), printf()

public class SystemInOut {
    public static void main(String[] args) {
        String name = "곰돌이사육사";
        String addr = "서울시 강남구 역삼동"; // " " 문자열
        char gender = 'M'; // char형은 문자를 입력 받으며 ' '로 감싸야 함(문자지만 정수값), ASCII 또는 UNICODE
        int age = 22;
        int kor = 99;
        int eng = 88;
        int mat = 40;
        double aver = 0.0; // 평균을 구하기 위한 변수

        // 자바 스타일 출력 방법(오버로딩 방식)
        System.out.println("=".repeat(5) + "Java Style 출력" + "=".repeat(5));
        System.out.println("이름 : " + name);
        System.out.println("주소 : " + addr);
        System.out.println("성별 : " + gender);
        System.out.println("나이 : " + age);
        System.out.println("총점 : " + (kor + eng + mat));
        System.out.println("평균 : " + (double)(kor + eng + mat) / 3); // 명시적 형변환("평균 : " + (kor + eng + mat) / 3.0);
        //System.out.printf("평균 : %.2f\n", (double)(kor + eng + mat) / 3);

        // c언어 스타일 : 서식지정자를 사용하는 방식
        System.out.printf("===== C언어 스타일(서식지정자 사용)\n");
        System.out.printf("이름 : %s\n", name); // 문자열 출력을 위한 서식을 지정하고 줄바꿈
        System.out.printf("주소 : %s\n", addr);
        System.out.printf("현재 습도 : %d%%\n", 65); // %를 사용 할려면 %%로 써줘야함(%는 서식을 시작한다는 의미)




    }
}
