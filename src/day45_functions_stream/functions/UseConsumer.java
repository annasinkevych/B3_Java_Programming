package day45_functions_stream.functions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class UseConsumer {
    public static void main(String[] args) {

        //this is the implementation of the Consumer functional interface
        Consumer<Integer> printN = n -> { //7 -->  1, 2, 3, 4, 5, 6, 7
            for (int i = 1; i <=n; i++) {
                System.out.print(i + " ");
            }
        };

        //since I am in the same class and calling that function from same class i do not
        //need to user the interfaceName.
        printN.accept(7); //accept(T t) - abstract method defined in the Consumer functional interface
        System.out.println("\n--------------------------------");

        //Consumer functional interface accepts String now as it can accept any object type --> T
        Consumer<String> printN2 = n -> {};

        List<String> list = new ArrayList<>(Arrays.asList("Hello", "Java", "Summer", "Winter", "Pool"));
        list.forEach( e -> System.out.println(e)); //Consumer<? super T> action =  e -> System.out.println(e);

        // list.forEach --- > loops through all your collection and get each element one by one
        // e -> System.out.println(e) -- > is Consumer <T>
        // e - once getting each element, it assigns it into "e"
        // System.out.println(e) - Lambda expression body / implementation ---  which is just print statement

        list.forEach(e -> {
            System.out.println(e.charAt(0) + " " + e.charAt(e.length()-1));
        });

        list.forEach(e -> {
            if (e.length() > 4){
                System.out.println(e);
            }
        });
    }
}
