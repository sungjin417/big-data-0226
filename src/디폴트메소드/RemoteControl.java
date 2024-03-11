package 디폴트메소드;

public interface RemoteControl {
    int MAX_VOLUME = 100; // final static이 자동 추가(기능 명세서에서 미리 정한 값의 의미)
    int MIN_VOLUME = 0;
    void turnON(); // public abstract가 자동 붙음
    void turnOFF();
    void setVolume(int volume);
    // 디폴트 메소드 추가 : JDK 8 이후 추가 됨(상속받은 모든 클래스들이 기능을 추가하는걸 피하기 위해 예외 조항(default)을 넣어 메소드를 만듦)
    default void setMute(boolean mute) {
        if (mute) System.out.print("무음 처리 합니다.");
        else System.out.println("무음 해제 합니다.");
    }
    //static을 사용하면 RemoteControl 인터페이스 소속이므로 메소드 구현 가능 (아래는 상속을 안주기 때문에 상관 없다.)
    static void changeBattery() {
        System.out.println("건전지를 교환 합니다.");
    }
}
