package day13_string;

public class StringMethods {

    public static void main(String[] args) {

        String name = "Micky";
        String name2 = "Micky";

        String name3 = new String("Micky");

        // returns true as this operator compares the memory location
        System.out.println(name == name2);
        System.out.println(name == name3);


        //How about if I want to compare the values of strings

        //.equals

        System.out.println(name.equals(name2)); //true
        System.out.println(name.equals(name3)); //true

        System.out.println(name.equals(new String("Micky"))); //true
        System.out.println("Micky".equals(name2)); //true

        System.out.println("LoopCamp".equals("loopcamp")); //returns false because different case

        //there is a method that ignores the case
        System.out.println("LoopCase".equalsIgnoreCase("loopcase")); //returns true


        boolean compareNames = name.equals(name2);
        System.out.println("compareNames = " + compareNames); //returns true

        int numberOfChars = name.length();

        System.out.println("numberOfChars = " + numberOfChars); //returns integer 5

    }
}
