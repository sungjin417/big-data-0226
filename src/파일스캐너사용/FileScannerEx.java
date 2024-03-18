package 파일스캐너사용;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

// 파일을 읽을 때 스캐너를 사용 할 수 있음
public class FileScannerEx {
    public static void main(String[] args) {
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream("react.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner sc = new Scanner(inputStream);
        while(sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(line);
        }
    }
}
