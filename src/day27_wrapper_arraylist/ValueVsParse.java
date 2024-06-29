package day27_wrapper_arraylist;

public class ValueVsParse {

    public static void main(String[] args) {

        //Convert String to primitive data type int
        String s = "30";
        int num = Integer.parseInt(s);
        System.out.println(num);


        //Convert String into a Wrapper Class//non-primitive/object type
        Integer num2 = Integer.valueOf(s);
        int num3 = Integer.valueOf(s);
        /*
            Integer.valueOf(s); -- > converts String "30" into Integer Object(Integer Wrapper Class Object)
            int num3 = Integer.valueOf(s); --> I am trying to store the value into a primitive variable

            primitive = object type --> also called "UNBOXING" going from Integer Wrapper class object type to primitive int

         */
        System.out.println(num3);
        System.out.println(num2);

        Integer num4 = Integer.parseInt(s);
        /*
            Integer.parseInt(s); --> converting String "30" into a primitive data type [int]
            Integer num4 = --> I am trying to store the value an Integer type (Wrapper Class Object)
         */


    }
}
