// import hashmap
import javax.swing.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.regex.*;

public class Password_Storage {

    // hashmap to store the password and username for login
    protected HashMap<String,String> LoginInfo = new HashMap<String,String>();

    // add to hashmap and checking valid input
    public void addLoginInfo(JTextField username,JPasswordField password){

    }

    // check for valid login credentials to add from creation screen
    public List<Boolean> checkValidCreation(JTextField username, JPasswordField password, JPasswordField confirm_password){
        // check for a valid username field
        boolean validName = true;
        String[] invalidChars = {"~","`","!","@","#","$","%","^","&","*","(",")","-","_","=","+","{","[","}","]","|",":",";","'",",","<",">",".","?","/"," "};
        for (String invalidChar : invalidChars) {
            for (int j = 0; j < username.getText().length(); j++) {
                if (username.getText().split("")[j].equals(invalidChar))
                    validName = false;
            }
        }
        if (username.getText().length() < 6 || username.getText().length() > 30)
            validName = false;

        // check if password is valid (using regex to check for valid passwords
        boolean validPassword = true;
        String requirments = "^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])" + "(?=\\S+$).{8,20}$";
        Pattern required = Pattern.compile(requirments);
        if (password == null){
            validPassword = false;
        }
        assert password != null;
        Matcher match = required.matcher(password.toString());
        validPassword = match.matches();

        // check if confirm password is valid
        boolean validConfirmPassword = false;
        if (confirm_password == password)
            validConfirmPassword = true;

        // the rest of the stuff
        List<Boolean> validList;
        validList = Arrays.asList(validName, validPassword, validConfirmPassword);
        return validList;
    }
}
