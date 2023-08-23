import javax.swing.*;
import java.awt.*;

public class Create_Account_Window extends JFrame
{
    int Height = 500;
    int Width = 400;

    //constructor
    public Create_Account_Window(){

        //set up window
        JFrame Create_Window = new JFrame("Create your account.");
        Create_Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Create_Window.pack();
        Create_Window.setLayout(null);
        Create_Window.setVisible(true);
        Create_Window.setSize(Width, Height);
        Create_Window.getContentPane().setBackground(Color.lightGray);
        Create_Window.setResizable(false);
        Create_Window.setLocationRelativeTo(null);

        // email text field
        JTextField email_login = new JTextField("email");
        email_login.setBounds(Width/3 -25, Height/4 -20, 150, 50);
        email_login.setBackground(Color.gray);
        email_login.setHorizontalAlignment(email_login.CENTER);
        Create_Window.add(email_login);

        // back button
        JButton Back = new JButton("go back");
        Back.setBounds(Width/3, Height/15 -5, 100, 50);
        Back.setBackground(Color.white);
        Create_Window.add(Back);

        // password text field
        JTextField Password = new JTextField("password");
        Password.setBounds(Width/3 -25, Height/2 -50, 150, 50);
        Password.setBackground(Color.gray);
        Password.setHorizontalAlignment(Password.CENTER);
        Create_Window.add(Password);

        // confirm password test field
        JTextField Confirm_Password = new JTextField("confirm password");
        Confirm_Password.setBounds(Width/3 -25 , Height - 200,  150, 50);
        Confirm_Password.setBackground(Color.gray);
        Confirm_Password.setHorizontalAlignment(Password.CENTER);
        Create_Window.add(Confirm_Password);

        // submit button
        JButton Submit = new JButton("submit");
        Submit.setBounds(Width/3 , Height - 125, 100, 50);
        Submit.setBackground(Color.white);
        Create_Window.add(Submit);
    }
}
