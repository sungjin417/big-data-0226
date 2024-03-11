package 코코아톡;

public interface NetworkAdapter {
    void connect(); // public abstract가 무조건 추가 됨
    void send(String msg);
}

class WiFi implements NetworkAdapter{

    @Override
    public void connect() {
        System.out.println("WiFi에 연결 되었습니다.");
    }

    @Override
    public void send(String msg) {
        System.out.println("WiFi >> " + msg);
    }
}

class FiveG implements NetworkAdapter{

    @Override
    public void connect() {
        System.out.println("5G에 연결 되었습니다.");
    }

    @Override
    public void send(String msg) {
        System.out.println("5G >> " + msg);
    }
}

class LTE implements NetworkAdapter{

    @Override
    public void connect() {
        System.out.println("LTE에 연결 되었습니다.");
    }

    @Override
    public void send(String msg) {
        System.out.println("LTE >> " + msg);
    }
}


