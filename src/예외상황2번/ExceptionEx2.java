package 예외상황2번;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionEx2 {
    public static void main(String[] args) /*throws FileNotFoundException 메인 밖으로 날려 버리는거*/ {
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/프로퍼티/database.properties"));
        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다."); // try / catch 로 예외처리
        }

    }
}
