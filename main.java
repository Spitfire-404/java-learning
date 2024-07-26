// main java file

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.*;
import javax.swing.JPanel;

public class main { 
    public static void main(String[] args) throws IOException {
        System.out.println("Hello, World!");
        init();


        
    }
    private static void init() throws IOException {
        final BufferedImage img = ImageIO.read(new File("Chad.jpg"));// new ImageIcon("Chad.jpg").getImage();
        renderer renderer = new renderer(800, 600); // make a new window
        JPanel pane = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(img, 0, 0, null);
            }
        };
        renderer.add(pane);
        renderer.setVisible(true);
    }
}