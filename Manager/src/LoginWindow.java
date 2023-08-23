import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


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
        Login.setBackground(Color.CYAN);
        Window.add(Login);

        //action Listener for login
        Login.addActionListener(e -> {
            Window.dispose();
            Create_Login_Window Login_Window = new Create_Login_Window();
        });

        //Sign up button
        JButton Create_Account = new JButton("Create Account");
        Create_Account.setBounds(Width/2,Height/4, 150,75);
        Create_Account.setBackground(Color.LIGHT_GRAY);
        Window.add(Create_Account);

        //action Listener for sign_up
        Create_Account.addActionListener(e -> {
            Window.dispose();
            Create_Account_Window Creation_Window = new Create_Account_Window();
        });

    }

}
