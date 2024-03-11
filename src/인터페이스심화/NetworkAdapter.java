package 인터페이스심화;

public interface NetworkAdapter {
    void connect(); // 자동으로 public abstract 추가
}

class WiFi implements NetworkAdapter{
    String company;
    WiFi(String com) {
        company = com;
    }
    @Override
    public void connect() {
        System.out.println(company + "WiFi에 연결 되었습니다.");

    }
}

class FiveG implements NetworkAdapter{
    String company;
    FiveG(String com) {
        company = com;
    }
    @Override
    public void connect() {
        System.out.println(company + "5G 연결 되었습니다.");

    }
}
class Lte implements NetworkAdapter{
    String company;
    Lte(String com) {
        company = com;
    }
    @Override
    public void connect() {
        System.out.println(company + "Lte에 연결 되었습니다.");

    }
}
