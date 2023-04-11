package Monopoly.ui;

import javax.swing.*;

public class MainWindow extends JFrame {

    private JFrame boardFrame;

    private JPanel uiPanelWelcome = new JPanel();
    private ImageIcon uiImageIconWelcome;
    private JLabel uiLabelWelcome = new JLabel();
    private JButton uiButtonStart = new JButton();
    private JButton uiButtonQuit = new JButton("Quit");

    protected JLayeredPane uiLayeredMainPane = new JLayeredPane();
    // private map <byte, ImageIcon>
    // private AddPlayerDialog addPlayerDlg
    // listen event of an object
    // private void eventhandler_AddPlayerDialogClosed();

    Visual im = new Visual();
    Dice dice = Dice.getInstance();
    Board board = Board.getInstance();

    public JFrame creatBoardFrame() {
        boardFrame = new JFrame("BOARD");
        boardFrame.setSize(1250, 850);

        boardFrame.setLocationRelativeTo(null);

        boardFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        boardFrame.setLayout(null);

        boardFrame.setVisible(true);
        return boardFrame;
    }

    public JLayeredPane createGamePane() {
        uiLayeredMainPane.setBounds(0, 0, 1250, 850);
        uiLayeredMainPane.setVisible(true);
        boardFrame.add(uiLayeredMainPane);
        return uiLayeredMainPane;

    }

    public void createWelcomePanel() {

        uiPanelWelcome.setBounds(0, 0, 1250, 850);
        ImageIcon startImg = im.resizeImage("buttonstart.png", 100, 100);
        ImageIcon quitImg = im.resizeImage("buttonQuit.png", 130, 100);
        uiImageIconWelcome = im.resizeImage("welcome.jpg", 1250, 850);

        uiLabelWelcome.setBounds(0, 0, 1250, 850);
        uiLabelWelcome.setIcon(uiImageIconWelcome);

        uiButtonStart.setBounds(570, 470, 79, 78);
        uiButtonStart.setIcon(startImg);
        uiButtonStart.addActionListener(e -> this.pushStart());

        uiButtonQuit.setBounds(570, 580, 79, 78);
        uiButtonQuit.setIcon(quitImg);
        uiButtonQuit.addActionListener(e -> this.boardFrame.setVisible(false));

        uiPanelWelcome.add(uiLabelWelcome);
        uiLayeredMainPane.add(uiPanelWelcome, Integer.valueOf(2));
        uiLayeredMainPane.add(uiButtonStart, Integer.valueOf(3));
        uiLayeredMainPane.add(uiButtonQuit, Integer.valueOf(3));

    }

    private void setWelcomeUIVisible(boolean visible) {
        this.uiPanelWelcome.setVisible(visible);
        this.uiButtonStart.setVisible(visible);
        this.uiButtonQuit.setVisible(visible);
    }

    public void pushStart() {
        this.setWelcomeUIVisible(false);
    }

    public void show() {
        this.creatBoardFrame();
        this.createGamePane();
        this.createWelcomePanel();
        AddPlayerDialog p = new AddPlayerDialog(true);
        uiLayeredMainPane.add(board.createBoard(), Integer.valueOf(0));
        uiLayeredMainPane.add(p.showAddPlayerPanel(), Integer.valueOf(0));
        uiLayeredMainPane.add(p.showPlayerName(), Integer.valueOf(0));
        uiLayeredMainPane.add(dice.createdDice(), Integer.valueOf(1));

        boardFrame.setVisible(true);

    }

}
