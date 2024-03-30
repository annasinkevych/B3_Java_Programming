package day02_print_statements;

public class Shapes {

    public static void main(String[] args) {


//        for(int i = 1; i<=5; i++)
//        {
//            for(int j = 1; j<=i; j++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }

        for(int i = 0; i< 5; i++)
        {
            for(int j = 5; j>i; j--)
            {
                System.out.print(" ");
            }
            for(int k = 0; k<= i; k++)
            {
                System.out.print("* ");
            }
            System.out.println();

        }
//        System.out.println("*");
//        System.out.println("**");
//        System.out.println("***");

    }
}
