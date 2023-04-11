package lab3;
import java.util.ArrayList;

import javax.swing.*;
public class implimentation6 {
    private JFrame subFrame = new JFrame();
    private JFrame mainFrame = new JFrame();
    JLabel uiLabelAskName = new JLabel();
    JTextField uiTxtField = new JTextField();
    private JButton uiButtonOk = new JButton("OK");
    int counter = 1;
    ArrayList<String> panelLength = new ArrayList<>();
    private JFrame createSubFrame(){
        subFrame.setSize(300,200);
        
        subFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        subFrame.setLayout(null);
        subFrame.setVisible(true);
        return subFrame;
    }
    
    private JLabel createLabel(){
        
        uiLabelAskName.setBounds(50,0,250,50);
        return uiLabelAskName;
    }
    private JTextField creaTextField(){
        
        uiTxtField.setBounds(20,50,250,30);
        return uiTxtField;
    }
    private JButton createButtonOk(){
        uiButtonOk.setBounds(100,120,60,30);
        uiButtonOk.addActionListener(e -> pushOK());
        return uiButtonOk;
    }
    
    private void pushOK(){
        
            uiLabelAskName.setText("input length for bar "+ counter );
            String data = uiTxtField.getText();
            panelLength.add(data);
            uiTxtField.setText(panelLength.get(0));
            counter++;
            
        if(counter >= 7){
            
            mainFrame.setVisible(true);
        }
        
    }
    private JFrame createMainFrame(){
        mainFrame.setSize(600,600);
        
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLayout(null);
        mainFrame.setVisible(false);
        return mainFrame;
    }
    private void execute(){
        this.createSubFrame();
        this.createMainFrame();
        subFrame.add(this.createLabel());
        subFrame.add(this.creaTextField());
        subFrame.add(this.createButtonOk());
        subFrame.setVisible(true);
    }
    
    public void show(){
        this.execute();
        
        
    }
}
