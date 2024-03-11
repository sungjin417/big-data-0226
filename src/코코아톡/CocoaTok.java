package 코코아톡;

public class CocoaTok {
    private String to; // 상대방 이름
    private String msg; // 전달할 메시지
    public CocoaTok(String name) {
        to = name;
    }
    public void writeMsg(String msg) {
        this.msg = to + " : " + msg;
    }
    public void send(NetworkAdapter na) {
        na.send(msg);
    }
}
