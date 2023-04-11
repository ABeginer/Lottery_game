package test;

import javax.swing.*;

import java.awt.*;

public class test {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLayout(null);

        JLayeredPane pane1 = new JLayeredPane();
        pane1.setBounds(0,0,600,600);
        
        JLayeredPane pane2 = new JLayeredPane();
        pane2.setBounds(200,200,200,200);
        JPanel panel2 = new JPanel();
        panel2.setBounds(0,0,100,100);
        panel2.setBackground(Color.GREEN);

        JPanel panel22 = new JPanel();
        panel22.setBounds(60,0,100,100);
        panel22.setBackground(Color.RED);

        pane2.add(panel2, Integer.valueOf(0));
        pane2.add(panel22, Integer.valueOf(1));
        
        pane1.add(pane2, Integer.valueOf(0));

        frame.add(pane1);
        pane2.revalidate();
        frame.setVisible(true);
    }
   
}
