package 싱글톤;

public class Singleton {
    String name;
    int id;
    private  static final Singleton singleton = new Singleton();
    private Singleton() { // 생성자를 통해서 객체 생성이 되는 걸 막기 위해 private으로 정의
        name = "test";
        id = 100;
    }
    static Singleton getSingleton() {
        return singleton;
    }
}
