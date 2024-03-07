package 접근제한자;

public class Restrictor extends City {
    public void seoul() {
        System.out.println("서울 메소드는 public 입니다.");
    }
    void busan() {
        System.out.println("부산 메소드는 defalut 입니다.");
    }
    protected void inchun() {
        System.out.println("인천 메소드는 protected 입니다.");
    }
    private void daegu() {
        System.out.println("대구 메소드는 private 입니다.");
    }
}
