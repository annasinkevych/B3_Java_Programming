package day19_nested_loops;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        boolean isPrime = true;
        Scanner key = new Scanner(System.in);
        int num = key.nextInt();
        for(int i = 2; i < num/2; i++)
        {
            if(num % i == 0)
            {
                isPrime = false;
                break;
            }
        }
        //or
        /*
        int count = 0;
        for(int i = 1; i <=num; i++)
        {
           if(num % i ==0)
                count++; //the reason we check for count is because prime number can only be divisible two times
        }

        if(count != 2)
            isPrime = false;
         */

        if(isPrime)
            System.out.println(num + " is a PRIME NUMBER");
        else
            System.out.println(num + " is NOT a PRIME NUMBER");
    }
}
