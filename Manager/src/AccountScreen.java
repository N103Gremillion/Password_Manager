import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AccountScreen extends JFrame {
    int Width = 1000;
    int Height = 1000;

    public AccountScreen(){
        // set up the window
        JFrame Window = new JFrame("login or sign up");
        Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Window.pack();
        Window.setLayout(null);
        Window.setVisible(true);
        Window.setSize(Width, Height);
        Window.getContentPane().setBackground(Color.BLACK);
        Window.setResizable(false);
        Window.setLocationRelativeTo(null);
    }
}
