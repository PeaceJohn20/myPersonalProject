import javax.swing.*;
import java.awt.*;


public class label {
    public static void main(String[] args) {
        JLabel label=new JLabel("Very Cutesy,Very Demure,Very Mindful");
        ImageIcon image=new ImageIcon("very.jpg");
        label.setIcon(image);

        JFrame frame=new JFrame();
        frame.setTitle("VERY PRETTY");
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.add(label);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setFont(new Font("Serif",Font.BOLD,20));
        label.setIconTextGap(-30);
        label.setForeground(new Color(0,0,0));
        label.setBackground(new Color(255,255,255));
        label.setOpaque(true);

    }
}