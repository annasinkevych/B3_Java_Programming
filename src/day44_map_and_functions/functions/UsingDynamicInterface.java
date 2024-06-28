package day44_map_and_functions.functions;

public class UsingDynamicInterface {
    public static void main(String[] args) {

        //implementation of the Dynamic Interface
        DynamicInterface <String> printEachChar = (word) -> {
            for (int i = 0; i < word.length(); i++) {
                System.out.println(word.charAt(i));
            }
        };

        printEachChar.test("loopcamp");

        DynamicInterface <Integer> printNumbersTimes = (n) -> {
            for (int i = 0; i < 5 ; i++) {
                System.out.println(n);
            }
        };
        printNumbersTimes.test(5);


    }
}
