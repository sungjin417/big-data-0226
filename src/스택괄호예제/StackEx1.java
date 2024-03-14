package 스택괄호예제;

import java.util.Scanner;
import java.util.Stack;

// 스택을 이용한 괄호 열림/닫힘 확인
public class StackEx1 {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<>(); // <Character> 에러는 안나지만 넣지 않으면 다른것도 입력될 수 있음
        Scanner sc = new Scanner(System.in);
        System.out.print("수식입력 : ");
        String exp = sc.next();
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if(ch == '(') {
                st.push(ch); // 열림 괄호 이면 push
            } else if (ch == ')') {
                if(!st.isEmpty())st.pop();
                else {
                    System.out.println("괄호가 일치하지 않습니다.");
                    return;
                }
            }
        }
        if (st.isEmpty()) {
            System.out.println("괄호가 일치 합니다.");
        } else {
            System.out.println("괄호가 일치하지 않습니다.");
        }
    }
}
