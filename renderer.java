// stuff for jframes?
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.swing.*;

public class renderer extends JFrame{
    private int width;
    private int height;
    renderer(int width, int height) {
        super("window");
        this.width = width;
        this.height = height;
        setSize(width, height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        loadImg();
    }
    private int[] points;
    public Graphics2D g2d;
    public void paint(Graphics g) {
        super.paint(g);
        g2d = (Graphics2D) g;
        

}
    void drawPoly(int[] pointsToDraw) {
        points = pointsToDraw;
        repaint();
    }
    BufferedImage[] images;
    void drawImg(BufferedImage[] imagesToDraw) {
        this.images = imagesToDraw;
        repaint();
    }

    private void loadImg() {
        //return img;
    }

}