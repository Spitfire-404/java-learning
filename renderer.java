// stuff for jframes?
import java.awt.*;
import javax.swing.*;

public class renderer extends JFrame {

    renderer(int width, int height) {
        super("window");
        setSize(480, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    void drawline(int x1, int y1, int x2, int y2) {
        g2d.drawLine(x1, y1, x2, y2);
    }
    public Graphics2D g2d;
    public void paint(Graphics g, int x1, int y1, int x2, int y2) {
        g2d = (Graphics2D) g;

        g2d.drawLine(x1, y1, x2, y2);
    }
}