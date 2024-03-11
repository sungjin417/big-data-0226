package 디폴트메소드;

public class Audio implements RemoteControl {
    private int volume;
    @Override
    public void turnON() {
        System.out.println("Audio를 켭니다.");
    }

    @Override
    public void turnOFF() {
        System.out.println("Audio를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 Audio 볼륨 : " + this.volume);
    }


    @Override
    public void setMute(boolean mute) {
        if (mute) System.out.println("오디오를 무음으로 처리 합니다.");
        else System.out.println("오디오 무음 처리를 해제 합니다.");
    }
}
