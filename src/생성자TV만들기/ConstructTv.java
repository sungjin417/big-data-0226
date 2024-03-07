package 생성자TV만들기;

public class ConstructTv {
    public static void main(String[] args) {
        TV lgTV = new TV(); // 기본 생성자로 TV생성
        lgTV.setON(true);
        lgTV.setVolume(200);
        lgTV.setChannel(980);
        lgTV.prnTvInfo();

        TV samsungTV = new TV(true, 250, 99);
        samsungTV.prnTvInfo();
    }
}
