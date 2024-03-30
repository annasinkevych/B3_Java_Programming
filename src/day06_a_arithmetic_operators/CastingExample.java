package day06_a_arithmetic_operators;

public class CastingExample {

    public static void main(String[] args) {
        int num1 = 40;
        float num2 = num1;

        //type of conversion, implicit - automatic

        System.out.println(num1);
        System.out.println(num2); //add a decimal .0


        float num3 = 10.5F;
        //short num4 = num3; //gives an error because short is smaller than float, we need casting - manual conversion(explicit)
        short num4 = (short)num3;

        System.out.println(num3);
        System.out.println(num4);

    }
}
