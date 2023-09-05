import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
public class Create_Login_Window extends JFrame
{
    int Height = 400;
    int Width = 400;

    //constructor
    public Create_Login_Window(){

        //set up window
        JFrame Log_Window = new JFrame("login");
        Log_Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Log_Window.pack();
        Log_Window.setLayout(null);
        Log_Window.setVisible(true);
        Log_Window.setSize(Width, Height);
        Log_Window.getContentPane().setBackground(Color.BLACK);
        Log_Window.setResizable(false);
        Log_Window.setLocationRelativeTo(null);

        // email text field
        JTextField email_login = new JTextField("email");
        email_login.setBounds(Width/3 -75, Height/4 +5, 250, 50);
        email_login.setBackground(Color.pink);
        email_login.setHorizontalAlignment(email_login.CENTER);
        Log_Window.add(email_login);
        // delete text when selected
        email_login.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e){
                if (email_login.getText().equals("email")) {
                    email_login.setText("");
                }
            }
            @Override
            public void focusLost(FocusEvent e) {
                if (email_login.getText().isEmpty()){
                    email_login.setText("email");
                }
            }
        });

        // password text field
        JPasswordField password = new JPasswordField("password");
        password.setBounds(Width/3 -75, Height/2 -5, 250, 50);
        password.setBackground(Color.pink);
        password.setHorizontalAlignment(password.CENTER);
        Log_Window.add(password);
        // delete text when selected
        password.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e){
                if (password.getText().equals("password")) {
                    password.setText("");
                }
            }
            @Override
            public void focusLost(FocusEvent e) {
                if (password.getText().isEmpty()){
                    password.setText("password");
                }
            }
        });

        // submit button
        JButton Submit = new JButton("submit");
        Submit.setBounds(Width/3 , Height - 125, 100, 50);
        Submit.setBackground(Color.red);
        Log_Window.add(Submit);

        // back button
        JButton Back = new JButton("go back");
        Back.setBounds(Width/3, Height/15, 100, 50);
        Back.setBackground(Color.red);
        Log_Window.add(Back);
        // action listener for back button
        Back.addActionListener(e -> {
            Log_Window.dispose();
            new LoginWindow();
        });

    }
}
