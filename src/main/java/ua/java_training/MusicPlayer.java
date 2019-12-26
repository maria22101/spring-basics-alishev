package ua.java_training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private Music music1;
    private Music music2;

    @Autowired // here two dependencies will be injected according to the annotation @ Qualifier
    public MusicPlayer(@Qualifier("classicalMusic") Music music1,
                       @Qualifier("rockMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    String playMusic() {
        return "Playing: " + music1.getSong() + ", " + music2.getSong();
    }

//    private List<Music> music = new ArrayList<>();
//    private String name;
//    private int volume;
//
//    public void setMusic(Music music) {
//        this.music = music;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getVolume() {
//        return volume;
//    }
//
//    public void setVolume(int volume) {
//        this.volume = volume;
//    }

    // method if a field field List<Music> music exist
//    void playMusic() {
//        music.forEach(m -> System.out.println("Playing: " + m.getSong()));
//    }
}
