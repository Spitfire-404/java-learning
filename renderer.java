// stuff for jframes?
import java.awt.*;
import javax.swing.*;

public class renderer extends JFrame{

    renderer(int width, int height) {
        super("window");
        setSize(480, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    private int[] points;
    public Graphics2D g2d;
    public void paint(Graphics g) {
        super.paint(g);
        g2d = (Graphics2D) g;

        for(int i = 0; i < points.length; i += 2) {
            g2d.drawLine(points[i], points[i+1], points[i+2], points[i+3]);
        }
}
    void draw(int[] pointsToDraw) {
        points = pointsToDraw;
        repaint();
    }

}