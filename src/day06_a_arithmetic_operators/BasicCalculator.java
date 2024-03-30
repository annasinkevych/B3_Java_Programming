package day06_a_arithmetic_operators;

public class BasicCalculator {

    public static void main(String[] args) {
        double num1 = 7, num2 = 5;

        double addition = num1 + num2;
        double subtraction = num1 - num2;
        double multiplication = num1 * num2;
        double division = num1/num2;
        double remainder = num1 % num2; //modulus - whatever is not divisible will be the remainder sp if 7/5 - 5 is stores 1 time then 7-5 = 2

        //TODO:

        System.out.println(addition);
        System.out.println(subtraction);
        System.out.println(multiplication);
        System.out.println(division);
        System.out.println(remainder);


        /*
        13/5 = remainder 3
         */

        System.out.println(3.2 + 1); //prints 4.2 - the result is the biggest datatype

        int a = 3;

        double d = 4;

        System.out.println(a+d); //output 7.0

        byte b =3;
        short s = 7;
        System.out.println(b+s); //by default the compiler will interpret it as an int

        byte b2 = 3;
        short s2 = 7;

        short total = (short)(b2 + s2); //since by default the compiler will interpret it as an int, we need type casting




    }
}
