package 열거타입;
// 열거타입이란 ? 한정된 값이 열거 상수 중에서 하나의 상수를 저장하는 타입
// 입력 값의 타입을 제한할 수 있음
public class EnumEx {
    public static void main(String[] args) {
        Developer developer =
                new Developer("곰돌이", Career.SENIOR, DevType.FRONTEND, Gender.MALE);
        developer.devInfo();
    }
}
enum Career {
    JUNIOR, SENIOR
}
enum DevType {
    MOBILE, FRONTEND, BACKEND, DBA
}
enum Gender {
    MALE, FEMALE
}
class Developer {
    private String name;
    private Career career; // 개발자 등급 (senior, junior)/(원하는 값만 올 수 있게 함)
    private DevType devType; // 개발자 업무
    private Gender gender;

    public Developer(String name, Career career, DevType devType, Gender gender) {
        this.name = name;
        this.career = career;
        this.devType = devType;
        this.gender = gender;
    }
    public void devInfo() {
        System.out.println("이름 : " + name);
        System.out.println("업무 : " + devType);
        System.out.println("경력 : " + career);
        System.out.println("성별 : " + gender);
    }
}