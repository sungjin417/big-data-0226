package 데몬쓰레드;
// 데몬쓰레드 : 다른 쓰레드의 작업을 돕는 보조적인 역할을 수행
// 다른 쓰레드가 모두 종료되면 데몬 쓰레드는 강제 종료 됨
public class DemonEx {
    public static void main(String[] args) throws InterruptedException {
        AutoSaveThread autoSaveThread = new AutoSaveThread();
        autoSaveThread.setDaemon(true); // 데몬쓰레드 설정
        autoSaveThread.start();
        Thread.sleep(30000);
    }
}
class AutoSaveThread extends Thread {
    public void save() {
        System.out.println("자동 내역을 저장 합니다.");
    }
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {}
            save();
        }
    }
}