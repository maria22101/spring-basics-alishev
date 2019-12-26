package ua.java_training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;
    private Music music1;
    private Music music2;

    @Autowired // here two dependencies will be injected according to the annotation @ Qualifier
    public MusicPlayer(@Qualifier("classicalMusic") Music music1,
                       @Qualifier("rockMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public int getVolume() {
        return volume;
    }

    public String getName() {
        return name;
    }

    String playMusic() {
        return "Playing: " + music1.getSong() + ", " + music2.getSong();
    }

//    private List<Music> music = new ArrayList<>();

//    public void setMusic(Music music) {
//        this.music = music;
//    }

    // method if a field field List<Music> music exist
//    void playMusic() {
//        music.forEach(m -> System.out.println("Playing: " + m.getSong()));
//    }
}
