package 슈퍼변수와메소드;
// super : 자식클래스가 부모클래스로 부터 상속받은 멤버를 참조할 때 사용하는 참조변수
// super() : 자식클래스에서 부모클래스의 생성자를 호출하는 메소드
public class SuperEx {
    public static void main(String[] args) {
        Child child = new Child(40); // child 클래스의 참조변수 Child클래스로 생성된 객체를 참조 함
        child.childMethod();

    }
}


class  Parent {
    int x = 10;
    //Parent() {}
    Parent(int x) {
        this.x = x;
    }
}

class Child extends Parent {
    int x = 20; //

    Child(int x) {
        super(x);
    }

    void childMethod() {
        System.out.println(("x : " + x));
        System.out.println("this.x : " + this.x);
        System.out.println("super.x : " + super.x);
    }
}
