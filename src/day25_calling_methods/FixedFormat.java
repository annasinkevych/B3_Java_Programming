package day25_calling_methods;


//imported a class from another package
import my_utilities.StringUtil; //or import my_utilities.*;

public class FixedFormat {

    public static void main(String [] args)
    {
        System.out.println(fixFormat("hOla"));//calling method that is in the same class as this main method

        //now calling a method from a different class and different package

        System.out.println(StringUtil.fixFormat("kDfl"));
    }

    public static String fixFormat(String words)
    {
        String result = "";
        result = words.substring(0,1).toUpperCase() + words.substring(1).toLowerCase();
        return result;
    }
}
