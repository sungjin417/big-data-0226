package X보다작은수;
// 10 5                 : 입력
// 1 10 4 9 2 3 8 5 7 6 : 입력
// 1 4 2 3              : 출력
import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 입력받는 배열의 수
        int x = sc.nextInt(); // 조건비교를 해야 하는 수( x 미만의 수 출력)
        int[] arr = new int[n]; // 수를 입력 받은 배열을 생성
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // 배열의 크기 만큼 임의의 값을 입력
            if(arr[i] < x) System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
