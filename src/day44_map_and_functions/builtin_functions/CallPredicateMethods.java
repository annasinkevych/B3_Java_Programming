package day44_map_and_functions.builtin_functions;


public class CallPredicateMethods {
    public static void main(String[] args) {
        boolean b = UsePredicate.isPalindrome.test("racecar");

        System.out.println(b);

        System.out.println(UsePredicate.isPrime.test(7));
        System.out.println(UsePredicate.isPrime.test(8));
    }
}
