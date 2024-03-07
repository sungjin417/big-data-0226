package 중복없는로또번호2;

import java.util.ArrayList;
import java.util.List;

// ArrayList 사용방법 : 배열과 유사하지만 크기를 정하지 않고 사용 가능
public class LottoArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(); // 컬랙션프레임워크에서 다룰 예정
        int tmp = 0; // 생성된 로또 번호를 담는 변수
        while (true) {
            tmp = (int)((Math.random() * 45) + 1);
            if(!list.contains(tmp)) list.add(tmp);
            if(list.size() == 6) break;
        }
        System.out.println(list);
    }
}
