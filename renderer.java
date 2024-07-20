// stuff for jframes?
import javax.swing.*;

public class renderer {
    private JFrame frame;
    public renderer(int width, int height) {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width, height);
        frame.setVisible(true);
    }
}