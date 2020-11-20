
/**
 * Draw a pretty picture composed of shape objects on a canvas
 * 
 * @author: (Your name)
 * @version: (Date)
 * 
 */
import java.io.File;
import java.io.IOException;

public class Picture {
    // Private member (instance) variables
    private Canvas canvas;
    private Circle ball;
    private int dx = 5; // Speed in x direction
    private int dy = -5; // Speed in y direction
    
    /**
     * Create a picture that will be the first frame of animation
     */
    public Picture()
    {
        // Get a reference to the canvas for this drawing and set its title.
        canvas = Canvas.getCanvas();
        canvas.setTitle("Bouncing Ball");
        canvas.setBackgroundColor("white");
        
        // Turn off automatic redrawing
        canvas.pause(true);
        
        // Initialize the shapes in the picture and show them
        ball = new Circle();
        ball.makeVisible();
        
        // Show the initial picture
        canvas.redraw();
    }
    
    /**
     * Update the picture to display the next frame of animation.
     */
    public void update() 
    {
        int x = ball.getX();
        int y = ball.getY();
        
        // Calculate a new position for the ball
        x = x + dx;
        y = y + dy;        
        
        // Bounce off the edges of the picture
        if (x < 0) {
            x = 0;
            dx = -dx;
        }
        else if (x + ball.getDiameter() > canvas.getWidth()) {
            dx = -dx;
            x = canvas.getWidth() - ball.getDiameter();
        }
        if (y < 0) {
            y = 0;
            dy = -dy;
        }        
        else if (y + ball.getDiameter() > canvas.getHeight()) {
            y = canvas.getHeight() - ball.getDiameter();
            dy = -dy;
        }
        
        // Move the ball
        ball.setPosition(x, y);
        
        canvas.redraw();
    }
    
    
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