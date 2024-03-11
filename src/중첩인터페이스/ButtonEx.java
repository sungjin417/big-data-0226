package 중첩인터페이스;
// 중첩 인터페이스는 클래스 내부에 선언한 인터페이스를 의미
public class ButtonEx {
    public static void main(String[] args) {
        Button btn = new Button(); // 버튼 객체를 생성
        btn.setOnClickListener(new CallListener());
        btn.touch();
        btn.setOnClickListener(new MessageListener());
        btn.touch();
    }
}
