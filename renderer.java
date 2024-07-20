// stuff for jframes?
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.*;
import javax.swing.*;

public class renderer {
    private JFrame frame;
    private Graphics2D g2d;
    private Graphics g;

    public void drawline(int x1, int y1, int x2, int y2) {
        g2d.setColor(Color.BLUE);
        Rectangle2D line = new Rectangle2D.Double(x1, y1, x2, y2);
        g2d.fill(line);
    }
    
    public renderer(int width, int height) {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width, height);
        frame.setVisible(true);
    }

}