package day08_scanner_logical_operators;

public class SignType {

    public static void main(String[] args) {
        int number = 4;

        boolean isPositive = number > 0,
                isNegative = number < 0,
                isZero = number == 0;

        System.out.println("isPositive = " + isPositive);
        System.out.println("isNegative = " + isNegative);
        System.out.println("isZero = " + isZero);




    }
}
