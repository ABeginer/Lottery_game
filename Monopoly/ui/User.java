package Monopoly.ui;

import java.util.Random;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.*;

//public class UserCollection {
/**
 * this contains users
 *      UML: aggregate or composite 
 *  contains array of users
 * tasks
    - manage users of game: add
    - manage showing color 
    
 */
//}

//rename : this a panel to show a user
public class User  {
    private final int P_WIDTH = 200;
    private final int P_HEIGHT = 50;
    private JLabel labelPlayerNumber;
    Random rand = new Random();
    
    // User, 
    private String name;
    
    JPanel panelUser;
    
    //private conco conco
    // hide. when start play, show it

    public User( String name) {
        
        this.name = name;
       
        this.init();
    }

    private Color randomColor() {
        float r = rand.nextFloat();
        float g = rand.nextFloat();
        float b = rand.nextFloat();
        Color randomColor = new Color(r, g, b);
        return randomColor;
    }

    public JPanel getRootUI (){
        return this.panelUser;
    }

    private JPanel init() {
        if (this.labelPlayerNumber == null){
            this.panelUser = new JPanel();
            this.panelUser.setPreferredSize(new Dimension(P_WIDTH,P_HEIGHT));
            this.panelUser.setBackground(randomColor());
            this.panelUser.setLayout(new FlowLayout());
           
            labelPlayerNumber = new JLabel();
            labelPlayerNumber.setVerticalAlignment(JLabel.TOP);
            labelPlayerNumber.setHorizontalAlignment(JLabel.CENTER);
            labelPlayerNumber.setText(name);
            
            panelUser.add(labelPlayerNumber);
            
        }
        
        return this.panelUser; 
    }

}
