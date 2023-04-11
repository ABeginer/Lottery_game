package Gui;

import javax.swing.*;

public class Component {
    public JFrame createFrame(){
        JFrame frame = new JFrame("Login GUI");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return frame ;
        
    }
    public JPanel createPanel(){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        return panel; 
    }
}
