/**
 * Draw a pretty picture composed of shape objects on a canvas
 * 
 * @author: (Your name)
 * @version: (Date)
 * 
 */

public class Picture
{
    public static void main(String[] args)
    {
        // Get a reference to the canvas for this drawing
        Canvas pic = Canvas.getCanvas();
        
        // Set the title and background for the picture
        pic.setTitle("My Picture");
        pic.setBackgroundColor("white");
        
        // Draw my picture
        Circle c = new Circle();
        c.makeVisible();
                
        pic.redraw();
    }
}