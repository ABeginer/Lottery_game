package GuiHelloWorld;

import java.awt.Button;
import java.awt.Color;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class User;
class UserList{
    private ArrayList<User> users;
}
class Board{
    private ImageIcon
}
Class MainWindows{
    private UserList uiUserList;
    private Board uiBoard;
    //onclicked to show AddPlayerDialog
    private Button btnAddPlayer;
}

class AddPlayerDialog {
    private Button btnAdd;
    private Button btnCancel;
    private TextField txtUserName;
    private TextField txtBalance;
}

// main 
public class HelloWorld extends JFrame implements ActionListener {
    private static JFrame frame;
    private static JPanel panel;
    private static JLabel world;
    private static JButton button;

    public HelloWorld(){
        this.setupUI();
    }
  
    public void setupUI() {
        //TODO: main windows: board, list of users: name, bal

        frame = new JFrame();
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(null);
        frame.add(panel);

        button = new JButton("Hello");
        button.setBounds(10, 20, 120, 40);
        //TODO create a modal dialog, to add a new player. 
        // on dialog, user enter player name, initial bal
        //              buttons: add, cancel
        // add onClicked:
        //          
        // cancle onClicked:

        button.addActionListener(this);
        panel.add(button);

        world = new JLabel("");
        world.setBounds(10, 60, 120, 40);
        panel.add(world);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        button.setText("I'm clicked");
        button.setBackground(Color.CYAN);
    }

}
