package 중첩인터페이스;

public class Button {
    OnClickListner listner; // ONClickListener 인터페이스에 대함 참조 변수
    void setOnClickListener(OnClickListner listener) {
        this.listner = listener;
    }
    void touch() {
        listner.onClick(); // 구현 객체의 onClick() 메서드를 호출
    }
    interface OnClickListner {
        void onClick(); // 추상메소드
    }
}
