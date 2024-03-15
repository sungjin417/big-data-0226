package 예외상황5번;

import java.io.FileWriter;
import java.io.IOException;

public class ExceptionEx5 {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("test.txt");
            fw.write("곰돌이사육사~~~~~~~");
        } catch (IOException e) { // 예외처리
            e. printStackTrace();
        }finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
