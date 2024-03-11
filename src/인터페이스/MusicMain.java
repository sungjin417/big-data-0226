package 인터페이스;

public class MusicMain {
    public static void main(String[] args) {
        Playable music = new Music();
        Playable video = new Video();

        music.play();
        video.play();
    }
}
