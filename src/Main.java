import javax.swing.*;
import java.awt.*;

public class Main{
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setTitle("My Frame");
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(123,50,250));
        ImageIcon image=new ImageIcon("Face");
        frame.setIconImage(image.getImage());


        }


    }
