package 인터페이스;

public class Sonata implements Car{
    public void start(){
        System.out.println("소나타 시동을 걸었습니다.");
    }
    public void stop(){
        System.out.println("소나타 시동을 끕니다.");
    }
}
