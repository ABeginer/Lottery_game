package Monopoly.ui;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JPanel;

public class Users {

    private ArrayList<User> users;
    private JPanel panelUsers;

    public Users() {
        this.panelUsers = new JPanel();
        this.panelUsers.setLayout(new BorderLayout());
        this.panelUsers.setBounds(10, 10, 200, 80);

        this.users = new ArrayList<User>();

    }

    public User get(int index) {
        if (index > 0 && index < this.users.size()) {
            return this.users.get(index);
        }

        return null;
    }

    public int size() {
        return users.size();
    }

    public JPanel addUser( String name) {
        User user = new User( name);
        this.panelUsers.add(user.getRootUI());
        return this.panelUsers;

    }

}
