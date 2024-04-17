package day10_if_statements;

public class IfElseExample {

    public static void main(String [] args)
    {


        //if else statement is a control flow statement

        int score = 75;

        if(score >= 75)
        {
            System.out.println("Passing the exam");

        }
        else
        {
            System.out.println("Failing the exam");
        }

        if(score > 90) {
            System.out.println("Excellent");
        }else {System.out.println("Keep Working");}


        int year = 2022;

        boolean lockdown = year == 2020 || year == 2021;

        if(lockdown)
        {
            System.out.println("Stay at home");
        }else{
            System.out.println("Go outside");
        }

    }
}
