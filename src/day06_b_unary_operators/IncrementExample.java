package day06_b_unary_operators;

public class IncrementExample {

    public static void main(String[] args) {

        int x = 0;

        System.out.println(x);

        x = x +1;

        System.out.println(x);

        x++; // POST INCREMENT - increases it by only one to 2

        ++x; //PRE INCREMENT - increases it by only one
        System.out.println(++x); //printed 4 because it is pre - incrementing it, will increase it first and then print the value
        System.out.println(x++); //here we print the value already stored in x and then post - increment, so next output of x will already be incremented
        System.out.println(++x); //outputs 6

    }
}
