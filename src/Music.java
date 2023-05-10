


import java.io.File;

import javax.sound.sampled.*;


public class Music{

    public Music() {
       try {
           File audioFile = new File("src//FlappyBirdThemeSong.wav");
           AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
           Clip clip = AudioSystem.getClip();
           clip.open(audioStream);
           clip.loop(Clip.LOOP_CONTINUOUSLY);
       } catch (Exception e){

           e.printStackTrace();
       }


    }
}
