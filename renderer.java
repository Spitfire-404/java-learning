// stuff for jframes?
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
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
    private ImageIcon[] images;
    public Graphics2D g2d;
    public void paint(Graphics g) {
        super.paint(g);
        g2d = (Graphics2D) g;

}
    void drawPoly(int[] pointsToDraw) {
        points = pointsToDraw;
        repaint();
    }
    void drawImg(ImageIcon[] imagesToDraw) {
        images = imagesToDraw;
        repaint();
    }

    private void loadImg() {
        //return img;
    }

}