package day14_string;
import java.util.Scanner;

public class Website {

    public static void main(String[] args) {

        Scanner input  = new Scanner(System.in);
        System.out.println("Please enter a website: ");
        String url = input.next().toLowerCase(); //changes the input all to lowercase to ensure no mistake is entered by the user

        boolean isValidStart = url.startsWith(("www.")); //returns boolean true
        boolean isValidEnd = url.endsWith(".com") || url.endsWith(".edu") || url.endsWith(".gov") || url.endsWith(".net") || url.endsWith(".io"); //also returns true
        System.out.println(isValidStart);


        if(isValidEnd && isValidStart)
        {
            System.out.println("It is a va;id website.");
        }
        else{
            System.out.println("It is invalid website.");

            if(!isValidStart)
            {
                System.out.println("It was invalid part");
            }

            if(!isValidEnd)
            {
                System.out.println("It was invalid end");
            }
        }
    }
}
