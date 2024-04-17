package day09_a_scanner;

import java.util.Scanner;

public class Angles {

    public static void main(String[] args) {


//         double num1, num2, num3;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 3 angles numbers: ");
        double num1 = input.nextDouble(),
               num2 = input.nextDouble(),
               num3 = input.nextDouble();

        double total = num1 + num2 + num3;

        boolean isTriangle = total == 180,
                isCircle = total == 360;

        System.out.println("The angles make up a triangle: " + isTriangle);
        System.out.println("The angles make up a circle: " + isCircle);





    }
}
