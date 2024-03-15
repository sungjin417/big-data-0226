package 예외처리미루기;

import java.io.IOException;

public class ExceptionEx6 {
    public static void main(String[] args) throws IOException/*던지기*/ {
        IOSample test = new IOSample();
        // 예외처리
        //try {
            test.input();
            test.output();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
class IOSample {
    private int num;
    public void input() throws IOException {
        num = System.in.read();
    }
    public void output() {
        System.out.println(num);
    }
}