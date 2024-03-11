package 인터페이스;

public class 핸드폰 implements 이미지사이즈{
    //    phone.resize(     360,    600);
    public void resize(int 가로, int 세로) {
        System.out.println("핸드폰의 가로크기는 " +가로 + ", 세로크기는 " + 세로);
    }
    public void buttonSize(int 가로, int 세로) {
        System.out.println("핸드폰 버튼의 가로는 " + 가로 + ", 세로는  " + 세로);
    }
}
