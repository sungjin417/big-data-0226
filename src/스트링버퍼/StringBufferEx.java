package 스트링버퍼;
// StringBuffer와 StringBulider는 문자열을 추가 하거나 변경 할 때 사용
// 동일한 기능을 하는 String을 사용하면 좀 더 간결 하기는 함!!!
// String 자료형과의 차이는 문자열이 여러번 반복 추가되어서 한번만 생성
public class StringBufferEx {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        sb.append(" ");
        sb.append("Java");
        sb.delete(0, 3);
        sb.insert(0, "HHH");
        System.out.println(sb);
//        String str = "";
//        str += "Hello";
//        str += " ";
//        str += "Java";
//        System.out.println(str);

    }
}
