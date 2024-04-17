package day08_scanner_logical_operators;

public class LogicalOperators {

    public static void main(String[] args) {

        int n = 20;

        System.out.println(n > 5); //output --> true
        System.out.println(n < 10); //output --> false


        //Check if smth is in the range
        //When we want to do a statement of two unrelated things

        System.out.println(n > 5 && n < 10); //output false, check if both conditions are true, if 1st one is true proceeds tp execute 2n condition

        System.out.println(4 > 3 || false);
                            //true || false -->true
        System.out.println(3>4 || false);

                            //false || false --> false

        System.out.println(!true);//false


        System.out.println(4!=4); //not equal output --> false
        //four is not equal to four --> false

        System.out.println(!(4!=4)); // output --> true




    }
}
