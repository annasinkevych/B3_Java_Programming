package day05_variables;

public class RecapVariables {
    public static void main(String[] args)
    {

        /*
            hello1@ - invalid var name because it can't have any other special characters than $
            12 test - Cannot start with numbers
            $public - valid
            _34hello - valid
            staticTest - valid
            static-  cannot use java key words



         */
        //Declare variables
        byte numberOfCoffeeCups;
        double totalPriceOfCoffee;
        int totalNumberOfStudentsInClass;

        //assign values
        numberOfCoffeeCups =10;
        totalPriceOfCoffee = 10.25;
        totalNumberOfStudentsInClass = 100;

        System.out.println(numberOfCoffeeCups);
        System.out.println(totalPriceOfCoffee);
        System.out.println(totalNumberOfStudentsInClass);

        System.out.println(numberOfCoffeeCups + "*" + totalNumberOfStudentsInClass);


        //declare and assign
        double temperature = 74.5;
        int javaDay = 5;
        System.out.println("Today the temperature was " + temperature);
        System.out.println("It is Day " + javaDay + " in Java class.");

    }

}
