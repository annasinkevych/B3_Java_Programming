package day20_nested_loop;

import java.util.*;

public class PrimeInRange {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number to check all the numbers to that and find primes");
        int num = input.nextInt();


        for (int i = 2; i <= num; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if ((i % j == 0)) {
                    count++;
                }
            }
            if (count == 2)
            {
                System.out.print(i + ", ");
            }

        }
    }
}
