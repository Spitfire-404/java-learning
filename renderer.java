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
    }
    private int[] points;
    public Graphics2D g2d;
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g2d = (Graphics2D) g;
        for(int i = 0; i < points.length-2; i += 2) {
            g2d.drawLine(points[i], points[i+1], points[i+2], points[i+3]);
        }
        for(int i = 0; i < images.length; i++) {
            g.drawImage(images[i], imagesPos[i][0], imagesPos[i][1], null);
        }
    }
    
    void drawPoly(int[] pointsToDraw) {
        points = pointsToDraw;
        repaint();
    }

    BufferedImage[] images;
    int[][] imagesPos;
    void drawImg(BufferedImage[] imagesToDraw, int[][] pos) {
        this.imagesPos = pos;
        this.images = imagesToDraw;
        repaint();
    }

    void refresh() {
        repaint();
    }

}