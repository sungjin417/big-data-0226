package 오브젝트클래스;
// 오브젝트 클래스는 모든 클래스의 조상 클래스
public class ObjectClass {
    public static void main(String[] args) {
        Student student = new Student();
        Car car1 = new Car();
        Car car2 = new Car();
        System.out.println(car1.toString());
        System.out.println(car2.toString());
    }
}

class Student {
    int id;
    String name;
}
class  Car {

}
