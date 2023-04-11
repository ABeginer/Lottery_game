package Monopoly.ui;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.*;

public class AddPlayerDialog extends MainWindow {

    private JPanel playerPanel;

    private JLabel uiLabelInputName;
    private JTextField uiTxtFieldName;

    private Users users;

    JPanel uiPanelShowPlayer = new JPanel();
    private JButton addNewPlayer;

    private JButton uiButtonDone;

    private JLabel uiLabelWarning = new JLabel();
    private JButton uiButtonOk = new JButton("OK");

    private final int WIDTH = 200;

    public AddPlayerDialog(boolean visible) {
        this.init();

        this.setVisible(true);

    }

    public JPanel createPlayerPanel() {
        playerPanel = new JPanel();
        playerPanel.setLayout(new FlowLayout());

        playerPanel.setBounds(0, 0, 330, 130);
        playerPanel.setVisible(true);
        return playerPanel;

    }

    public void setVisible(boolean visible) {
        this.playerPanel.setVisible(visible);
    }

    public void init() {
        this.createPlayerPanel();

        uiLabelInputName = new JLabel("   input new player name: ");
        uiLabelInputName.setPreferredSize(new Dimension(WIDTH, 20));
        playerPanel.add(uiLabelInputName);

        uiTxtFieldName = new JTextField();
        uiTxtFieldName.setPreferredSize(new Dimension(300, 30));
        playerPanel.add(uiTxtFieldName);

        uiButtonDone = new JButton("Done");
        playerPanel.add(uiButtonDone);
        uiButtonDone.addActionListener(e -> this.pushDone());

        addNewPlayer = new JButton("Add player");
        addNewPlayer.addActionListener(e -> showPlayerList());
        playerPanel.add(addNewPlayer);

        uiLabelWarning.setText("ERROR: you haven't input your name!!!");
        uiLabelWarning.setPreferredSize(new Dimension(WIDTH + 20, 20));
        uiLabelWarning.setVisible(false);
        playerPanel.add(uiLabelWarning);

     

        playerPanel.setVisible(true);

    }
    public void pushDone(){
        this.playerPanel.setVisible(false);
        
        this.uiLayeredMainPane.revalidate();
    }

    public void showPlayerList() {

        if (uiTxtFieldName.getText().equals("")) {
            uiButtonOk.setVisible(true);
            uiLabelWarning.setVisible(true);

        }

        else {

            this.uiLabelWarning.setVisible(false);
            this.users = new Users();
            uiPanelShowPlayer.setBounds(0, 120, WIDTH, 600);

            uiPanelShowPlayer.add(this.users.addUser(uiTxtFieldName.getText()));
            uiPanelShowPlayer.revalidate();
           
            uiTxtFieldName.setText(null);

            uiPanelShowPlayer.setVisible(true);
        }

    }

    public JPanel showAddPlayerPanel() {
        playerPanel.setVisible(true);
        return this.playerPanel;

    }

    public JPanel showPlayerName() {
        uiPanelShowPlayer.setVisible(true);
        return uiPanelShowPlayer;
    }
}

// values = ["", "100", "-50", "1000", , ..]
// 50 o

// active: player 1
// lac: +1
// current position: 0
// current pos = cur pos +1 = 1
// bal += values[1]

// next player => inactive

// active: player 2