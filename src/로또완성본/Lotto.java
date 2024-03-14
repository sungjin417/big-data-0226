package 로또완성본;

import java.util.HashSet;

public class Lotto {
    public static void main(String[]args) {
        HashSet<Integer> set = new HashSet<>();
        while(true) {
            int val = (int)(Math.random()* 45) + 1;
            set.add(val);
            if(set.size() == 6) break;
        }
        System.out.println(set);
    }
}
