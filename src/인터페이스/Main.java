package 인터페이스;

public class Main {
    public static void main(String[] args) {
//        동물[] 동물들 = {new 강아지(), new 고양이()};
//        for(동물 동물의 : 동물들) {
//            동물의.소리만들기();
//        }
        동물 시츄 = new 강아지();
        System.out.println("시츄의 소리");
        시츄.소리만들기();

        동물 말티즈 = new 강아지();
        System.out.println("말티즈");
        말티즈.소리만들기();

        //고양이 페르시안, 먼치킨의 소리만들기

        동물 페르시안 = new 고양이();
        System.out.println("페르시안의 소리");
        페르시안.소리만들기();

        동물 먼치킨 = new 고양이();
        System.out.println("먼치킨의 소리");
        먼치킨.소리만들기();

        동물 황소 = new 소();
        System.out.println("우리 황소는 우렁차게 !!");
        황소.소리만들기();

        동물 닥스훈트 = new 강아지();
        닥스훈트.소리만들기();
        System.out.print("닥스훈트는 맛있게 사료를");
        닥스훈트.밥먹기();
    }
}
