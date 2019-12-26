package ua.java_training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    @Autowired // here two dependencies will be injected accordingly
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    String playMusic() {
        return "Playing: " + classicalMusic.getSong();
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
