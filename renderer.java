// stuff for jframes?
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.swing.*;

public class renderer extends JFrame{

    // creating a keyadapter object to listen for key events
    KeyAdapter keyAdapter = new KeyAdapter() {

        // override the keypressed method(allow us to do things with keys are pressed)
        @Override
        public void keyPressed(KeyEvent e) {
            System.out.println(e.getKeyCode());
            if(e.getKeyCode() == KeyEvent.VK_R) {// call the repaint method
                repaint();
            }

            if(e.getKeyCode() == KeyEvent.VK_W) {// up
                imagesPos[0][1] -= 10;
                repaint();
            }
            if(e.getKeyCode() == KeyEvent.VK_S) {// down
                imagesPos[0][1] += 10;
                repaint();
            }
            if(e.getKeyCode() == KeyEvent.VK_A) {// left
                imagesPos[0][0] -= 10;
                repaint();
            }
            if(e.getKeyCode() == KeyEvent.VK_D) {// right
                imagesPos[0][0] += 10;
                repaint();
            }
        }
    };


    // width and height of the window for reference
    final private int width;
    final private int height;

    // constructor
    renderer(int width, int height) {
        super("window");//use the jframe constructor to create and name the window
        this.width = width; // set the width
        this.height = height; // set the height
        setSize(width, height); // set the size of the window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ???
        setLocationRelativeTo(null); // set the window in the middle of the screen
        setVisible(true); // make the window visible

        this.addKeyListener(keyAdapter);
    }

    private int[] points; // points to draw
    public Graphics2D g2d; // graphics2d object (the thing that draws the lines and images)

    // override the paint method
    @Override
    public void paint(Graphics g) {
        setSize(width, height); // reset the size of the window
        
        super.paint(g); // call the paint method of the super class
        g2d = (Graphics2D) g; // cast the graphics object to a graphics 2d object
        
        // draw the lines
        for(int i = 0; i < points.length-2; i += 2) {
            g2d.drawLine(points[i], points[i+1], points[i+2], points[i+3]);
        }

        // draw the images
        for(int i = 0; i < images.length; i++) {
            g2d.drawImage(images[i], imagesPos[i][0], imagesPos[i][1], null);
        }
    }
    

    // methods to draw lines
    void drawPoly(int[] pointsToDraw) {
        points = pointsToDraw; // overwrite the points array
        repaint(); //call the repaint method
    }

    BufferedImage[] images; // images to draw
    int[][] imagesPos; // positions of the images to draw

    // methods to draw images
    void drawImg(BufferedImage[] imagesToDraw, int[][] pos) {
        this.imagesPos = pos; // overwrite the imagesPos array
        this.images = imagesToDraw; // overwrite the images array
        repaint(); // call the repaint method
    }

    // a method to manually call the repaint method
    void refresh() {
        repaint(); // call the repaint method
    }
}