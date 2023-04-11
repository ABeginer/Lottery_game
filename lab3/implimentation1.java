package lab3;



import javax.swing.*;
public class implimentation1 {
    private JFrame frame = new JFrame();
    JLabel uiLabelAskName = new JLabel("What is your name: ");
    JTextField uiTxtField = new JTextField();
    private JButton uiButtonOk = new JButton("OK");
    private JButton uiButtonCancel = new JButton("Cancel");
    private JFrame createFrame(){
        frame.setSize(300,200);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
        return frame;
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
    private JButton createButtonCancel(){
        uiButtonCancel.setBounds(140,120,60,50);
        uiButtonCancel.addActionListener(e -> this.createFrame().setVisible(false));
        return uiButtonOk;
    }
    private void pushOK(){
        String name = "Welcome " +this.creaTextField().getText()+" to Java Progarming";
        this.createLabel().setText(name);
        this.uiTxtField.setVisible(false);
        this.uiButtonOk.setVisible(false);
        this.uiButtonCancel.setVisible(false);
    }
    public void show(){
        this.createFrame();
        frame.add(this.createLabel());
        frame.add(this.creaTextField());
        frame.add(this.createButtonOk());
        frame.add(this.createButtonCancel());
        frame.setVisible(true);
    }
}
