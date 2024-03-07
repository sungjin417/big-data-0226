package 연산자연습;

import java.util.Scanner;

// 산술연산자 : 사칙연산, 나머지 연산자
public class OperateEx {
    public static void main(String[] args) {
        int num1 = 10, num2 = 4;
        System.out.println(" + 연산자 : " + (num1 + num2));
        System.out.println(" - 연산자 : " + (num1 - num2));
        System.out.println(" * 연산자 : " + (num1 * num2));
        System.out.println(" / 연산자 : " + (num1 / num2)); // 몫을 구하는 용도로 사용할 수 있음
        System.out.println(" / 연산자 : " + ((double)num1 / num2)); // 나눗셈
        System.out.println(" % 연산자 : " + (num1 % num2)); // 나머지를 구하는 연산자
        //예외적인 연산
        System.out.println(5/0.0);
        try{
            System.out.println(5/0);
        }catch(ArithmeticException e) {
            System.out.println("0 으로 나누면 안됨");
        }
        // = 대입연산자 : 생성한 변수에 값을 넣는 걸 대입이라고 함
        int num3 = 10;
        System.out.println(num3 += 2); // 복합 대입 연산자 : num3 = num3 + 2
        System.out.println(num3 -= 2); // 복합 대입 연산자 : num3 = num3 - 2 여기서 num3는 위의 값인 12로 계산
        System.out.println(num3 *= 2);
        System.out.println(num3 /= 2);

        // 증감 연산자 : 피연산자를 1씩 증가 또는 감소 시키는 연산자
        int num4 = 10;
//        System.out.println(num4++); // 피연산자의 뒤에 붙은 경우는 후위증감 연산자로 동작(선 대입 후 증감)
//        System.out.println(num4);

        // 비교연산자 : 크다, 작다, 크거나 같다, 작거나 같다.
        int x = 10;
        int y = 20;
//        System.out.println(x > y); // false
//        System.out.println(x < y); // true
//        System.out.println(x == y); // false, == 비교연산자
//        System.out.println(x >= y); // false
//        System.out.println(x <= y); // true
        // 논리 연산자 : &&(and), ||(or), !(not)
        boolean rst1, rst2, rst3; // 1byte, 참과 거짓을 구분하는 용도로 사용
        rst1 = (x > 0) && (x > y); // false, &&은 둘다 참이어야 함
        rst2 = (x > 0) || (x > y); // true, ||은 둘 중 하나만 참이어도 참
        rst3 = !((x > 0) || (x > y)); // false, 괄호 내의 결과값을 반전 시킴
//        System.out.println(rst1);
//        System.out.println(rst2);
//        System.out.println(rst3);

        // 삼항 연산자 : 피연산자가 3개인 연산자

//        Scanner sc = new Scanner(System.in);
//        System.out.print("나이를 입력 하세요 : ");
//        int age = sc.nextInt();
//        boolean isAdult = (age > 19) ? true : false; // 조건식이 참이면 ? 뒤에 코드 실행. 아니면 콜론 뒤의 코드 실행
//        System.out.println(isAdult);
//        String adult = (age > 19) ? "성인입니다" : "미성년자입니다";
//        System.out.println(adult);

        // 문자열 결합 연산자
        System.out.println("Java JDK" + 11.04 + 12); // 처음 만나는 데이터 타입이 문자열이면 후 값들이 문자열로 간주 됨
        System.out.println(3 + 3.3 + "JDK");

        // 연산자 우선 순위 확인
        int val1 = 5, val2 = 5, val3 = 5;
        int rst11, rst22, rst33;
        rst11 = val1 + val2 * val3; // 30
        rst22 = (val1 + val2) * val3; // 50
        rst33 = val1 + ++val2 * val3; // 35
        System.out.println(rst11);
        System.out.println(rst22);
        System.out.println(rst33);


    }
}
