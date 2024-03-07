package 더하기싸이클;
// 입력 받은 수가 더하기 사이클의 조건을 수행하고 몇번만에 입력한 수와 같은 값으로 되돌아오는지 확인하는 문제
// 입력 : 68 => 6+8=14 => 84 => 8+4=12 => 42 => 4+2=6 => 26 => 2+6=8 => 68
import java.util.Scanner;

public class AddCycleEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumNumber = 0; // 입력 받은 수의 10자리와 1의 자리를 분리해서 더함
        int newNumber = 0; // 새롭게 만들어진 변수
        int cnt =0; // 누적 횟수 구하기
        System.out.print("입력 : ");
        int input = sc.nextInt();
        int num = input; // 입력 받은 값이 변경 되는 걸 막기 위해서 변수에 담음
        while(true) {
            sumNumber = (num / 10) + (num % 10); // 입력받은 수의 10자리와 1의 자리를 분리해서 더함
            newNumber = (num % 10) * 10 + (sumNumber % 10); // 입력값의 1의자리 +계산된 값의 1의 자리를 더함
            cnt++;
            if(newNumber == input) break;
            num = newNumber;
        }
        System.out.println(cnt);
    }
}
