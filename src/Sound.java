import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public abstract class Sound {
    public static void playSound(){
        try {
            File soundFile = new File("src/battlesound.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.start();
            Thread.sleep(2000);
            clip.stop();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
