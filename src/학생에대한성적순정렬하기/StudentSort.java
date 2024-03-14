package 학생에대한성적순정렬하기;

import java.util.Scanner;
import java.util.TreeSet;

public class StudentSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<StudentInfo> list = new TreeSet<>();
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            String name = sc.next();
            int score = sc.nextInt();
            list.add(new StudentInfo(name, score));
        }
        for (StudentInfo e : list) System.out.println(e.name + " : " + e.score);
    }
}
class StudentInfo implements Comparable<StudentInfo> {
    String name;
    int score;
    public StudentInfo(String name, int score) {
        this.name = name;
        this.score = score;
    }
    @Override
    public int compareTo(StudentInfo o) {
        if (this.score < o.score) return 1;
        else if (this.score == o.score) {
            return name.compareTo(o.name);
        }else return -1;
    }
}
