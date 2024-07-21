// stuff for jframes?
import java.awt.*;
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

        for(int i = 0; i < points.length; i += 2) {
            g2d.drawLine(points[i], points[i+1], points[i+2], points[i+3]);
        }
            g.drawImage(img, 0,0, this);
}
    void drawPoly(int[] pointsToDraw) {
        points = pointsToDraw;
        repaint();
    }
    void drawImg(ImageIcon[] imagesToDraw) {
        images = imagesToDraw;
        repaint();
    }

    Image img;
    private void loadImg() {
        try{
            img = ImageIO.read(new File("Chad.jpg"));// new ImageIcon("Chad.jpg").getImage();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        //return img;
    }

}