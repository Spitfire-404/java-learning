// main java file

import javax.imageio.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class main { 
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        init();

        final BufferedImage img = ImageIO.read(new File("Chad.jpg"));// new ImageIcon("Chad.jpg").getImage();
    }
    private static void init() {
        renderer renderer = new renderer(800, 600); // make a new window
    }
}