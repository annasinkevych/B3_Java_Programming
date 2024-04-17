package day08_scanner_logical_operators;

public class OrPractice {

    public static void main(String[] args) {
        int apples = 5;
        int oranges = 10;

        System.out.println(apples > 1 || oranges < 5);
                           // true    || false  --> true
        System.out.println(apples > 10 || oranges == 10);
                           // false || true --> true

        System.out.println(apples > 10 && oranges == 10);
                           // false && true --> false

        //Since we use && and 1st part is false, it won't proceed to check the other side as it will automatically be false
        //because only true && true can give TRUE

        //With || if 1st is true it automatically returns true , because for || condition to be true only 1 side has to return true, because only false || false give FALSE

        System.out.println(apples > 10 && oranges == 10 || (true & true)); //statement code in parentheses is alwsy executed first
    }
}
