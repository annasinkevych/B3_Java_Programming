package day04_variables;

public class PrimitiveDataTypes {

    /*Data Types:
               Primitive Data Types - total 8:
                                    integer types: byte - short - int - long
                                    floating types: float - double
                                    character: char
                                    true/false: boolean
                Non-primitive Data Types - unlimited:
                                    String: Multiple carachters
                                    Arrays
                                    Classes
                                    Interface
                            ***compiler uses int and double by default

    */


    public static void main(String[] args) {

        //***compiler uses int and double by default
        System.out.println(5);
        System.out.println(5.6);

        byte age = 60;
        System.out.println("age");//prints age
        System.out.println(age);//prints 60


        short year; //declare a variable called year
        year = 2024;// I have assigned a value to this variable

        System.out.println(year);

        long bigNumber;
        bigNumber = 9534663465633L; // adding L to the end of number, tells the compiler it is a long number
    }
}
