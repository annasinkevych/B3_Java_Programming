package day40_exceptions.learn_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThirdTry {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{


            System.out.println("Enter a number: ");
            int userNum = input.nextInt(); //InputmismatchException

            System.out.println("Enter another number: ");
            int userNum2 = input.nextInt();//InputmismatchException

            System.out.println(userNum/userNum2); //Arithmetic exception
        }
        catch(InputMismatchException e){
            e.printStackTrace();//show me the exception in details in Console
        }
        catch(ArithmeticException e){
            e.printStackTrace();//java.lang.ArithmeticException: / by zero
                                //at day40_exceptions.learn_exception.ThirdTry.main(ThirdTry.java:18)
            System.out.println(e.getMessage());/// by zero
            System.out.println("Now I am here");
        }finally{ //this block will always run after try catch, we need it for example to close the Scanner object
            System.out.println("Finally Block");
            input.close();
        }

    }
}
