package day33_b_encapsulation;

import day30_b_custom_classes.People;

import javax.print.DocFlavor;

public class Login {

    private String username;
    private String password;

    public Login(String username, String password) {
        this.username = username;
        setPassword(password);
    }

    public void loginInfo() {
        System.out.println(username);
        System.out.println(password);
    }

    public void setPassword(String password) {
        if (password.length() >= 8 && (password.contains("!") || password.contains("_") || password.contains("%")))
        {
            this.password = password;

        }
    }

    public String getPassword(String username)
    {
        if(username.equalsIgnoreCase(this.username))
            return password;

        return "WRONG_USERNAME";
    }

}
