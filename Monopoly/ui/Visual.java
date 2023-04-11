package Monopoly.ui;
import java.awt.Image;

import javax.swing.*;

// //Singleton
// public class Config {
//     public void String get(String settingName){

//     }
// }

public class Visual {
    
    public static ImageIcon resizeImage(String imageName, int imageWidth, int imageHeight) {
        ImageIcon image ;
        String pathImage = "/Monopoly/resource/" + imageName;
        image = new ImageIcon(Visual.class.getResource(pathImage));
        Image resizeImage = image.getImage().getScaledInstance(imageWidth, imageHeight, Image.SCALE_SMOOTH);

        image = new ImageIcon(resizeImage);
        return image;

    }
}
