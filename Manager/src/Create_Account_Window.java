import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.List;

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

        // panel above email
        JLabel usernameLabel = new JLabel();
        usernameLabel.setForeground(Color.RED);
        usernameLabel.setBounds(Width/3-100, Height/4-60, 400, 50);
        usernameLabel.setBackground(Color.gray);
        Create_Window.add(usernameLabel);

        // email text field
        JTextField email_login = new JTextField();
        email_login.setDocument(new CharacterLImit(30));
        email_login.setText("username");
        email_login.setBounds(Width/3 -75, Height/4 -20, 250, 50);
        email_login.setBackground(Color.gray);
        email_login.setHorizontalAlignment(email_login.CENTER);
        Create_Window.add(email_login);

        //Password_Storage checking for the instance of the window
        Password_Storage Check = new Password_Storage();

        // delete text when selected
        email_login.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e){
                if (email_login.getText().equals("username")) {
                    email_login.setText("");
                }
            }
            @Override
            public void focusLost(FocusEvent e) {
                if (email_login.getText().isEmpty()){
                    email_login.setText("username");
                }
            }
        });

        // back button
        JButton Back = new JButton("go back");
        Back.setBounds(Width/3, Height/15 -5, 100, 50);
        Back.setBackground(Color.white);
        Create_Window.add(Back);
        // action listener for back button
        Back.addActionListener(e -> {
            Create_Window.dispose();
            new LoginWindow();
        });

        // panel above email
        JLabel passwordLabel = new JLabel();
        passwordLabel.setForeground(Color.RED);
        passwordLabel.setBounds(Width/3-100, Height/4-60, 400, 50);
        passwordLabel.setBackground(Color.gray);
        Create_Window.add(usernameLabel);

        // password text field
        JPasswordField Password = new JPasswordField();
        Password.setEchoChar((char)0);
        Password.setBounds(Width/3 -75, Height/2 -50, 250, 50);
        Password.setBackground(Color.gray);
        Password.setDocument(new CharacterLImit(20));
        Password.setText("password");
        Password.setHorizontalAlignment(Password.CENTER);
        Create_Window.add(Password);
        // delete text when selected
        Password.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                String passText = new String(Password.getPassword());
                if (passText.equals("password")) {
                    Password.setText("");
                }
                Password.setEchoChar('*');
            }

            @Override
            public void focusLost(FocusEvent e) {
                String passText = new String(Password.getPassword());
                if (passText.isEmpty()) {
                    Password.setText("password");
                    Password.setEchoChar((char)0);
                }
        }
        });

        // confirm password test field
        JPasswordField Confirm_Password = new JPasswordField();
        Confirm_Password.setEchoChar((char)0);
        Confirm_Password.setDocument(new CharacterLImit(20));
        Confirm_Password.setText("confirm password");
        Confirm_Password.setBounds(Width/3 -75 , Height - 200,  250, 50);
        Confirm_Password.setBackground(Color.gray);
        Confirm_Password.setHorizontalAlignment(Password.CENTER);
        Create_Window.add(Confirm_Password);
        // delete text when selected
        Confirm_Password.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e){
                String passfield = new String(Confirm_Password.getPassword());
                if (passfield.equals("confirm password")) {
                    Confirm_Password.setText("");
                }
                Confirm_Password.setEchoChar('*');
            }
            @Override
            public void focusLost(FocusEvent e) {
                String passfield = new String(Confirm_Password.getPassword());
                if (passfield.isEmpty()){
                    Confirm_Password.setText("confirm password");
                    Confirm_Password.setEchoChar((char)0);
                }
            }
        });

        // submit button
        JButton Submit = new JButton("submit");
        Submit.setBounds(Width/3 , Height - 125, 100, 50);
        Submit.setBackground(Color.white);
        Create_Window.add(Submit);
        Submit.addActionListener(e ->{
            List<Boolean> validList = Check.checkValidCreation(email_login, Password, Confirm_Password);
            if (!validList.get(0)){
                usernameLabel.setText("only letters and numbers / must be at least 6 characters");
            if (!validList.get(1))
                passwordLabel.setText("must have");
            }
        });
    }
}
