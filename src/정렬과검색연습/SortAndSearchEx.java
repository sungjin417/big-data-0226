package 정렬과검색연습;

import java.util.Arrays;
import java.util.Scanner;

public class SortAndSearchEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 갯수 : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("찾을 수를 입력 : ");
        int key = sc.nextInt(); // 검색할 키 값
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * n) + 1;
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr, key));

    }
}
