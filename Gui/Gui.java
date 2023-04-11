package Gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Gui extends JFrame implements ActionListener {
    private static JLabel label;
    private static JLabel userName;
    private static JLabel userPass;
    private static JLabel loginText;
    private static JLabel putImage;
    private static JTextField inputUserName;
    private static JTextField inputPass;
    private static JButton enterButton;
    private static ImageIcon image;

    public static void main(String[] args) {

        Component com = new Component();
        JFrame frame = com.createFrame();
        JPanel panel = com.createPanel();
        frame.add(panel);

        label = new JLabel("welcome to my 1st GUI");
        label.setBounds(100, 20, 200, 30);
        panel.add(label);

        userName = new JLabel("USER NAME: ");
        userName.setBounds(10, 50, 200, 30);
        panel.add(userName);

        inputUserName = new JTextField();
        inputUserName.setBounds(100, 50, 125, 25);
        panel.add(inputUserName);

        userPass = new JLabel("PASSWORD");
        userPass.setBounds(10, 80, 200, 30);
        panel.add(userPass);

        inputPass = new JPasswordField();
        inputPass.setBounds(100, 80, 125, 25);
        panel.add(inputPass);

        enterButton = new JButton("Enter");
        enterButton.setBounds(100, 120, 75, 30);
        enterButton.addActionListener(new Gui());

        panel.add(enterButton);

        loginText = new JLabel("");
        loginText.setBounds(100, 140, 200, 30);
        panel.add(loginText);
        
        putImage = new JLabel();
        putImage.setBounds(100,170,200,200);
        panel.add(putImage);
        frame.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        String user = inputUserName.getText();
        String pass = inputPass.getText();
        if(user.equals("thuan")&& pass.equals("123")){
            loginText.setText("Login Successful");
            image = new ImageIcon(getClass().getResource("image1.JPG"));
            putImage.setIcon(image);
        }
        else{
            loginText.setText("Username or Password is incorrect");
            image = new ImageIcon(getClass().getResource("image2.JPG"));
            putImage.setIcon(image);
        }
    }

}
