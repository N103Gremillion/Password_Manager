import javax.swing.*;
import java.awt.*;
public class Create_Login_Window extends JFrame
{
    int Height = 400;
    int Width = 400;

    //constructor
    public Create_Login_Window(){

        //setup window
        JFrame Log_Window = new JFrame("Login");
        Log_Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Log_Window.pack();
        Log_Window.setLayout(null);
        Log_Window.setVisible(true);
        Log_Window.setSize(Width, Height);
        Log_Window.getContentPane().setBackground(Color.BLUE);
        Log_Window.setResizable(false);
        Log_Window.setLocationRelativeTo(null);

        // email text field
        TextField email_login = new TextField("Email");
        email_login.setBounds(Width/3 -25, Height/4 +5, 150, 50);
        email_login.setBackground(Color.CYAN);
        Log_Window.add(email_login);

        // password text field
        TextField password = new TextField("Password");
        password.setBounds(Width/3 -25, Height/2 -5, 150, 50);
        password.setBackground(Color.CYAN);

        Log_Window.add(password);

        // submit button
        JButton Submit = new JButton("Submit");
        Submit.setBounds(Width/3 , Height - 125, 100, 50);
        Submit.setBackground(Color.CYAN);
        Log_Window.add(Submit);

        // back button
        JButton Back = new JButton("Go back");
        Back.setBounds(Width/3, Height/15, 100, 50);
        Back.setBackground(Color.CYAN);
        Log_Window.add(Back);

    }
}
