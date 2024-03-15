package 쓰레드2번;
// 쓰레드를 종료 하는 방법
public class ThreadExit {
    public static void main(String[] args) throws InterruptedException {
//        RunThread runThread = new RunThread();
//        runThread.start();
//        Thread.sleep(1000); // 1초
//        runThread.setStop(true);
        InterruptThread interruptThread = new InterruptThread();
        interruptThread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}
        interruptThread.interrupt(); // 인터럽트 실행하는 구문
    }
}
class RunThread extends Thread {
    private boolean stop; // stop 플래그 설정
    public void setStop(boolean stop) {
        this.stop = stop;
    }
    @Override
    public void run() {
        while (!stop) {
            System.out.println("Thread 실행 중....");
        }
        System.out.println("자원 정리 중....");
        System.out.println("실행 종료!");
    }
}
class InterruptThread extends  Thread {
    @Override // 오버라이드에 대한 문법 체크를
    public void run() {
        try {
            while (true) {
                System.out.println("쓰레드 실행 중....");
                Thread.sleep(1);
            }
        } catch (InterruptedException e) {
            System.out.println("인터럽트 발생!!!");
        }
        System.out.println("자원 정리 중....");
        System.out.println("실행 종료!");
    }
}