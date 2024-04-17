package day07_relational_operators;
import java.util.Scanner; //import the Scanner class

public class RelationalOperators {

    public static void main(String[] args) {

        int num1,num2;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter the 1st value:\n");
        num1 = userInput.nextInt();
        System.out.println("Please enter the 2n value:\n");
        num2 = userInput.nextInt();



//        System.out.println(10<5);
//        System.out.println(10>5);
//
//        System.out.println(50<=100);
//        System.out.println(50>=100);
//
//        System.out.println(4 == 4); //returns true
//        System.out.println(5 != 10); //returns true
//
//        int a = 3,
//            b = 10;
        boolean value = num1>=num2;

//        System.out.println(value);

        if(value)
        {
            System.out.println("Great");
        }
        else
            System.out.println("Oops");
    }
}
