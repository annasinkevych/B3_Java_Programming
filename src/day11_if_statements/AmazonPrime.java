package day11_if_statements;

public class AmazonPrime {

    public static void main(String[] args) {

        double price = 15.99;
        boolean hasPrime = false;

        boolean freeShipping;

        if(hasPrime)
        {
            System.out.println("Eligible for 2 days free shipping");
        }
        else
        {
           if(price > 25)
           {
               System.out.println("You are still eligible for prime shipping even without Prime Membership");
           }
           else
           {
               System.out.println("You are not eligible for free 2 day shipping. Total price including shipping fee is: " + price + 3.99);
           }
        }






    }
}
