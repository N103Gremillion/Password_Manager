import javax.swing.*;
import java.awt.*;

public class Create_Account_Window extends JFrame
{
    int Height = 300;
    int Width = 600;

    //constructor
    public Create_Account_Window(){

        //setup window
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
        TextField email_login = new TextField("Email");
        email_login.setBounds(Width/2, Height/4, 150, 75);
        Create_Window.add(email_login);
    }
}
