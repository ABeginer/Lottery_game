package Monopoly.ui;


import javax.swing.*;
public class Board {
    private static Board instance = null;
    private JLabel uiBoard = null;
    
    private Board(){
        this.init();
    }

    private void init (){
        uiBoard = new JLabel();
        
        
        ImageIcon banCo = Visual.resizeImage("banco.jpg", 800, 800);
        //cell: x,y,w,h. x1 = x+w/3, y1= y+h/4 set (350+x1, 0 + y1 )
        uiBoard.setBounds(350, 0, 800, 800);
        uiBoard.setIcon(banCo);
    }

    public JLabel createBoard() {
       return this.uiBoard;    
    }

    public static synchronized Board getInstance(){
        if(instance == null ){
            instance = new Board();
        }
        return instance;
    }

}
