import java.io.File;
import java.io.IOException;

public class Main {
    /**
     * This main method records a 30 second video of the animated picture
     */
    public static void main(String[] args) {
        String filename = "WinterScene.mp4";
        int videoLength = 30; // seconds
        try {
            Canvas.saveToVideoFile(new File(filename), videoLength);            
        } catch (IOException e) {
            System.err.println(e);
            System.err.println("Could not save file.");
        }
    }
}