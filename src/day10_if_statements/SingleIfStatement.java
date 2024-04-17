package day10_if_statements;

public class SingleIfStatement {

    public static void main(String[] args)
    {
        //anything between curly braces is called a code block or a method block

        //if if condition is true then it executes the block of code

        //breakpoint is running in debug mode, you can test your code and see the output to ensure you are



        if(false) //is not executed as the condition is alwasy false
        {
            System.out.println("Hello World");
        }



        int score = 60;

        if(score >=75)
        {
            System.out.println("Passing the exam!");
        }

        if(score < 75)
        {
            System.out.println("Failing the exam");
        }

        int year = 2020;

        boolean lockdown = year == 2020 || year == 2021;

        if(lockdown)
        {
            System.out.println("Stay at home");
        }



    }
}
