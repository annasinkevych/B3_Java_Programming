package day10_if_statements;

public class IfWithoutBrackets {
    public static void main(String[] args) {

        if(4 > 2)
        {
            System.out.println("Hello");
            System.out.println("Bye");
        }

        if(1 > 2)
            System.out.println("Hello2"); //you can only do this with 1 statement


        if(10 % 5 == 0)
            System.out.println("Divisible");
        else
            System.out.println("Not Divisible");

        if( 5 > 2 )
            System.out.println("Loopcamp");
        else {
            System.out.println("Loopcamp2");
            System.out.println("loopcamp3");
        }

//        if( 5 > 2 )
//            System.out.println("Loopcamp");
//            System.out.println("loopcamp3");
//        else //thius line gives an error 'else' without 'if'
//            System.out.println("Loopcamp2");

//        if( 5 > 2 ){
//            System.out.println("Loopcamp");
//            System.out.println("loopcamp3");}
//        else //thius line gives an error 'else' without 'if'
//            System.out.println("Loopcamp2");
//





    }
}
