package day11_if_statements;

public class TernaryExample {
    public static void main(String[] args) {
        int a = 4;
        String evenOrOdd;

        if(a %2 == 0)
        {
            evenOrOdd = "Even";
        }
        else
        {
            evenOrOdd = "Odd";
        }
        System.out.println("The number is: " + evenOrOdd);

        //OR APPROACH #2 with a ternary operator

        evenOrOdd = (a%2 == 0) ? "Even" : "Odd"; //variable = (condition) ? true : false;

        System.out.println("The number is: " + evenOrOdd);

        //next

        int num = -4;
        String posOrNeg;

        posOrNeg = (num >= 0) ? "Positive" : "Negative";
        System.out.println(posOrNeg);



        int time = 12;
        double price;

        if(time >= 10 && time <= 15)
        {
            price = 7.99;
        } else
            price = 10.99;

        //using ternary operator
        price = (time >= 10 && time <= 15) ? 7.99 : 10.99;


    }
}
