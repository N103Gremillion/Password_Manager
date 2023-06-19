import javax.swing.*;
import java.awt.*;


public class LoginWindow extends JFrame
{
    //constants
    int Height = 300;
    int Width = 600;

    public LoginWindow(){

        // setup the window
        JFrame Window = new JFrame("Login or Sign up");
        Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Window.pack();
        Window.setLayout(null);
        Window.setVisible(true);
        Window.setSize(Width, Height);
        Window.getContentPane().setBackground(Color.BLACK);
        Window.setResizable(false);
        Window.setLocationRelativeTo(null);

        //login button
        JButton Login = new JButton("Login");
        Login.setBounds(Width/4, Height/4, 150, 75);
        Login.setBackground(Color.GREEN);
        Window.add(Login);

        //Sign up button
        JButton Sign_up = new JButton("Sign Up");
        Sign_up.setBounds(Width/2,Height/4, 150,75);
        Sign_up.setBackground(Color.YELLOW);
        Window.add(Sign_up);

    }

}
