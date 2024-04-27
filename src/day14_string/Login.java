package day14_string;

import java.util.*;

public class Login {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        String expectedPassword = "loopcamp!",
               expectedUsername = "java";

        System.out.println("Please, enter your username: ");
        String username = key.next();
        //username = username.toLowerCase();
        System.out.println("Please, enter your password: ");
        String passwordFromUser = key.next();

        //check if the passcode is more than 8 chars long
        if(passwordFromUser.length()>8 && expectedPassword.equals(passwordFromUser) && expectedUsername.equalsIgnoreCase(username))
        {
            System.out.println("Logged in");
        }


    }
}
