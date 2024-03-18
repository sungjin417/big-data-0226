package 바이트스트림;

import java.io.*;

// Byte 스트림 : 데이터 전송을 바이트 단위로 함, 동영상이나 이미지 전송에 적합
// Byte 스트림의 최상위 클래스는 InputStream과 OutputStream
public class ByteStream {
    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("test.db");
//        byte a = 10;
//        byte b = 20;
//        byte c = 30;
        byte[] arr = {10, 20, 30};
//        os.write(a);
//        os.write(b);
//        os.write(c);
        os.write(arr);

        os.flush(); // 버퍼 지우기
        os.close(); // 자원 반납 후 닫기

        InputStream is = new FileInputStream("test.db");
        while(true) {
            int data = is.read(); // 1byte씩 읽기
            if(data == -1) break; // 파일의 끝을 의미
            System.out.print(data + " ");
        }

    }
}
