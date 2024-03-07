package 은행만들기;

public class Bank {
    private static int count = 0; // 클래스 내부에서만 접근가능하고, static이 있으므로 정적필드(클래스 생성 시 생성됨)
    private int account; // 계좌정보 잔액
    private String bank;
    Bank(String name, int account) {
        count++; // 클래스 필드, 생성자가 호출 될때 마다 값이 증가
        this.bank = name;
        this.account = account;
        System.out.println(name + "은행에 계좌 개설 합니다. 잔액은 " + account + " 입니다." );
    }
    public static int getCount() { // 정적 메소드
        return count;
    }
    public void setDeposit(final int dep) { // final을 사용하는 이유는 예끔 금액의 변경을 막기 위해
        this.account += dep; // 현재 잔액 = 잔액 + 예금
        System.out.println(dep + "을 예금 했습니다.");
    }
    public void setWithDraw(final  int with) { // 출금 메소드
        if(with > account) {
            System.out.println("잔액이 부족 합니다.");
        } else {
            account -= with;
        }
    }
    public void viewAccount() {
        System.out.println("현재 잔액은" + account + "입니다.");
    }
}
