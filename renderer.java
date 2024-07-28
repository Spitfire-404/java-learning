// stuff for jframes?
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class renderer extends Frame{

    // creating a keyadapter object to listen for key events
    KeyAdapter keyAdapter = new KeyAdapter() {

        // override the keypressed method(allow us to do things with keys are pressed)
        @Override
        public void keyPressed(KeyEvent e) {
            if(e.getKeyCode() == KeyEvent.VK_R) {// call the repaint method
                repaint();
            }
            if(e.getKeyCode() == KeyEvent.VK_W) {// up
                if(points != null) {
                    for(int i = 1; i< points.length; i+=2) {
                        points[i] -= 10;
                    }
                }

                if (images != null) {
                    imagesPos[0][1] -= 10;
                }
                repaint();
            }
            if(e.getKeyCode() == KeyEvent.VK_S) {// down
                if(points != null) {
                    for(int i = 1; i< points.length; i+=2) {
                        points[i] += 10;
                    }
                }
                if (images != null) {
                    imagesPos[0][1] += 10;
                }
                repaint();
            }
            if(e.getKeyCode() == KeyEvent.VK_A) {// left
                if(points != null) {
                    for(int i = 0; i< points.length; i+=2) {
                        points[i] -= 10;
                    }
                }

                if (images != null) {
                    imagesPos[0][0] -= 10;
                }
                repaint();
            }
            if(e.getKeyCode() == KeyEvent.VK_D) {// right
                if(points != null) {
                    for(int i = 0; i< points.length; i+=2) {
                        points[i] += 10;
                    }
                }
                if (images != null) {
                    imagesPos[0][0] += 10;
                }
                repaint();
            }

            if(e.getKeyCode() == KeyEvent.VK_ESCAPE) {// exit the program
                System.exit(0);
            }
        }
    };


    // width and height of the window for reference
    final private int width;
    final private int height;

    // constructor
    renderer(int width, int height) throws IOException {
        super("window");//use the jframe constructor to create and name the window
        this.width = width; // set the width
        this.height = height; // set the height
        setSize(width, height); // set the size of the window
        setResizable(false); // make the window not resizable
        setLocationRelativeTo(null); // set the window in the middle of the screen
        setIconImage(ImageIO.read(new File("Chad.jpg"))); // set the icon of the window
        setVisible(true); // make the window visible

        addKeyListener(keyAdapter);// add the key listener
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
        if(points != null) {
            for(int i = 0; i < points.length-2; i += 2) {
                g2d.drawLine(points[i], points[i+1], points[i+2], points[i+3]);
            }
        }

        // draw the images
        if(this.images != null) {
            for(int i = 0; i < images.length; i++) {
                g2d.drawImage(images[i], imagesPos[i][0], imagesPos[i][1], null);
            }
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