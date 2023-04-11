package Monopoly.ui;

import java.awt.Color;
import java.util.HashMap;

import javax.swing.*;

public class Dice {
    private JPanel uiPanelDice = new JPanel();
    private JButton uiButtonDice = new JButton("Roll");
    private JLabel uiLabelDiceNumber = new JLabel();

    private HashMap<Integer, ImageIcon> putImg = new HashMap<>();
    private static Dice dice_instance = null;

    private Dice() {

        this.init();
    }

    private void init() {
        uiPanelDice.setLayout(null);
        uiPanelDice.setBackground(new Color(0, 0, 0, 0));
        uiPanelDice.setBounds(650, 300, 200, 300);

        uiButtonDice.setBounds(60, 120, 70, 50);
        uiButtonDice.addActionListener(e -> this.randomDiceNumber());

        uiLabelDiceNumber.setBounds(50, 5, 100, 100);
        this.uiPanelDice.add(uiLabelDiceNumber);
        this.uiPanelDice.add(uiButtonDice);

        uiPanelDice.setVisible(true);

        ImageIcon dice1 = Visual.resizeImage("dice1.png", 100, 100);
        ImageIcon dice2 = Visual.resizeImage("dice2.png", 100, 100);
        ImageIcon dice3 = Visual.resizeImage("dice3.png", 100, 100);
        ImageIcon dice4 = Visual.resizeImage("dice4.png", 100, 100);
        ImageIcon dice5 = Visual.resizeImage("dice5.png", 100, 100);
        ImageIcon dice6 = Visual.resizeImage("dice6.png", 100, 100);

        this.putImg.put(1, dice1);
        this.putImg.put(2, dice2);
        this.putImg.put(3, dice3);
        this.putImg.put(4, dice4);
        this.putImg.put(5, dice5);
        this.putImg.put(6, dice6);
    }

    public JPanel createdDice() {
        return uiPanelDice;
    }

    public void randomDiceNumber() {
        int randNum = (int) (Math.random() * (6) + 1);

        uiLabelDiceNumber.setIcon(putImg.get(randNum));

        uiPanelDice.revalidate();
    }

    public static synchronized Dice getInstance() {
        if (dice_instance == null) {
            dice_instance = new Dice();
        }
        return dice_instance;
    }

}
// ImageIcon dice6 = this.resizeImage("dice{randNum}.png", 100, 100)
// int number = Dice.random();
// this.uiLabelDiceNumber.setIcon(this.map[randNUm])

// di chuyen con co, update UI
// player.addpostion (randNum )
// 18 cells
// if player.postion > MAX then player.position = player.position modulo MAX
// player.account = banco.getvalue (player.position)