package 사용자정의예외클래스;

public class CustomExceptionEx {
    public static void main(String[] args) {
        CheckEven checkEven = new CheckEven();
        int number1 = 100;
        int number2 = 99;
        try {
            System.out.println(checkEven.printEven(number1));
            System.out.println(checkEven.printEven(number2));
        } catch (EvenException e) {
            e.printStackTrace();
        }
    }
}
class CheckEven {
    private int num;
    public void setNum(int num) {
        this.num = num;
    }
    public int printEven(int number) throws EvenException {
        this.num = number;
        if (num % 2 != 0) throw new EvenException(num);
        else return num;
    }
}
class EvenException extends Exception {
    private Integer number = null;
    public EvenException(int number) {
        this. number = number;
    }
    @Override
    public String getMessage() {
        if (number == null) {
            return "숫자가 아닙니다.";
        } else {
            return Integer.toString(number) + "는 짝수가 아닙니다.";
        }
    }
}