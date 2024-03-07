package 단어공부;

import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
        int[] alphabet = new int[26]; // 알파벳 개수 만큼 배열 생성
        int max = 0; // 가장 많이 등장하는 단어의 수를 저장하는 변수
        char result = 0; // 가장 많이 등장한 단어를 저장(출력을 위해서)
        Scanner sc = new Scanner(System.in);
        System.out.print("단어 입력 : ");
        String word = sc.next(); // 스캐너로 부터 단어를 입력 받음
        for(int i = 0; i < word.length(); i++) {
            if(word.charAt(i) >= 'a') alphabet[word.charAt(i) - 'a']++; // 해당 알파벳의 인덱스에 1증가
            else alphabet[word.charAt(i) - 'A']++;
        }
        for(int i = 0; i < alphabet.length; i++) {
            if(alphabet[i] == max) result = '?';
            else if(alphabet[i] > max) {
                max = alphabet[i];
                result = (char) ('A' + i);
            }
        }
        System.out.println(result);
    }
}
