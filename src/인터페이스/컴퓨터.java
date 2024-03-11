package 인터페이스;

public class 컴퓨터 implements 이미지사이즈{
    @Override
    public void resize(int 가로, int 세로) {
        System.out.println("컴퓨터 가로 크기 : " + 가로 + ", 세로크기 : " + 세로);
    }
    public void buttonSize(int 가로, int 세로) {
        System.out.println("컴퓨터 버튼의 가로는 " + 가로 + ", 세로는  " + 세로);
    }
}
