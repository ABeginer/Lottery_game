package lab3;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class implimentation3 extends JFrame {

    /**
     * This program demonstrates how to draw lines using Graphics2D object.
     * 
     * @author www.codejava.net
     *
     */

    public implimentation3() {
        super("Lines Drawing Demo");

        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    void drawLines(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        int x1 = 450;
        int y1 = 50;
        for (int a = 0; a < 15; a++) {
            g2d.drawLine(0, 30, x1, y1);
            x1 -= 30;
            y1 += 30;
        }
        int x2 = 50;
        for (int a = 0; a < 15; a++) {
            g2d.drawLine(x2, x2, 500, 30);
            x2 += 30;
        }
        int x3 = 50;

        for (int a = 0; a < 15; a++) {
            g2d.drawLine(0, 500, x3, x3);
            x3 += 30;

        }
        int x4 = 450;
        int y4 = 50;
        for (int a = 0; a < 15; a++) {
            g2d.drawLine(500, 500, x4, y4);
            x4 -= 30;
            y4 += 30;

        }

    }

    public void paint(Graphics g) {
        super.paint(g);
        drawLines(g);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new implimentation3().setVisible(true);
            }
        });
    }

}
