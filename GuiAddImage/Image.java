package GuiAddImage;
import javax.swing.*;

public class Image extends JFrame {
    public static Object SCALE_DEFAULT;
    public ImageIcon image(){
        ImageIcon image = new ImageIcon(getClass().getResource("image1.JPG"));
        return image;
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        frame.add(panel);

        Image im = new Image();
        ImageIcon newImage = im.image();

        JLabel putImage = new JLabel();
        putImage.setBounds(10,20,400,200);
        putImage.setIcon(newImage);
        panel.add(putImage);
        frame.setVisible(true);

        
    }
}
