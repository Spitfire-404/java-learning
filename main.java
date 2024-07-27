// main java file

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.*;

public class main { 
    public static void main(String[] args) throws IOException {
        System.out.println("Hello, World!");
        init();


        
    }
    private static void init() throws IOException {
        BufferedImage img = ImageIO.read(new File("Chad.jpg"));// choose an image to draw
        renderer renderer = new renderer(800, 600); // make a new window
        //                                                                             |                                                                     |
        //                                                                             v NOTE: think of input as a buffer, any previous input is overwritten v
        renderer.drawImg(new BufferedImage[]{img, img}, new int[][]{{0,0},{300,300}}); // draw the image
        renderer.drawPoly(new int[]{100, 100, 200, 100, 200, 200, 100, 200, 100, 100}); // draw lines
        renderer.setVisible(true);
        renderer.refresh();
    }
}