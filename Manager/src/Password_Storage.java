// import hashmap
import javax.swing.*;
import java.util.HashMap;
public class Password_Storage {

    // hashmap to store the password and username for login
    protected HashMap<String,String> LoginInfo = new HashMap<String,String>();

    // constructor to set up variables

    // add to hashmap and checking valid input
    public void addLoginInfo(JTextField username,JPasswordField password){

    }

    // check for valid login credentials to add from creation screen
    public boolean checkValidCreation(JTextField username,JPasswordField password,JPasswordField confirm_password){
        boolean validName = true;
        // check for a valid username field
        String[] invalidChars = {"~","`","!","@","#","$","%","^","&","*","(",")","-","_","=","+","{","[","}","]","|",":",";","'",",","<",">",".","?","/"," "};
        for (String invalidChar : invalidChars) {
            for (int j = 0; j < username.getText().length(); j++) {
                if (username.getText().split("")[j].equals(invalidChar)) {
                    System.out.println(username.getText().split("")[j]);
                    validName = false;
                }
            }
        }
        if (username.getText().length() < 6 || username.getText().length() > 30)
            validName = false;
        System.out.println(validName);
        // check if password is valid

        // check if confirm password is valid
        return validName;
    }
}
