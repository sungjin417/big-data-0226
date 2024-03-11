package 인터페이스;

public class ImgMain {
    public static void main(String[] args) {
        // 핸드폰과 컴퓨터 이미지 크기 출력
        이미지사이즈 phone = new 핸드폰();
        이미지사이즈 computer = new 컴퓨터();
        phone.resize(360, 600);
        computer.resize(1280, 720);

        computer.buttonSize(300, 150);
        phone.buttonSize(50, 25);

    }
}
