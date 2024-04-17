package day12_switch_statements;

import java.util.Scanner;

public class Browser {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your browser");
        String browserType = input.next();

        switch (browserType) {
            case "Chrome":
            case "chrome":
                System.out.println("Opening Google in Chrome");
                break;
            case "Safari":
            case "safari":
                System.out.println("Opening Google in Safari");
                break;
            case "FireFox":
            case "firefox":
                System.out.println("Opening Google in FireFox");
                break;
            case "Edge":
            case "edge":
                System.out.println("Opening Google in Edge ");
                break;
            default:
                System.out.println("We do not have " + browserType + " browser type or it is invalid name");


        }
    }
}
