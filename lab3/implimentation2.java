package lab3;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class implimentation2 extends JFrame {

    /**
     * This program demonstrates how to draw lines using Graphics2D object.
     * 
     * @author www.codejava.net
     *
     */

    public implimentation2() {
        super("Lines Drawing Demo");

        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    void drawLines(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.drawLine(10, 10, 500, 500);
        g2d.drawLine(500, 0, 0, 500);
        g2d.drawLine(250, 0, 250, 500);
        g2d.drawLine(0, 250, 500, 250);

    }

    public void paint(Graphics g) {
        super.paint(g);
        drawLines(g);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new implimentation2().setVisible(true);
            }
        });
    }

}
