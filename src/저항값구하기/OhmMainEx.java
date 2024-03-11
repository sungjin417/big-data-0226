package 저항값구하기;

import java.util.Scanner;

public class OhmMainEx {
    public static void main(String[] args) {
        String[] color = {"black", "brown", "red", "orange",
                "yellow", "green", "blue", "violet", "grey", "white"};
        int[] mul = {1, 10, 100, 1000, 10000, 100000,
                1000000, 1000000, 10000000};
        int fVal = 0, sVal = 0, tVal = 0;
        Scanner sc = new Scanner(System.in);
        String fColor = sc.nextLine();
        String sColor = sc.nextLine();
        String tColor = sc.nextLine();
        for (int i = 0; i < 10; i++) {
            if (fColor.equals(color[i])) fVal = i; // 입력받은 색의 인덱스를 대입
            if (sColor.equals(color[i])) sVal = i;
            if (tColor.equals(color[i])) tVal = mul[i];
        }
        System.out.println((long) ((fVal * 10) + sVal) * tVal);
    }
}