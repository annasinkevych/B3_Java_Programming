package day15_string;
import java.util.*;

public class Filter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please, enter a message.");
        String message = input.nextLine().trim().toLowerCase();

        System.out.println(message);

        boolean hasBadWords = message.contains("java is bad") || message.contains("quit") || message.contains("have fun") || message.contains("crying");

        if (hasBadWords) {
            System.out.println("Message failed to be sent");
        } else
            System.out.println(message + " was sent");
    }
}