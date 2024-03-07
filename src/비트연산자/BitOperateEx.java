package 비트연산자;
// 비트연산자 : 비트 단위로 연산하는 것, 주로 하드웨어 제어, 극도로 성능을 요구하는 영역
// 비트 AND : & (둘다 1이어야 1)
// 비트 OR : | (둘 중 하나만 1이면 1)
// 비트 XOR : ^ 비트가 서로 다른 경우에 1
// 비트 NOT : ~ 비트를 반전
// 쉬프트 : << >> 비트를 왼쪽 또는 오른쪽으로 주어진 수 만큼 이동시킴
public class BitOperateEx {
    public static void main(String[] args) {
        byte num1 = 10;
        byte num2 = 12;
        System.out.println(num1 & num2); // 8
        System.out.println(num1 | num2); // 14
        System.out.println(num1 ^ num2); // 6
        System.out.println(~num1); //
        System.out.println(num1 << 1); // 20
        System.out.println(num1 >> 1); // 5



    }
}
