package 중복없는로또번호;
// 1에서 45사이의 6개의 임의의 수, 단 중복되지 않아야 함
public class LottoNumber {
    public static void main(String[] args) {
        int[] lotto = new int[6]; // 로또번호를 담기 위한 배열, 중복된 값을 허용하지 않기 위해서
        int number = 0; // 랜덤으로 생성된 로또 번호를 담을 변수
        int index = 0; //로또 번호를 담고 배열의 위치를 이동하기 위해 사용하는 변수
        boolean isExist = false; // 중복 여부를 체크
        while(true) { // 중복이 몇번 발생할지 모르기 때문에 무한 반복
            number = (int)((Math.random() * 45) + 1); //1 ~ 45사이의 정수 값을 반환
            for(int i = 0; i < 6; i++) {
                if (lotto[i] == number) isExist = true; // 배열내에서 랜덤으로 생성한 번호와 같은게 있으면 true를 반환
            }
            if (!isExist) {
                lotto[index++] = number; // 중복되지않은 번호를 배열에 넣고 인덱스를 증가
            }
            if (index == 6) break; // 중복되지 않은 로또번호가 6개 만들어 졌으므로 반복문 탈출!!
            isExist = false;
        }
        for (int e : lotto) System.out.print(e + " ");
    }
}
