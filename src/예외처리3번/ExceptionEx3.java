package 예외처리3번;

public class ExceptionEx3 {
    public static void main(String[] args) {
        Test test = null;
        try {
            String testStr = test.name;
            System.out.println(testStr);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException 예외 발생!!!");
        }
    }
}
class Test {
    String name = "곰돌이사육사";
}