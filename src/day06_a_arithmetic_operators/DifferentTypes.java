package day06_a_arithmetic_operators;

public class DifferentTypes {

    public static void main(String[] args) {

        //both int
        System.out.println(10-5); //result will be int
        System.out.println(10*5); //result will be int

        //double and int ---> will become double
        System.out.println(10.0 /5); //output 2.0


        //double & double --->
        System.out.println(10.0 /2.0); //--->5.0

        //int and double
        System.out.println(10/5.0); //---> 2.0

        System.out.println(((int) (10.0/5.0)));
    }
}
