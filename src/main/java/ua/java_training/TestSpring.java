package ua.java_training;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = context.getBean("classicalMusic", ClassicalMusic.class);
        System.out.println(classicalMusic1 == classicalMusic2); // true when @Scope - singleton, false - when prototype


//        Computer computer = context.getBean("computer", Computer.class);
//        System.out.println(computer.toString());

//        musicPlayer.playMusic();
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());

//        RockMusic rockMusic = context.getBean("rockMusic", RockMusic.class);
//        ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);


        context.close();
    }
}
