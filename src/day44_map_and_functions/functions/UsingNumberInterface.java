package day44_map_and_functions.functions;

public class UsingNumberInterface {

    public static void main(String[] args) {
        //                          Lambda Expression () ->
        NumberInterface evenOrOdd = (number) -> {
            //this is the implementation of the abstract method in the functional interface using Lambda expression ---> Implementation can be declared whenever we need it not just a child concrete class
            //as per regular interface
            if(number %2 ==0){
                System.out.println(number + "  is even");
            }
            else
            {
                System.out.println(number + "  is odd");

            }
        };


        NumberInterface cuber = (n) -> {
            System.out.println(n * n *n);
        };
        cuber.apply(5);

        //or like this if we only have 1 statement
        NumberInterface square = value -> System.out.println(value * 4);
        square.apply(5);


    }
}
