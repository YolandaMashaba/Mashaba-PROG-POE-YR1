package rc;

import javax.swing.JOptionPane;

/**
 *
 * @author Mashaba Yolanda Nkoka [ST10458688]
 */
public class Login {

    //Instance variables for full name, last name, username and password
    private String full_name;
    private String last_name;
    private String username;
    private String password;

    //Default constructors for each instance variable 
    public Login() {
        this.full_name = "";
        this.last_name = "";
        this.username = "";
        this.password = "";
    }

    //Accessor methods/ getters for each instance variable
    public String get_full_name() {
        return this.full_name;
    }

    public String get_last_name() {
        return this.last_name;
    }

    public String get_username() {
        return this.username;
    }

    public String get_password() {
        return this.password;
    }

    //Mutator methods/setters for each instance variable
    public void setfull_name(String full_name) {
        this.full_name = full_name;
    }

    public void setlast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setusername(String username) {
        this.username = username;
    }

    public void setpassword(String password) {
        this.password = password;
    }

    //Create method to check username
    public boolean check_username() {
        boolean underscore = username.contains("_");
        if (username.length() <= 5 && underscore == true) {
            return true;
        } else {

            return false;
        }

    }

    //Method to check password complexity
    public boolean check_password_complexity() {
        boolean uppercase_letter = password.matches(".*[A-Z].*");
        boolean special_char = password.matches(".*[!@|#$~%^&*()-+?./<>{}].*");
        boolean number = password.matches(".*[0-9].*");
        boolean lowercase_letter = password.matches(".*[a-z].*");
        if (password.length() >= 8 && uppercase_letter == true && special_char == true && number == true && lowercase_letter == true) {
            return true;
        } else {
        }
        return false;

    }

    //Method to register user
    public String register_user() {
        String register_user = "";
        boolean check_username = this.check_username();
        boolean check_password_complexity = this.check_password_complexity();
        if (check_username && check_password_complexity) {
            register_user = "";
        } else {
        }
        return register_user;

    }

    public boolean login_user() {
        boolean login_user = false;
        boolean check_username = this.check_username();
        boolean check_password_complexity = this.check_password_complexity();
        if (check_username && check_password_complexity) {
            login_user = true;
           
        } else {
        }
        return false;
    }
    
    public String return_login_status() {
        String return_login_status = "";
        boolean login_user = this.login_user();
        if (login_user == true) {
            
        }else{
            
        }
        return return_login_status;
    }

}
